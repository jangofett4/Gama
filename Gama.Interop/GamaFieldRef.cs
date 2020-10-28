using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Interop
{
    public class GamaFieldRef
    {
        public string Name { get; }
        public int Index { get; }

        public GamaTypeRef Type { get; }

        public GamaFieldRef(string name, int idx, GamaTypeRef type)
        {
            Name = name;
            Index = idx;
            Type = type;
        }
    }
}
