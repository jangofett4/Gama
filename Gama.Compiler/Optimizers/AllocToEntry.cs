using Gama.Compiler.Units;

using LLVMSharp;
using LLVMSharp.Interop;

using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Compiler.Optimizers
{
    public class AllocToEntry : IVisitor<GamaFunctionCompiler, int>
    {
        public int Visit(GamaFunctionCompiler instance)
        {
            Console.WriteLine("#[optimizer alloc2entry] {0} {{ ");
            var entry = instance.Self.Blocks[0][0];
            
            var inslist = new List<LLVMValueRef>();
            
            // var builder = new IRBuilder();
            for (int i = 1; i < instance.Self.Blocks.Count; i++)
            {
                var iblocks = instance.Self.Blocks[i];
                foreach (var ib in iblocks.Items)
                {
                    var ins = ib.Block.FirstInstruction;
                    int insid = 0;
                    while (ins != null && !ins.IsNull)
                    {
                        if (ins.IsAAllocaInst != null)
                            Console.WriteLine(" <insmove {0}, {1}, {2}, beg>", ib.Name, insid, entry.Name);
                        insid++;
                        ins = ins.NextInstruction;
                    }
                }
            }

            Console.WriteLine("}");

            return 0;
        }
    }
}
