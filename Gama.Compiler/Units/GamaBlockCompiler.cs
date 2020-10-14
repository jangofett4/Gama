using Gama.Interop;
using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Compiler.Units
{
    public class GamaBlockCompiler : GamaBaseVisitor<bool>, IFinalize
    {
        public GamaBlockRef Block { get; set; }

        public GamaBlockCompiler(GamaBlockRef block)
        {

        }

        public int Finish()
        {
            return 0;
        }
    }
}
