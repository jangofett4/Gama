using Antlr4.Runtime.Misc;
using Gama.Interop;
using Gama.Types;
using LLVMSharp.Interop;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Gama.Compiler.Units
{
    public class GamaStructCompiler : GamaBaseVisitor<bool>, IFinalize
    {
        public GamaTopLevelCompiler Parent { get; }
        public GamaTypeRef StructType { get; }

        public GamaStructCompiler(GamaTopLevelCompiler parent, GamaTypeRef structty)
        {
            Parent = parent;
            StructType = structty;
        }

        public override bool VisitStructLevelMethod([NotNull] GamaParser.StructLevelMethodContext context)
        {
            var fndef = context.topLevelFuncDef();
            var name = fndef.Symbol().GetText();
            GamaFunctionList fnlist = null;
            if (name == "new") 
                fnlist = StructType.Meta.Constructors;
            else
                fnlist = StructType.Meta.GetMethod(name);

            if (fnlist == null)
                fnlist = new GamaFunctionList(name);

            var retty = InstanceTypes.Void;
            var tyname = fndef.typeName();
            if (tyname != null)
            {
                retty = Parent.NamespaceContext.FindTypeRefGlobal(tyname);
                if (retty == null)
                {
                    Parent.GlobalContext.AddError(new ErrorTypeNotFound(tyname));
                    return false;
                }
            }

            var stplist = fndef.symbolTypePairList();
            var paramlist = new GamaParamList();

            paramlist.Add("this", new GamaPointer(StructType)); // add self as a pointer since this is a method

            if (stplist != null)
            {
                var pairs = stplist.symbolTypePair();
                foreach (var p in pairs)
                {
                    var ty = Parent.NamespaceContext.FindTypeRefGlobal(p.typeName());
                    if (ty == null)
                    {
                        Parent.GlobalContext.AddError(new ErrorTypeNotFound(p.typeName()));
                        return false;
                    }
                    if (!paramlist.Add(p.Symbol().GetText(), ty))
                    {
                        Parent.GlobalContext.AddError(new ErrorDuplicateParameter(p));
                        return false;
                    }
                }
            }

            if (fnlist.FindFunction(paramlist) != null)
            {
                Parent.GlobalContext.AddError(new ErrorDuplicateMethod(fndef));
                return false;
            }

            var modty = new GamaFunction(retty, paramlist.Parameters.Select(p => p.Type).ToArray(), LLVMTypeRef.CreateFunction(retty.UnderlyingType, paramlist.Parameters.Select(p => p.Type.UnderlyingType).ToArray()));
            var modfn = Parent.GlobalContext.Module.AddFunction($"{ StructType.Name }.{ name }", modty.UnderlyingType);

            var fn = new GamaFunctionRef(retty, paramlist, modty, modfn);

            var unit = new GamaFunctionCompiler(Parent.NamespaceContext, fn);
            unit.Visit(fndef.block());
            if (unit.Finish() == 0)
            {
                // TODO: handle type method attributes
                fnlist.AddFunction(fn);
            }
            else;

            return true;
        }

        public int Finish()
        {
            return 0;
        }
    }
}
