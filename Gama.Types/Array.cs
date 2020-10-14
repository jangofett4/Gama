using Gama.Interop;
using LLVMSharp.Interop;
using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Types
{
    public class GamaArray : GamaTypeRef
    {
        public GamaTypeRef ElementType { get; }

        public GamaArray(GamaTypeRef elemtype, int size) : base($"{ elemtype.Name }[{ size }]", LLVMTypeRef.CreateArray(elemtype.UnderlyingType, (uint)size))
        {
            ElementType = elemtype;
        }

        public override bool Compatible(GamaTypeRef other)
        {
            return other is GamaArray a && a.ElementType == ElementType;
        }
    }
}
