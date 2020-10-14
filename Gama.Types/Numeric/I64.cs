using System;

using Gama.Interop;
using LLVMSharp.Interop;

namespace Gama.Types
{
    public class GamaI64 : GamaTypeRef
    {
        public GamaI64() : base("i64", LLVMTypeRef.Int64) { }
    }
}
