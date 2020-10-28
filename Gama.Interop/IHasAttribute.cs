using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Gama.Interop
{
    public interface IHasAttribute
    {
        GamaAttributeSet Attributes { get; set; }

        bool HasAttribute(string name);
    }
}
