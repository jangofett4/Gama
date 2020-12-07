using System;
using System.Collections.Generic;

using Gama.Interop;
using Gama.Types;

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp.Interop;
using System.Linq;

namespace Gama.Compiler.Units
{
    public class GamaExpressionCompiler : GamaBaseVisitor<GamaValueRef>
    {
        public GamaFunctionCompiler Parent { get; set; }

        public Stack<GamaTypeRef> TargetTypeStack { get; set; }
        public Stack<bool> LoadStack { get; set; }
        /* This is NOT the call stack you think it is.                  */
        /* This one is mainly used to sort and resolve ambiguous calls  */
        public Stack<GamaFunctionList> CallStack { get; set; }

        public GamaExpressionCompiler(GamaFunctionCompiler parent)
        {
            Parent = parent;
            TargetTypeStack = new Stack<GamaTypeRef>();
            LoadStack = new Stack<bool>();
            CallStack = new Stack<GamaFunctionList>();
        }

        /* Value load manipulators  */
        public void PushLoad(bool load) => LoadStack.Push(load);
        public bool PopLoad() => LoadStack.Pop();
        public bool TopLoad => LoadStack.Peek();
        public bool IsEmptyLoad => LoadStack.Count == 0;

        /* Target type manipulators */
        public void PushTT(GamaTypeRef type) => TargetTypeStack.Push(type);
        public GamaTypeRef PopTT() => TargetTypeStack.Pop();
        public GamaTypeRef TopTT => TargetTypeStack.Peek();
        public bool IsEmptyTT => TargetTypeStack.Count == 0;

        /* Call stack manipulators  */
        // This system will be the end of me, because even if there is no calls; expressions will push function lists to stack
        // This will eventually make the stack overflow, I can't really stop it from happening, compiler will complain about null expression but nothing can be done.
        // TODO: think about a new call system, maybe inherit FunctionList from Value so that it can be passed around expression compiler easily? (yes)
        public void PushCall(GamaFunctionList list) => CallStack.Push(list);
        public GamaFunctionList PopCall() => CallStack.Pop();
        public GamaFunctionList TopCall() => CallStack.Peek();
        public bool IsEmptyCall => CallStack.Count == 0;

        public GamaValueRef Reference { get; set; }

        /* Used for debugging */
        public override GamaValueRef Visit(IParseTree tree)
        {
            return base.Visit(tree);
        }

        public override GamaValueRef VisitExprParenthesis([NotNull] GamaParser.ExprParenthesisContext context)
        {
            return Visit(context.expr());
        }

        public override GamaValueRef VisitExprLiteralInteger([NotNull] GamaParser.ExprLiteralIntegerContext context)
        {
            return new GamaValueRef(InstanceTypes.I32, LLVMValueRef.CreateConstInt(InstanceTypes.I32.UnderlyingType, ulong.Parse(context.IntegerLiteral().GetText())), false);
        }

        public override GamaValueRef VisitExprLiteralFloating([NotNull] GamaParser.ExprLiteralFloatingContext context)
        {
            return new GamaValueRef(InstanceTypes.F32, LLVMValueRef.CreateConstReal(InstanceTypes.F32.UnderlyingType, float.Parse(context.FloatingLiteral().GetText().Replace('.', ','))), false);
        }

        public override GamaValueRef VisitExprLiteralBoolean([NotNull] GamaParser.ExprLiteralBooleanContext context)
        {
            return new GamaValueRef(InstanceTypes.Bool, LLVMValueRef.CreateConstInt(InstanceTypes.Bool.UnderlyingType, context.GetText() == "true" ? 1ul : 0ul), false);
        }

        public override GamaValueRef VisitExprLiteralString([NotNull] GamaParser.ExprLiteralStringContext context)
        {
            var str = context.StringLiteral().GetText().Trim('"');
            // super ineffective string escape creator
            str = str.Replace("\\n", "\n").Replace("\\t", "\t").Replace("\\r", "\r").Replace("\\a", "\a");
            int len = str.Length;
            var elems = new LLVMValueRef[len + 1];
            for (int i = 0; i < len; i++)
                elems[i] = LLVMValueRef.CreateConstInt(LLVMTypeRef.Int8, str[i]);
            elems[len] = LLVMValueRef.CreateConstInt(LLVMTypeRef.Int8, 0);

            /* LLVM */
            var block = Parent.CurrentBlock;
            var builder = Parent.Builder;
            block.PositionBuilderAtEnd(builder);
            var vals = LLVMValueRef.CreateConstArray(LLVMTypeRef.Int8, elems);
            LLVMValueRef glbl;
            unsafe
            {
                glbl = LLVM.BuildGlobalStringPtr(builder, str.GetSbytePtr(), "gep".GetSbytePtr());
            }

            return new GamaValueRef(new GamaPointer(InstanceTypes.Char), glbl, false);
        }

        public override GamaValueRef VisitExprFQTN([NotNull] GamaParser.ExprFQTNContext context)
        {
            var names = context.fqtn().Symbol().Select(node => node.GetText()).ToArray();
            // Variables/Function
            if (names.Length == 1)
            {
                var val = Parent.Top.FindValueRecursive(names[0]);
                if (val == null)
                {
                    // If no target type is given
                    //if (IsEmptyTT)
                    //{
                    var list = Parent.NamespaceContext.FindFunctionRefGlobal(names);
                    if (list != null)
                        PushCall(list);
                    return null;
                    //}
                    /*
                    var target = TopTT;
                    if (target is GamaFunction fnty)
                    {
                        var fn = Parent.NamespaceContext.FindFunctionRefGlobal(names);
                        if (fn != null)
                        {
                            GamaFunctionRef cb;
                            // Not always return target type is available
                            // For example when searching for a callback, expression compiler might not set return type, only parameter types are necessary anyway
                            // But in case of delegates, return types are necessary too. 
                            if (fnty.ReturnType == null)
                                cb = fn.FindFunction(fnty.ParameterTypes);
                            else
                                cb = fn.FindFunction(fnty.ReturnType, fnty.ParameterTypes);

                            if (cb == null)
                            {
                                Parent.NamespaceContext.Context.AddError(new ErrorNoViableOverride(context));
                                return null;
                            }
                            return cb;
                        }
                    }
                    */
                    Parent.NamespaceContext.Context.AddError(new ErrorIdentifierNotFound(context));
                    return null;
                }

                /* LLVM */

                var block = Parent.CurrentBlock;
                var builder = Parent.Builder;

                // A load is happening?
                if (!IsEmptyLoad)
                {
                    if (!TopLoad)
                        return val;
                    // A load happaning.
                    if (val.Type is GamaPointer ptr)
                    {
                        block.PositionBuilderAtEnd(builder);
                        var load = builder.BuildLoad(val.Value);
                        return new GamaValueRef(ptr.BaseType, load, true); // Pointers are modifiable LValues
                    }

                    /* Code tried to load a non-pointer expression. Eg: *10, *some_function_pointer */
                    /* Function pointers are not loadable either                                    */
                    Parent.NamespaceContext.Context.AddError(new ErrorNonPointerLoad(context));
                    return null;
                }

                block.PositionBuilderAtEnd(builder);

                if (val.IsModifiableLValue) // Variable
                {
                    var load = builder.BuildLoad(val.Value);
                    return new GamaValueRef(val.Type, load, false);
                }

                // If its not a pointer and not a variable
                // Then it must be a parameter, If not god save me. TODO: test this theory later
                // Just send it
                return val;
                /* oh yah 80% it says
                // I hope this doesnt happen. I am 80% sure this won't hit.
                // You can never be sure enough:
    #if DEBUG
                Console.WriteLine("it happened");
    #endif
                Parent.NamespaceContext.Context.AddError(new ErrorNonPointerLoad(context));
                return null;
                */
            }
            // Functions/Types
            else
            {
                var fn = Parent.NamespaceContext.FindFunctionRefGlobal(names);

                if (fn == null)
                {
                    Parent.NamespaceContext.Context.AddError(new ErrorTypeMismatch(context));
                    return null;
                }

                if (IsEmptyTT)
                {
                    var list = Parent.NamespaceContext.FindFunctionRefGlobal(names);
                    if (list != null)
                        PushCall(list);
                    return null;
                }

                var target = TopTT;
                if (target == null)
                {
                    // This shouldn't happen, this time I'm 90% sure this won't hit
#if DEBUG
                    Console.WriteLine("yooooo");
#endif
                    return null;
                }

                if (!(target is GamaFunction fnty))
                {
                    Parent.NamespaceContext.Context.AddError(new ErrorTypeMismatch(context));
                    return null;
                }

                var cb = fn.FindFunction(fnty.ParameterTypes);
                if (cb == null)
                {
                    Parent.NamespaceContext.Context.AddError(new ErrorNoViableOverride(context));
                    return null;
                }

                return cb;
            }
        }

        public override GamaValueRef VisitExprFQMB([NotNull] GamaParser.ExprFQMBContext context)
        {
            PushLoad(false);
            var lexpr = Visit(context.expr());
            PopLoad();
            if (lexpr == null)
                return null;

            var block = Parent.CurrentBlock;
            var builder = Parent.Builder;
            block.PositionBuilderAtEnd(builder);

            var syms = context.Symbol().Select(s => s.GetText()).ToArray();
            Reference = lexpr; // for single fqmb (eg: foo.bar(...))

            for (int i = 0; i < syms.Length; i++)
            {
                var fieldref = lexpr.Type.Meta.GetField(syms[i]);
                if (fieldref == null)
                {
                    var method = lexpr.Type.Meta.GetMethod(syms[i]);
                    if (method != null)
                    {
                        if (i != syms.Length - 1)
                        {
                            Parent.NamespaceContext.Context.AddError(new ErrorFunctionIndexing(context));
                            return null;
                        }
                        PushCall(method);
                        return null;
                    }

                    Parent.NamespaceContext.Context.AddError(new ErrorMemberNotFound(context));
                    return null;
                }
                /* LLVM */
                var gep = builder.BuildStructGEP(lexpr.Value, (uint)fieldref.Index);
                lexpr = new GamaValueRef(fieldref.Type, gep, true); // TODO: check editability

                Reference = lexpr;
            }

            if (!IsEmptyLoad)
                if (!TopLoad)
                    return lexpr; // dont load it, for assign probably

            if (lexpr == null) // TODO: check this, this should not happen, in loop lexpr is ALWAYS assigned to a new value
            {
                Console.WriteLine(">>> It happened: {0}", Environment.StackTrace);
                return null;
            }

            var load = builder.BuildLoad(lexpr.Value);
            return new GamaValueRef(lexpr.Type, load, false);
        }

        public override GamaValueRef VisitExprAddressOf([NotNull] GamaParser.ExprAddressOfContext context)
        {
            /* Trick to getting the address of a value is to disable variable loading   */
            /* Function pointers are ignored since function are not first class types   */
            /* Loading them won't work, they are not really contant sized               */
            PushLoad(false);
            var val = Visit(context.expr());
            if (val == null)
                return null;
            val = new GamaValueRef(new GamaPointer(val.Type), val.Value, false);
            PopLoad();
            return val;
        }

        public override GamaValueRef VisitExprPointerLoad([NotNull] GamaParser.ExprPointerLoadContext context)
        {
            var val = Visit(context.expr());

            if (val == null)
                return null;

            var block = Parent.CurrentBlock;
            var builder = Parent.Builder;
            block.PositionBuilderAtEnd(builder);
            var load = builder.BuildLoad(val.Value);

            return new GamaValueRef(val.Type, load, true); // Loaded pointers are modifiable
        }

        public override GamaValueRef VisitExprCall([NotNull] GamaParser.ExprCallContext context)
        {
            var fn = Visit(context.expr());

            if (!IsEmptyCall)
            {
                var list = PopCall();
                var resolver = new GamaFunctionResolver(list);

                var argslist = context.exprList();

                if (argslist != null)
                {
                    var exprs = argslist.expr();

                    for (int i = 0; i < exprs.Length; i++)
                    {
                        var val = Visit(exprs[i]);
                        if (val == null)
                        {
                            if (!IsEmptyCall)
                                resolver.Resolve(i, PopCall());
                            else
                                return null;
                        }
                        else
                            resolver.Resolve(i, val);
                    }
                }

                var resolved = resolver.Resolve();
                if (resolved == null)
                {
                    if (resolver.Remaining.Count == 0)
                    {
                        Parent.NamespaceContext.Context.AddError(new ErrorNoViableOverride(context));
                        return null;
                    }

                    Parent.NamespaceContext.Context.AddError(new ErrorAmbiguousCall(context));
                    return null;
                }

                if (resolved.IsMethod)
                    if (Reference == null) // Compiler forgot the provide object reference to method call, check FQMB expression if this happens
                    {
                        Parent.NamespaceContext.Context.AddError(new ErrorInternalObjectRefMethodReq(context));
                        return null;
                    }

                if (resolved.HasAttribute("obsolete"))
                    Console.WriteLine("Function '{0}' is marked as obsolete, this method should be avoided", context.expr().GetText());

                var args = resolver.ResolveArgs();
                if (args.Item1 != GamaFunctionResolver.ArgResolveStatus.Success)
                {
                    Parent.NamespaceContext.Context.AddError(new ErrorNoViableOverride(context));
                    return null;
                }

                if (resolved.IsMethod)
                    args.Item2[0] = Reference;

                var argsnative = args.Item2.Select(a => a.Value).ToArray();
                var fnty = resolved.Type as GamaFunction;

                /* LLVM */
                var block = Parent.CurrentBlock;
                var builder = Parent.Builder;
                block.PositionBuilderAtEnd(builder);

                if (fnty.IsVarArg)
                {
                    for (int i = resolved.Parameters.Count; i < argsnative.Length; i++)
                    {
                        var arg = argsnative[i];
                        // C11 n1570 6.5.2.2.6; varargs promote floats to doubles
                        if (args.Item2[i].Type == InstanceTypes.F32) // promotion needed
                        {
                            var trunc = builder.BuildFPExt(argsnative[i], InstanceTypes.F64.UnderlyingType);
                            argsnative[i] = trunc;
                        }
                    }
                }

                var result = builder.BuildCall(resolved.Value, argsnative);

                return new GamaValueRef(resolved.ReturnType, result, false);
            }
            else
            {
                if (fn == null)
                    return null;

                var fnref = fn as GamaFunctionRef;
                if (!(fn.Type is GamaFunction fnty))
                {
                    Parent.NamespaceContext.Context.AddError(new ErrorNonFunctionCall(context.expr()));
                    return null;
                }

                var start = fnref.IsMethod ? 1 : 0;
                var argslist = context.exprList();
                var argsnative = new LLVMValueRef[0 + start];

                if (argslist != null)
                {
                    var exprs = argslist.expr();
                    if (exprs.Length != fnty.ParameterTypes.Length)
                    {
                        Parent.NamespaceContext.Context.AddError(new ErrorNoViableOverride(argslist));
                        return null;
                    }

                    argsnative = new LLVMValueRef[exprs.Length + start];

                    for (int i = start; i < exprs.Length; i++)
                    {
                        PushTT(fnty.ParameterTypes[i]);
                        var val = Visit(exprs[i - start]);
                        PopTT();
                        if (val == null)
                            return null;
                        argsnative[i] = val.Value;
                    }
                }
                else if (fnty.ParameterTypes.Length != 0)
                {
                    Parent.NamespaceContext.Context.AddError(new ErrorNoViableOverride(context));
                    return null;
                }

                if (fnref.IsMethod)
                {
                    if (Reference == null)
                    {
                        Parent.NamespaceContext.Context.AddError(new ErrorInternalObjectRefMethodReq(context));
                        return null;
                    }
                }
                else
                    argsnative[0] = Reference.Value;

                /* LLVM */
                var block = Parent.CurrentBlock;
                var builder = Parent.Builder;
                block.PositionBuilderAtEnd(builder);
                var result = builder.BuildCall(fn.Value, argsnative);

                return new GamaValueRef(fnty.ReturnType, result, false);
            }
        }

        public override GamaValueRef VisitExprOpMul([NotNull] GamaParser.ExprOpMulContext context)
        {
            var lhs = Visit(context.expr(0));
            var rhs = Visit(context.expr(1));
            var op = context.opMul().GetText();

            GamaFunctionList oplist;

            if (op == "*")
                oplist = lhs.Type.Meta.Operators.Mul;
            else if (op == "/")
                oplist = lhs.Type.Meta.Operators.Div;
            else
                oplist = lhs.Type.Meta.Operators.Mod;

            var target = !IsEmptyTT ? TopTT : null;

            GamaFunctionRef fnref = null;
            if (target == null)
                fnref = oplist.FindFunction(new[] { lhs.Type, rhs.Type });
            else
                fnref = oplist.FindFunction(target, new[] { lhs.Type, rhs.Type });

            if (fnref == null)
            {
                GamaCompiledFunctionList coplist;
                if (op == "*")
                    coplist = lhs.Type.Meta.CompiledOperators.Mul;
                else if (op == "/")
                    coplist = lhs.Type.Meta.CompiledOperators.Div;
                else
                    coplist = lhs.Type.Meta.CompiledOperators.Mod;

                GamaCompiledFunctionRef cfnref = null;
                if (target == null)
                    cfnref = coplist.FindFunction(lhs.Type, rhs.Type);
                else
                    cfnref = coplist.FindFunction(target, new[] { lhs.Type, rhs.Type });

                if (cfnref == null)
                {
                    Parent.NamespaceContext.Context.AddError(new ErrorNoViableOperator(context));
                    return null;
                }
                var cbuilder = Parent.Builder;
                Parent.CurrentBlock.PositionBuilderAtEnd(cbuilder);
                return cfnref.Call(cbuilder, lhs, rhs);
            }

            /* LLVM */
            var block = Parent.CurrentBlock;
            var builder = Parent.Builder;
            block.PositionBuilderAtEnd(builder);
            var result = builder.BuildCall(fnref.Value, new LLVMValueRef[] { lhs.Value, rhs.Value });

            return new GamaValueRef(fnref.ReturnType, result, false);
        }

        public override GamaValueRef VisitExprOpAdd([NotNull] GamaParser.ExprOpAddContext context)
        {
            var lhs = Visit(context.expr(0));
            var rhs = Visit(context.expr(1));
            var op = context.opAdd().GetText();

            GamaFunctionList oplist;

            if (op == "+")
                oplist = lhs.Type.Meta.Operators.Add;
            else
                oplist = lhs.Type.Meta.Operators.Sub;

            var target = !IsEmptyTT ? TopTT : null;

            GamaFunctionRef fnref = null;
            if (target == null)
                fnref = oplist.FindFunction(new[] { lhs.Type, rhs.Type });
            else
                fnref = oplist.FindFunction(target, new[] { lhs.Type, rhs.Type });

            if (fnref == null)
            {
                GamaCompiledFunctionList coplist;
                if (op == "+")
                    coplist = lhs.Type.Meta.CompiledOperators.Add;
                else
                    coplist = lhs.Type.Meta.CompiledOperators.Sub;

                GamaCompiledFunctionRef cfnref = null;
                if (target == null)
                    cfnref = coplist.FindFunction(lhs.Type, rhs.Type);
                else
                    cfnref = coplist.FindFunction(target, new[] { lhs.Type, rhs.Type });

                if (cfnref == null)
                {
                    Parent.NamespaceContext.Context.AddError(new ErrorNoViableOperator(context));
                    return null;
                }
                var cbuilder = Parent.Builder;
                Parent.CurrentBlock.PositionBuilderAtEnd(cbuilder);
                return cfnref.Call(cbuilder, lhs, rhs);
            }

            /* LLVM */
            var block = Parent.CurrentBlock;
            var builder = Parent.Builder;
            block.PositionBuilderAtEnd(builder);
            var result = builder.BuildCall(fnref.Value, new LLVMValueRef[] { lhs.Value, rhs.Value });

            return new GamaValueRef(fnref.ReturnType, result, false);
        }

        public override GamaValueRef VisitExprOpComp([NotNull] GamaParser.ExprOpCompContext context)
        {
            var lhs = Visit(context.expr(0));
            var rhs = Visit(context.expr(1));
            var op = context.opComp().GetText();

            GamaFunctionList oplist;

            if (op == ">")
                oplist = lhs.Type.Meta.Operators.Gt;
            else if (op == "<")
                oplist = lhs.Type.Meta.Operators.Lt;
            else if (op == ">=")
                oplist = lhs.Type.Meta.Operators.Ge;
            else if (op == "<=")
                oplist = lhs.Type.Meta.Operators.Le;
            else if (op == "==")
                oplist = lhs.Type.Meta.Operators.Eq;
            else
                oplist = lhs.Type.Meta.Operators.Neq;

            GamaFunctionRef fnref = oplist.FindFunction(InstanceTypes.Bool, new[] { lhs.Type, rhs.Type });

            if (fnref == null)
            {
                GamaCompiledFunctionList coplist;
                if (op == ">")
                    coplist = lhs.Type.Meta.CompiledOperators.Gt;
                else if (op == "<")
                    coplist = lhs.Type.Meta.CompiledOperators.Lt;
                else if (op == ">=")
                    coplist = lhs.Type.Meta.CompiledOperators.Ge;
                else if (op == "<=")
                    coplist = lhs.Type.Meta.CompiledOperators.Le;
                else if (op == "==")
                    coplist = lhs.Type.Meta.CompiledOperators.Eq;
                else
                    coplist = lhs.Type.Meta.CompiledOperators.Neq;

                GamaCompiledFunctionRef cfnref = coplist.FindFunction(InstanceTypes.Bool, new[] { lhs.Type, rhs.Type });

                if (cfnref == null)
                {
                    Parent.NamespaceContext.Context.AddError(new ErrorNoViableOperator(context));
                    return null;
                }
                var cbuilder = Parent.Builder;
                Parent.CurrentBlock.PositionBuilderAtEnd(cbuilder);
                return cfnref.Call(cbuilder, lhs, rhs);
            }

            /* LLVM */
            var block = Parent.CurrentBlock;
            var builder = Parent.Builder;
            block.PositionBuilderAtEnd(builder);
            var result = builder.BuildCall(fnref.Value, new LLVMValueRef[] { lhs.Value, rhs.Value });

            return new GamaValueRef(fnref.ReturnType, result, false);
        }

        public override GamaValueRef VisitExprOpLogic([NotNull] GamaParser.ExprOpLogicContext context)
        {
            var lhs = Visit(context.expr(0));
            var rhs = Visit(context.expr(1));
            var op = context.opLogic().GetText();

            GamaFunctionList oplist;

            if (op == "&&")
                oplist = lhs.Type.Meta.Operators.And;
            else if (op == "||")
                oplist = lhs.Type.Meta.Operators.Or;
            else
                oplist = lhs.Type.Meta.Operators.Xor;

            var target = !IsEmptyTT ? TopTT : null;

            GamaFunctionRef fnref = null;
            if (target == null)
                fnref = oplist.FindFunction(new[] { lhs.Type, rhs.Type });
            else
                fnref = oplist.FindFunction(target, new[] { lhs.Type, rhs.Type });

            if (fnref == null)
            {
                GamaCompiledFunctionList coplist;
                if (op == "&&")
                    coplist = lhs.Type.Meta.CompiledOperators.And;
                else if (op == "||")
                    coplist = lhs.Type.Meta.CompiledOperators.Or;
                else
                    coplist = lhs.Type.Meta.CompiledOperators.Xor;

                GamaCompiledFunctionRef cfnref = null;
                if (target == null)
                    cfnref = coplist.FindFunction(lhs.Type, rhs.Type);
                else
                    cfnref = coplist.FindFunction(target, new[] { lhs.Type, rhs.Type });

                if (cfnref == null)
                {
                    Parent.NamespaceContext.Context.AddError(new ErrorNoViableOperator(context));
                    return null;
                }
                var cbuilder = Parent.Builder;
                Parent.CurrentBlock.PositionBuilderAtEnd(cbuilder);
                return cfnref.Call(cbuilder, lhs, rhs);
            }

            /* LLVM */
            var block = Parent.CurrentBlock;
            var builder = Parent.Builder;
            block.PositionBuilderAtEnd(builder);
            var result = builder.BuildCall(fnref.Value, new LLVMValueRef[] { lhs.Value, rhs.Value });

            return new GamaValueRef(fnref.ReturnType, result, false);
        }
    }
}
