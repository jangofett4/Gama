using System;

using Gama.Interop;
using LLVMSharp.Interop;

namespace Gama.Types
{
    public class GamaF64 : GamaTypeRef
    {
        public GamaF64() : base("f64", LLVMTypeRef.Double) { }
    }
}
