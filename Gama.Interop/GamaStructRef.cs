using LLVMSharp.Interop;
using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Interop
{
    public class GamaStructRef : GamaTypeRef
    {
        public GamaStructRef(string name, LLVMTypeRef ty) : base(name, ty)
        {

        }
    }
}
