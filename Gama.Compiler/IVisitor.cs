using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Compiler
{
    public interface IVisitor<T, K>
    {
        K Visit(T instance);
    }
}
