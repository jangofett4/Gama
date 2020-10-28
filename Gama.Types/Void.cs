using System;

using Gama.Interop;
using LLVMSharp.Interop;

namespace Gama.Types
{
    public class GamaVoid : GamaTypeRef
    {
        public GamaVoid() : base("void", LLVMTypeRef.Void) { }
    }
}
