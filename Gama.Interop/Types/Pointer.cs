using Gama.Interop;
using LLVMSharp.Interop;
using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Types
{
    public class GamaPointer : GamaTypeRef
    {
        public GamaTypeRef BaseType { get; }

        public GamaPointer(string name, GamaTypeRef basetype) : base(name, LLVMTypeRef.CreatePointer(basetype.UnderlyingType, 0))
        {
            BaseType = basetype;
        }

        public GamaPointer(GamaTypeRef basetype) : base("[pointer]", LLVMTypeRef.CreatePointer(basetype.UnderlyingType, 0))
        {
            BaseType = basetype;
        }

        public override bool Compatible(GamaTypeRef other)
        {
            return other is GamaPointer ptr && ptr.BaseType.Compatible(BaseType);
            // return base.Compatible(other);
        }
    }
}
