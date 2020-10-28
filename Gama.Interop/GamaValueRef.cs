using System;
using System.Collections.Generic;
using System.Text;

using LLVMSharp.Interop;

namespace Gama.Interop
{
    public class GamaValueRef
    {
        public GamaTypeRef Type { get; set; }
        public bool IsModifiableLValue { get; set; } // Used for variables

        public LLVMValueRef Value { get; set; }

        public GamaValueRef(GamaTypeRef type, LLVMValueRef value, bool ismodlval)
        {
            Type = type;
            Value = value;
            IsModifiableLValue = ismodlval;
        }
    }
}
