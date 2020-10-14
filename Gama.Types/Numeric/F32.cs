using System;

using Gama.Interop;
using LLVMSharp.Interop;

namespace Gama.Types
{
    public class GamaF32 : GamaTypeRef
    {
        public GamaF32() : base("f32", LLVMTypeRef.Float) { }
    }
}
