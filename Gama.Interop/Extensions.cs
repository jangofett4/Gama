using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Interop
{
    public static unsafe class Extensions
    {
        public static sbyte* GetSbytePtr(this string str)
        {
            fixed (byte* ptr = Encoding.ASCII.GetBytes(str))
                return (sbyte*)ptr;
        }
    }
}
