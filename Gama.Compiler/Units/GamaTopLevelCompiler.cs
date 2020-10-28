using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;

using Gama.Interop;
using Gama.Types;

using Antlr4.Runtime.Misc;
using LLVMSharp.Interop;
using Gama.Error;

namespace Gama.Compiler.Units
{
    public class GamaNamespaceContext
    {
        public GamaTopLevelCompiler Compiler { get; set; }

        // Namespace that current top level compiler resides in
        public GamaNamespace This { get; }

        // Global context for easier access
        public GamaGlobalContext Context { get; set; }

        // 'using's done by current top level compiler
        public List<GamaNamespace> Imports { get; set; }

        public GamaNamespaceContext(GamaTopLevelCompiler compiler, GamaNamespace ns)
        {
            Compiler = compiler;
            This = ns;
            Context = ns.Context;
            Imports = new List<GamaNamespace>();
        }

        public void AddImport(GamaNamespace ns)
        {
            if (!Imports.Contains(ns))
                Imports.Add(ns);
        }

        /* So, you might want to optimize these later, because, like, this might slow down type searching (and compilation), soooo: TODO: */
        public GamaTypeRef FindTypeRefGlobal(GamaParser.FqtnContext fqtn)
        {
            var names = fqtn.Symbol().Select(s => s.GetText()).ToArray();
            var found = This.FindTypeChain(names);
            if (found != null)
                return found;
            if (This != Compiler.GlobalContext.Root)
            {
                found = Compiler.GlobalContext.Root.FindTypeChain(names);
                if (found != null)
                    return found;
            }
            foreach (var ns in Imports)
            {
                found = ns.FindTypeChain(names);
                if (found != null)
                    return found;
            }
            return Compiler.GlobalContext.GetTypeChain(names);
        }

        public GamaTypeRef FindTypeRefGlobal(GamaParser.TypeNameContext typename)
        {
            var t = FindTypeRefGlobal(typename.fqtn());
            if (t == null)
                return null;
            for (int i = 0; i < typename.ptr().Length; i++)
                t = new GamaPointer(t);
            return t;
        }

        public GamaFunctionList FindFunctionRefGlobal(params string[] names)
        {
            var found = This.FindFunctionChain(names);
            if (found != null)
                return found;
            if (This != Compiler.GlobalContext.Root) // In some cases current namespace is root namespace, no need for searching it
            {
                found = Compiler.GlobalContext.Root.FindFunctionChain(names);
                if (found != null)
                    return found;
            }
            foreach (var ns in Imports)
            {
                found = ns.FindFunctionChain(names);
                if (found != null)
                    return found;
            }
            return Compiler.GlobalContext.GetFunctionChain(names);
        }

        public GamaTypeRef FindTypeRef(string name) => This.FindType(name);
        public GamaFunctionList FindFunctionRef(string name) => This.FindFunction(name);
    }

    public class GamaTopLevelCompiler : GamaBaseVisitor<bool>
    {
        public GamaNamespaceContext NamespaceContext { get; set; }

        public GamaGlobalContext GlobalContext { get; set; }

        public GamaTopLevelCompiler(GamaGlobalContext ctx, GamaNamespace parent)
        {
            GlobalContext = ctx;
            NamespaceContext = new GamaNamespaceContext(this, parent);
        }

        public override bool VisitTopLevelUsingNamespace([NotNull] GamaParser.TopLevelUsingNamespaceContext context)
        {
            var ns = GlobalContext.GetNamespaceChain(context.fqtn().Symbol().Select(s => s.GetText()).ToArray());
            if (ns == null)
            {
                GlobalContext.AddError(new ErrorUsingNamespaceNotFound(context.fqtn()));
                return false;
            }

            NamespaceContext.AddImport(ns);
            return true;
        }

        public override bool VisitTopLevelDelegate([NotNull] GamaParser.TopLevelDelegateContext context)
        {
            var name = context.Symbol().GetText();
            if (NamespaceContext.FindTypeRef(name) != null)
            {
                GlobalContext.AddError(new ErrorDuplicateType(context));
                return false;
            }

            var retty = InstanceTypes.Void;
            
            var rettyfqtn = context.fqtn();
            if (rettyfqtn != null)
            {
                retty = NamespaceContext.FindTypeRefGlobal(rettyfqtn);
                if (retty == null)
                {
                    GlobalContext.AddError(new ErrorTypeNotFound(context.fqtn()));
                    return false;
                }
            }

            var parms = new GamaTypeRef[0];
            var parmsnative = new LLVMTypeRef[0];
            var parmsctx = context.fqtnList();
            if (parmsctx != null)
            {
                var fqtns = parmsctx.fqtn();
                parms = new GamaTypeRef[fqtns.Length];
                parmsnative = new LLVMTypeRef[fqtns.Length];
                for (int i = 0; i < fqtns.Length; i++)
                {
                    var ty = NamespaceContext.FindTypeRefGlobal(fqtns[i]);
                    if (ty == null)
                    {
                        GlobalContext.AddError(new ErrorTypeNotFound(fqtns[i]));
                        return false;
                    }
                    parms[i] = ty;
                    parmsnative[i] = ty.UnderlyingType;
                }
            }
            NamespaceContext.This.Types.Add(new GamaFunction(name, retty, parms, LLVMTypeRef.CreateFunction(retty.UnderlyingType, parmsnative)));
            return true;
        }

        public override bool VisitTopLevelExternDef([NotNull] GamaParser.TopLevelExternDefContext context)
        {
            var name = context.Symbol().GetText();
            var list = NamespaceContext.FindFunctionRefGlobal(name);

            if (list == null)
            {
                list = new GamaFunctionList(name);
                NamespaceContext.This.Functions.Add(list);
            }

            var retty = InstanceTypes.Void;

            var rettyfqtn = context.typeName();
            if (rettyfqtn != null)
            {
                retty = NamespaceContext.FindTypeRefGlobal(rettyfqtn);
                if (retty == null)
                {
                    GlobalContext.AddError(new ErrorTypeNotFound(context.typeName()));
                    return false;
                }
            }

            var ellipsis = context.ellipsis() != null;
            var parmslist = new GamaParamList();
            var argtypes = new GamaTypeRef[0];
            var argtypesnative = new LLVMTypeRef[0];
            var fqtnlist = context.typeList();
            if (fqtnlist != null)
            {
                var types = fqtnlist.typeName();
                argtypesnative = new LLVMTypeRef[types.Length];
                argtypes = new GamaTypeRef[types.Length];
                for (int i = 0; i < types.Length; i++)
                {
                    var ty = NamespaceContext.FindTypeRefGlobal(types[i]);
                    if (ty == null)
                    {
                        GlobalContext.AddError(new ErrorTypeNotFound(types[i]));
                        return false;
                    }
                    parmslist.Add(i.ToString(), ty); // Adding parameter with a numeric name, doesn't matter since this is a extern.
                    argtypes[i] = ty;
                    argtypesnative[i] = ty.UnderlyingType;
                }
            }

            if (list.FindFunction(parmslist) != null)
            {
                GlobalContext.AddError(new ErrorDuplicateFunction(context));
                return false;
            }

            var fnty = new GamaFunction(retty, argtypes, LLVMTypeRef.CreateFunction(retty.UnderlyingType, argtypesnative, ellipsis), ellipsis);
            var modfn = GlobalContext.Module.AddFunction(name, fnty.UnderlyingType);

            var fnref = new GamaFunctionRef(retty, parmslist, fnty, modfn, false);
            list.AddFunction(fnref);

            return true;
        }

        public override bool VisitTopLevelFuncDef([NotNull] GamaParser.TopLevelFuncDefContext context)
        {
            var name = context.Symbol().GetText();
            var fnlist = NamespaceContext.FindFunctionRef(name);
            var attrs = context.funcAttr();

            // New function
            if (fnlist == null)
            {
                fnlist = new GamaFunctionList(name);
                var stplist = context.symbolTypePairList();
                var parms = new GamaParamList();
                var parmTypes = new GamaTypeRef[0];
                var parmTypesNative = new LLVMTypeRef[0];

                if (stplist != null)
                {
                    var list = stplist.symbolTypePair();
                    
                    parmTypes = new GamaTypeRef[list.Length];
                    parmTypesNative = new LLVMTypeRef[list.Length];

                    for (int i = 0; i < list.Length; i++)
                    {
                        var stp = list[i];
                        var sym = stp.Symbol();
                        var type = NamespaceContext.FindTypeRefGlobal(stp.typeName());
                        if (type == null)
                        {
                            GlobalContext.AddError(new ErrorTypeNotFound(stp.typeName()));
                            return false;
                        }
                        /* Since functions are not first-class types, we need to wrap them around with a pointer */
                        if (type is GamaFunction)
                            type = new GamaPointer(type);
                        if (!parms.Add(sym.GetText(), type))
                        {
                            GlobalContext.AddError(new ErrorDuplicateParameter(stp));
                            return false; // TODO: fix error library.
                        }
                        parmTypesNative[i] = type.UnderlyingType;
                        parmTypes[i] = type;
                    }
                }

                /* Determine type */
                var rettypefqtn = context.typeName();
                var retty = InstanceTypes.Void;

                // If function has a non-void type
                if (rettypefqtn != null)
                {
                    // Find it
                    retty = NamespaceContext.FindTypeRefGlobal(rettypefqtn);
                    if (retty == null)
                    {
                        GlobalContext.AddError(new ErrorTypeNotFound(rettypefqtn));
                        return false;
                    }
                }

                /* LLVM */
                var modty = new GamaFunction(retty, parmTypes, LLVMTypeRef.CreateFunction(retty.UnderlyingType, parmTypesNative));
                var modfn = NamespaceContext.This.Context.Module.AddFunction(name, modty.UnderlyingType);

                var fn = new GamaFunctionRef(retty, parms, modty, modfn, false);
                var unit = new GamaFunctionCompiler(NamespaceContext, fn);

                /* Parameters are added to top frame of the target function, but they are not treated as conventional variables */
                foreach (var p in parms.Parameters)
                    unit.Top.AddValue(p.Name, new GamaValueRef(p.Type, modfn.GetParam(p.Index), false));

                unit.Visit(context.block());
                if (unit.Finish() == 0)
                {
                    // First add ident, if it fails you fail too.
                    if (attrs != null)
                    {
                        var attributes = new GamaAttributeCompiler(this).Visit(attrs);
                        if (attributes != null)
                            fn.Attributes = attributes;
                        else
                            return false;
                    }
                    fnlist.AddFunction(fn);
                    NamespaceContext.This.Functions.Add(fnlist);
                }
                else; // ?gnihtemos oD :ODOT (TODO:)

                return true;
            }
            // An override function
            else
            {
                var stplist = context.symbolTypePairList();
                var parms = new GamaParamList();
                if (stplist != null)
                {
                    var list = stplist.symbolTypePair();
                    for (int i = 0; i < list.Length; i++)
                    {
                        var stp = list[i];
                        var sym = stp.Symbol();
                        var type = NamespaceContext.FindTypeRefGlobal(stp.typeName());
                        if (type == null)
                        {
                            GlobalContext.AddError(new ErrorTypeNotFound(stp.typeName()));
                            return false;
                        }
                        if (type is GamaFunction)
                        {
                            if (!parms.Add(sym.GetText(), new GamaPointer(type)))
                            {
                                GlobalContext.AddError(new ErrorDuplicateParameter(stp));
                                return false; // TODO: fix error library.
                            }
                            continue;
                        }
                        if (!parms.Add(sym.GetText(), type))
                        {
                            GlobalContext.AddError(new ErrorDuplicateParameter(stp));
                            return false;
                        }
                    }
                }
                
                // Duplicate function if two functions have same type of parameters
                if (fnlist.FindFunction(parms) != null)
                {
                    GlobalContext.AddError(new ErrorDuplicateFunction(context));
                    return false;
                }

                /* Determine type */
                var rettypefqtn = context.typeName();
                var retty = InstanceTypes.Void;

                // If function has a non-void type
                if (rettypefqtn != null)
                {
                    // Find it
                    retty = NamespaceContext.FindTypeRefGlobal(rettypefqtn);
                    if (retty == null)
                    {
                        GlobalContext.AddError(new ErrorTypeNotFound(rettypefqtn));
                        return false;
                    }
                }

                var modty = new GamaFunction(retty, parms.Parameters.Select(p => p.Type).ToArray(), LLVMTypeRef.CreateFunction(retty.UnderlyingType, parms.Parameters.Select(p => p.Type.UnderlyingType).ToArray()));
                var modfn = GlobalContext.Module.AddFunction(name, modty.UnderlyingType);

                var fn = new GamaFunctionRef(retty, parms, modty, modfn, false);
                var unit = new GamaFunctionCompiler(NamespaceContext, fn);
                unit.Visit(context.block());
                if (unit.Finish() == 0)
                {
                    if (attrs != null)
                    {
                        var attributes = new GamaAttributeCompiler(this).Visit(attrs);
                        if (attributes != null)
                            fn.Attributes = attributes;
                        else
                            return false;
                    }
                    fnlist.AddFunction(fn);
                }
                else; // TODO:

                return true;
            }
        }

        public override bool VisitTopLevelStructDef([NotNull] GamaParser.TopLevelStructDefContext context)
        {
            var symtype = context.symbolTypePairList();
            if (symtype == null)
            {
                GlobalContext.AddError(new ErrorEmptyStruct(context));
                return false;
            }
            var structname = context.Symbol().GetText();
            if (NamespaceContext.FindTypeRef(structname) != null)
            {
                GlobalContext.AddError(new ErrorDuplicateType(context));
                return false;
            }

            var pairs = symtype.symbolTypePair();
            var fields = new Dictionary<string, GamaFieldRef>(pairs.Length);
            var types = new LLVMTypeRef[pairs.Length];
            var packed = context.Packed() != null;

            for (int i = 0; i < pairs.Length; i++)
            {
                var p = pairs[i];
                var name = p.Symbol().GetText();
                if (fields.ContainsKey(name))
                {
                    GlobalContext.AddError(new ErrorDuplicateField(p));
                    return false;
                }
                var ty = NamespaceContext.FindTypeRefGlobal(p.typeName());
                if (ty == null)
                {
                    GlobalContext.AddError(new ErrorTypeNotFound(p.typeName()));
                    return false;
                }
                fields[name] = new GamaFieldRef(name, i, ty);
                types[i] = ty.UnderlyingType;
            }

            LLVMTypeRef nativety;
            unsafe {
                nativety = LLVM.StructCreateNamed(GlobalContext.Context, structname.GetSbytePtr());
                nativety.StructSetBody(types, packed);
            }
            var structty = new GamaTypeRef(structname, nativety);
            structty.Meta.Fields.AddRange(fields.Values);
            NamespaceContext.This.Types.Add(structty);

            return true;
        }

        public override bool VisitTopLevelImpl([NotNull] GamaParser.TopLevelImplContext context)
        {
            var ty = NamespaceContext.FindTypeRefGlobal(context.fqtn());
            if (ty == null)
            {
                GlobalContext.AddError(new ErrorTypeNotFound(context.fqtn()));
                return false;
            }
            new GamaStructCompiler(this, ty).Visit(context);
            return true;
        }
    }
}
