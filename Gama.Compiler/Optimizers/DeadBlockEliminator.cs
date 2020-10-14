using System;
using Gama.Compiler.Units;

namespace Gama.Compiler.Optimizers
{
    /// <summary>
    /// Gets rid of unnecessary blocks that are caused by bad compiler design
    /// Also tends to break compilation (which was already broken before blocks are eliminated)
    /// </summary>
    public class DeadBlockEliminator : IVisitor<GamaFunctionCompiler, int>
    {
        public int Visit(GamaFunctionCompiler instance)
        {
            int total = 0;
            foreach (var group in instance.Self.Blocks)
                foreach (var block in group.Items)
                    if (block.Block.LastInstruction == null) // empty block
                    {
                        block.Block.RemoveFromParent();
                        total++;
                    }
            return total;
        }
    }
}
