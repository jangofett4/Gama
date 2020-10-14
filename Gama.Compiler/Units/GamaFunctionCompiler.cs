using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Antlr4.Runtime.Misc;
using Gama.Error;
using Gama.Interop;
using Gama.Types;
using LLVMSharp;
using LLVMSharp.Interop;

namespace Gama.Compiler.Units
{
    public class GamaFunctionCompiler : GamaBaseVisitor<bool>, IFinalize
    {
        public GamaNamespaceContext NamespaceContext { get; set; }

        // The function being implemented (a.k.a. self)
        public GamaFunctionRef Self { get; set; }

        // Current stack frame
        // Generally only one frame is enough, but a stack is useful for lambda functions
        // Top frame returns last added frame in stack (a.k.a topmost frame)
        public GamaStackFrame Frame { get; set; }
        public GamaFrame Top { get { return Frame.Top; } }

        public GamaBlockRef CurrentBlock { get; set; }

        public LLVMBuilderRef Builder { get; set; }

        public GamaExpressionCompiler ExpressionCompiler { get; set; }

        public GamaFunctionCompiler(GamaNamespaceContext ctx, GamaFunctionRef fn)
        {
            NamespaceContext = ctx;
            Self = fn;
            Frame = new GamaStackFrame();
            Builder = ctx.This.Context.Context.CreateBuilder();

            ExpressionCompiler = new GamaExpressionCompiler(this);

            // This compiler is responsible for compiling most of the function related code
            // This is why this unit needs to add a block always
            // All blocks contain a special character in them (such as '.') to avoid mixing user code and compiler generated code
            // Compiler always works with single block at a time and compiler is single threaded. So this code won't hurt compiler.
            SetBlock(fn.AddBlock("code"));
        }

        public GamaFrame Push() => Frame.Push();
        public GamaFrame Pop() => Frame.Pop();

        public void SetBlock(GamaBlockRef block)
        {
            CurrentBlock = block;
        }

        public GamaValueRef VisitExpression(GamaParser.ExprContext exp)
        {
            return ExpressionCompiler.Visit(exp);
        }
        public GamaValueRef VisitExpression(GamaTypeRef target, GamaParser.ExprContext exp)
        {
            ExpressionCompiler.PushTT(target);
            var result = ExpressionCompiler.Visit(exp);
            ExpressionCompiler.PopTT();
            return result;
        }

        public override bool VisitStmtFnCall([NotNull] GamaParser.StmtFnCallContext context)
        {
            var fn = VisitExpression(context.expr());

            if (!ExpressionCompiler.IsEmptyCall)
            {
                var list = ExpressionCompiler.TopCall();
                var resolver = new GamaFunctionResolver(list);

                var argslist = context.exprList();

                if (argslist != null)
                {
                    var exprs = argslist.expr();

                    for (int i = 0; i < exprs.Length; i++)
                    {
                        var val = VisitExpression(exprs[i]);
                        if (val == null)
                        {
                            if (!ExpressionCompiler.IsEmptyCall)
                                resolver.Resolve(i, ExpressionCompiler.TopCall());
                            else
                            {
                                NamespaceContext.Context.AddError(new ErrorInternalExpressionNull(exprs[i]));
                                return false;
                            }
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
                        NamespaceContext.Context.AddError(new ErrorNoViableOverride(context));
                        return false;
                    }

                    NamespaceContext.Context.AddError(new ErrorAmbiguousCall(context));
                    return false;
                }

                if (resolved.HasAttribute("obsolete"))
                    Console.WriteLine("Function '{0}' is marked as obsolete, this method should be avoided", context.expr().GetText());

                var args = resolver.ResolveArgs();
                if (args.Item1 != GamaFunctionResolver.ArgResolveStatus.Success)
                {
                    NamespaceContext.Context.AddError(new ErrorNoViableOverride(context));
                    return false;
                }

                var argsnative = args.Item2.Select(a => a.Value).ToArray();

                /* LLVM */
                var block = CurrentBlock;
                var builder = Builder;
                block.PositionBuilderAtEnd(builder);
                builder.BuildCall(resolved.Value, argsnative);
            }
            else
            {
                if (fn == null)
                {
                    NamespaceContext.Context.AddError(new ErrorInternalExpressionNull(context.expr()));
                    return false;
                }

                if (!(fn.Type is GamaFunction fnty))
                {
                    NamespaceContext.Context.AddError(new ErrorNonFunctionCall(context.expr()));
                    return false;
                }

                var argslist = context.exprList();
                var argsnative = new LLVMValueRef[0];

                if (argslist != null)
                {
                    var exprs = argslist.expr();
                    if (exprs.Length != fnty.ParameterTypes.Length)
                    {
                        NamespaceContext.Context.AddError(new ErrorNoViableOverride(argslist));
                        return false;
                    }

                    argsnative = new LLVMValueRef[exprs.Length];

                    for (int i = 0; i < exprs.Length; i++)
                    {
                        ExpressionCompiler.PushTT(fnty.ParameterTypes[i]);
                        var val = VisitExpression(exprs[i]);
                        ExpressionCompiler.PopTT();
                        if (val == null)
                        {
                            NamespaceContext.Context.AddError(new ErrorInternalExpressionNull(exprs[i]));
                            return false;
                        }
                        argsnative[i] = val.Value;
                    }
                }
                else if (fnty.ParameterTypes.Length != 0)
                {
                    NamespaceContext.Context.AddError(new ErrorNoViableOverride(context));
                    return false;
                }

                /* LLVM */
                var block = CurrentBlock;
                var builder = Builder;
                block.PositionBuilderAtEnd(builder);
            }

            return true;
        }

        public override bool VisitStmtIfBase([NotNull] GamaParser.StmtIfBaseContext context)
        {
            var expr = VisitExpression(context.expr());
            if (expr == null)
                return false;

            if (expr.Type != InstanceTypes.Bool)
            {
                NamespaceContext.Context.AddError(new ErrorTypeMismatch(context.expr()));
                return false;
            }

            /* LLVM */
            CurrentBlock.PositionBuilderAtEnd(Builder);
            
            var iftrue = Self.AddBlock("if.true");
            var ifend = Self.AddBlock("if.end");
            
            Builder.BuildCondBr(expr.Value, iftrue.Block, ifend.Block);

            // Compile true block
            SetBlock(iftrue);
            Push();
            { 
                Visit(context.block());
            }
            if (!iftrue.HasTerminator())
            {
                iftrue.PositionBuilderAtEnd(Builder);
                Builder.BuildBr(ifend.Block);
            }
            if (CurrentBlock != iftrue) /* Block nesting */
            {
                CurrentBlock.PositionBuilderAtEnd(Builder);
                Builder.BuildBr(ifend.Block);
            }
            Pop();
            SetBlock(ifend);
            
            return true;
        }
        // TODO: implement nesting bs for every control flow statement (ifelsewhile etc)

        public override bool VisitStmtIfElse([NotNull] GamaParser.StmtIfElseContext context)
        {
            var expr = VisitExpression(context.expr());
            if (expr == null)
                return false;

            if (expr.Type != InstanceTypes.Bool)
            {
                NamespaceContext.Context.AddError(new ErrorTypeMismatch(context.expr()));
                return false;
            }

            /* LLVM */
            CurrentBlock.PositionBuilderAtEnd(Builder);

            var iftrue = Self.AddBlock("if.true");
            var iffalse = Self.AddBlock("if.false");
            var ifend = Self.AddBlock("if.end");

            Builder.BuildCondBr(expr.Value, iftrue.Block, iffalse.Block);

            // Compile true and false blocks
            SetBlock(iftrue);
            Push();
            { 
                Visit(context.block(0));
            }
            Pop();
            if (!iftrue.HasTerminator())
            {
                iftrue.PositionBuilderAtEnd(Builder);
                Builder.BuildBr(ifend.Block);
            }
            if (CurrentBlock != iftrue) /* Block nesting */
            {
                CurrentBlock.PositionBuilderAtEnd(Builder);
                Builder.BuildBr(ifend.Block);
            }
            SetBlock(iffalse);
            Push();
            { 
                Visit(context.block(1));
            }
            if (!iffalse.HasTerminator())
            {
                iffalse.PositionBuilderAtEnd(Builder);
                Builder.BuildBr(ifend.Block);
            }
            if (CurrentBlock != iffalse) /* Block nesting */
            {
                CurrentBlock.PositionBuilderAtEnd(Builder);
                Builder.BuildBr(ifend.Block);
            }
            Pop();

            SetBlock(ifend);

            return true;
        }

        public override bool VisitStmtIfElseIf([NotNull] GamaParser.StmtIfElseIfContext context)
        {
            var exprctx = context.expr();
            /* lmao */
            for (int i = 0; i < exprctx.Length; i++)
            {
                var e = exprctx[i];
                var val = VisitExpression(e);
                if (val == null)
                    return false;

                if (val.Type != InstanceTypes.Bool)
                {
                    NamespaceContext.Context.AddError(new ErrorTypeMismatch(e));
                    return false;
                }

                CurrentBlock.PositionBuilderAtEnd(Builder);

                var iftrue = Self.AddBlock("if.true");
                var ifend = Self.AddBlock("if.end");

                Builder.BuildCondBr(val.Value, iftrue.Block, ifend.Block);

                SetBlock(iftrue);
                Push();
                {
                    Visit(context.block(i));
                }
                if (!iftrue.HasTerminator())
                {
                    iftrue.PositionBuilderAtEnd(Builder);
                    Builder.BuildBr(ifend.Block);
                }
                if (CurrentBlock != iftrue) /* Block nesting */
                {
                    CurrentBlock.PositionBuilderAtEnd(Builder);
                    Builder.BuildBr(ifend.Block);
                }
                Pop();
                SetBlock(ifend);
            }

            return true;
        }

        public override bool VisitStmtIfElseIfElse([NotNull] GamaParser.StmtIfElseIfElseContext context)
        {
            var exprctx = context.expr();
            /* lmao */
            for (int i = 0; i < exprctx.Length; i++)
            {
                var e = exprctx[i];
                var val = VisitExpression(e);
                if (val == null)
                    return false;

                if (val.Type != InstanceTypes.Bool)
                {
                    NamespaceContext.Context.AddError(new ErrorTypeMismatch(e));
                    return false;
                }

                CurrentBlock.PositionBuilderAtEnd(Builder);

                var iftrue = Self.AddBlock("if.true");
                var ifend = Self.AddBlock("if.end");

                Builder.BuildCondBr(val.Value, iftrue.Block, ifend.Block);

                SetBlock(iftrue);
                Push();
                {
                    Visit(context.block(i));
                }
                if (!iftrue.HasTerminator())
                {
                    iftrue.PositionBuilderAtEnd(Builder);
                    Builder.BuildBr(ifend.Block);
                }
                if (CurrentBlock != iftrue) /* Block nesting */
                {
                    CurrentBlock.PositionBuilderAtEnd(Builder);
                    Builder.BuildBr(ifend.Block);
                }
                Pop();
                SetBlock(ifend);
            }

            // TODO:

            return true;
        }

        public override bool VisitStmtWhileBase([NotNull] GamaParser.StmtWhileBaseContext context)
        {
            var wlecontrol = Self.AddBlock("while.if");
            var wleblock = Self.AddBlock("while.loop");
            var wleend = Self.AddBlock("while.end");

            CurrentBlock.PositionBuilderAtEnd(Builder);
            Builder.BuildBr(wlecontrol.Block);

            SetBlock(wlecontrol);
            CurrentBlock.PositionBuilderAtEnd(Builder);
            var expr = VisitExpression(context.expr());
            if (expr == null)
                return false;

            if (expr.Type != InstanceTypes.Bool)
            {
                NamespaceContext.Context.AddError(new ErrorTypeMismatch(context.expr()));
                return false;
            }
            Builder.BuildCondBr(expr.Value, wleblock.Block, wleend.Block);

            SetBlock(wleblock);
            Push();
            {
                Visit(context.block());
            }
            if (!wleblock.HasTerminator())
            {
                wleblock.PositionBuilderAtEnd(Builder);
                Builder.BuildBr(wlecontrol.Block);
            }
            if (CurrentBlock != wleblock) /* Block nesting */
            {
                CurrentBlock.PositionBuilderAtEnd(Builder);
                Builder.BuildBr(wlecontrol.Block);
            }
            Pop();
            if (wleend != CurrentBlock)
            {
                if (!CurrentBlock.HasTerminator())
                {
                    CurrentBlock.PositionBuilderAtEnd(Builder);
                    Builder.BuildBr(wleend.Block);
                }
            }
            SetBlock(wleend);

            return true;
        }

        public override bool VisitStmtVarDefBase([NotNull] GamaParser.StmtVarDefBaseContext context)
        {
            var name = context.Symbol().GetText();
            var val = Top.FindValue(name);
            // Duplicate variable definition (parent frames can have same variable, it will be overriden in current frame)
            if (val != null)
            {
                NamespaceContext.Context.AddError(new ErrorDuplicateVariable(context));
                return false;
            }
            val = VisitExpression(context.expr());
            if (val == null)
                return false;

            /* LLVM */
            CurrentBlock.PositionBuilderAtEnd(Builder);
            var alloc = Builder.BuildAlloca(val.Type.UnderlyingType, name);
            Builder.BuildStore(val.Value, alloc);
            
            Top.AddValue(name, new GamaValueRef(val.Type, alloc, true));

            return true;
        }

        public override bool VisitStmtVarDefFull([NotNull] GamaParser.StmtVarDefFullContext context)
        {
            var name = context.Symbol().GetText();
            var val = Top.FindValue(name);
            if (val != null)
            {
                NamespaceContext.Context.AddError(new ErrorDuplicateVariable(context));
                return false;
            }
            var ty = NamespaceContext.FindTypeRefGlobal(context.typeName());
            if (ty == null)
            {
                NamespaceContext.Context.AddError(new ErrorTypeNotFound(context.typeName()));
                return false;
            }
            if (ty == InstanceTypes.Void)
            {
                NamespaceContext.Context.AddError(new ErrorVariableVoid(context.typeName()));
                return false;
            }
            val = VisitExpression(ty, context.expr());
            if (val == null)
                return false;
            // If expression compiler returns a function then it's impossible for a type mismatch to happen
            // Expression compiler checks for type mismatches when evaluating function pointers
            // Alsp no need to check if 'ty' is a GamaFunction either, expressiom compiler already did that
            if (val.Type is GamaFunction valtyfn)
            {
                var tyfn = new GamaPointer(ty as GamaFunction);
                /* LLVM */
                CurrentBlock.PositionBuilderAtEnd(Builder);
                var alloc = Builder.BuildAlloca(tyfn.UnderlyingType, name);
                Builder.BuildStore(val.Value, alloc);

                Top.AddValue(name, new GamaValueRef(ty, alloc, true));
                return true;
            }

            // If not function, there might be a mismatch. Check it and error if it mismatches
            if (val.Type != ty)
            {
                NamespaceContext.Context.AddError(new ErrorTypeMismatch(context.expr()));
                return false;
            }

            /* LLVM */
            // One block above to avoid dumb C# error message saying 'alloc' is already defined (SOMEHOW)
            {
                CurrentBlock.PositionBuilderAtEnd(Builder);
                var alloc = Builder.BuildAlloca(ty.UnderlyingType, name);
                Builder.BuildStore(val.Value, alloc);

                Top.AddValue(name, new GamaValueRef(ty, alloc, true));
            }

            return true;
        }

        public override bool VisitStmtVarDefNull([NotNull] GamaParser.StmtVarDefNullContext context)
        {
            var name = context.Symbol().GetText();
            var val = Top.FindValue(name);
            if (val != null)
            {
                NamespaceContext.Context.AddError(new ErrorDuplicateVariable(context));
                return false;
            }
            var ty = NamespaceContext.FindTypeRefGlobal(context.typeName());
            if (ty == null)
            {
                NamespaceContext.Context.AddError(new ErrorTypeNotFound(context.typeName()));
                return false;
            }
            if (ty == InstanceTypes.Void)
            {
                NamespaceContext.Context.AddError(new ErrorVariableVoid(context.typeName()));
                return false;
            }

            /* LLVM */
            CurrentBlock.PositionBuilderAtEnd(Builder);
            if (ty is GamaFunction) // Functionals are not allocated directly, instead a pointer is allocateds
            {
                var ptr = new GamaPointer(ty);
                var alloc = Builder.BuildAlloca(ptr.UnderlyingType, name);
                Builder.BuildStore(LLVMValueRef.CreateConstPointerNull(ptr.UnderlyingType), alloc);

                Top.AddValue(name, new GamaValueRef(ty, alloc, true));
            }
            else
            {
                var alloc = Builder.BuildAlloca(ty.UnderlyingType, name);
                // TODO: maybe add an option to not null initialize these variable definitions
                // Possible speed boost
                Builder.BuildStore(LLVMValueRef.CreateConstNull(ty.UnderlyingType), alloc);

                Top.AddValue(name, new GamaValueRef(ty, alloc, true));
            }

            return true;
        }

        public override bool VisitStmtAssign([NotNull] GamaParser.StmtAssignContext context)
        {
            ExpressionCompiler.PushLoad(false);
            var lhs = VisitExpression(context.expr(0));
            ExpressionCompiler.PopLoad();

            if (!lhs.IsModifiableLValue)
            {
                NamespaceContext.Context.AddError(new ErrorAssignToNonModLValue(context.expr(0)));
                return false;
            }

            var value = VisitExpression(lhs.Type, context.expr(1));
            if (value == null)
            {
                NamespaceContext.Context.AddError(new ErrorTypeMismatch(context.expr(1)));
                return false;
            }

            /* LLVM */
            CurrentBlock.PositionBuilderAtEnd(Builder);
            Builder.BuildStore(value.Value, lhs.Value);
            return true;
        }

        public override bool VisitStmtReturnVoid([NotNull] GamaParser.StmtReturnVoidContext context)
        {
            if (Self.ReturnType != InstanceTypes.Void)
            {
                NamespaceContext.Context.AddError(new GamaError("Function tried to return void despite it being a {1} function", Self.ReturnType.Name));
                return false;
            }

            /* LLVM */
            CurrentBlock.PositionBuilderAtEnd(Builder);
            Builder.BuildRetVoid();

            return true;
        }

        public override bool VisitStmtReturnValue([NotNull] GamaParser.StmtReturnValueContext context)
        {
            if (Self.ReturnType == InstanceTypes.Void)
            {
                NamespaceContext.Context.AddError(new ErrorVoidReturnsValue(context));
                return false;
            }

            var val = VisitExpression(Self.ReturnType, context.expr());
            if (val == null)
                return false;

            if (Self.ReturnType != val.Type)
            {
                NamespaceContext.Context.AddError(new ErrorTypeMismatch(context.expr()));
                return false;
            }
                
            /* LLVM */
            CurrentBlock.PositionBuilderAtEnd(Builder);
            Builder.BuildRet(val.Value);

            return true;
        }

        public int Finish()
        {
            // Assuming current block is last block
            CurrentBlock.PositionBuilderAtEnd(Builder);
            if (!CurrentBlock.HasTerminator())
            {
                if (Self.ReturnType != InstanceTypes.Void)
                {
                    // TODO: fix your sh*tty error system (and error generator too)
                    // ALSO: possibly add (and improve) super konsole lib
                    NamespaceContext.Context.AddError(new GamaError("Function did not return a value, did you meant to use void return type? Expected {0} got nothing.", Self.ReturnType.Name));
                    return -1;
                }
                // If self is void, no need to worry, just BuildRetVoid()
                Builder.BuildRetVoid();
            }

            Builder.Dispose();
            return 0;
        }
    }
}
