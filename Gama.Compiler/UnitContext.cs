using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Compiler
{
    public class UnitContext<T>
    {
        public T Parent { get; set; }
        public T This { get; set; }

        public UnitContext(T self, T parent)
        {
            Parent = parent;
            This = self;
        }
    }
}
