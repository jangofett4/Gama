using System;

using Gama.Interop;
using LLVMSharp.Interop;

namespace Gama.Types
{
    public class GamaChar : GamaTypeRef
    {
        public GamaChar() : base("char", LLVMTypeRef.Int8) { }
    }
}
