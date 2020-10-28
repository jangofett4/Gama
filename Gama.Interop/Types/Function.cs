using Gama.Interop;
using Gama.Interop.Attributes;

using LLVMSharp.Interop;
using System;

namespace Gama.Types
{
    // This is a special type
    // This type is instantiated with a native LLVM type but compared with interop'd types
    // Used with delegate types currently, next version might implement lambda functions
    public class GamaFunction : GamaTypeRef
    {
        public GamaTypeRef ReturnType { get; }
        public GamaTypeRef[] ParameterTypes { get; }
        public bool IsVarArg { get; }

        /* This constuctor should only be used by expression compiler               */
        /* Expression compiler passes types around for correct function probing     */
        /* This types don't need native LLVM counterparts, they are not initialized */
        [RiskyUsage("Should only be used by expression compiler, does not initialize native LLVM type.")]
        public GamaFunction(GamaTypeRef ret, GamaTypeRef[] parms, bool vararg = false) : base("", null)
        {
            ReturnType = ret;
            ParameterTypes = parms;
            IsVarArg = vararg;
        }

        public GamaFunction(string name, GamaTypeRef ret, GamaTypeRef[] parms, LLVMTypeRef fntype, bool vararg = false) : base(name, fntype)
        {
            ReturnType = ret;
            ParameterTypes = parms;
            IsVarArg = vararg;
        }

        public GamaFunction(GamaTypeRef ret, GamaTypeRef[] parms, LLVMTypeRef fntype, bool vararg = false) : base("[internal]", fntype)
        {
            ReturnType = ret;
            ParameterTypes = parms;
            IsVarArg = vararg;
        }

        /* Checks if another function type is compatible with this one                          */
        /* Mainly useful for assigning function to variables or sending functions as parameters */
        /* Check Units.GamaExpressionCompiler.cs for target type stack implementation           */
        public override bool Compatible(GamaTypeRef other)
        {
            if (!(other is GamaFunction fnt)) return false; // Non-compatible with non function types
            if (fnt.ReturnType != ReturnType || ParameterTypes.Length != fnt.ParameterTypes.Length)
                return false;
            for (int i = 0; i < ParameterTypes.Length; i++)
                if (!fnt.ParameterTypes[i].IsSubtypeOf(ParameterTypes[i]))
                    return false;
            return true;
        }
        /*
        public bool Compatible(GamaTypeRef ret, GamaTypeRef[] parms)
        {
            if (ret != ReturnType || ParameterTypes.Length != parms.Length)
                return false;
            for (int i = 0; i < ParameterTypes.Length; i++)
                if (!parms [i].IsSubtypeOf(ParameterTypes[i]))
                    return false;
            return true;
        }
        */
    }
}
