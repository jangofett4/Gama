using System;
using System.Collections.Generic;
using LLVMSharp.Interop;

namespace Gama.Interop
{
    public class GamaBlockGroup : ObjectGroup<GamaBlockRef>
    {
        public GamaBlockGroup(string name) : base(name) { }
    }

    public class GamaBlockRef
    {
        public LLVMBasicBlockRef Block { get; set; }

        public string Name { get; }

        public GamaBlockRef(string name, LLVMBasicBlockRef block)
        {
            Block = block;
            Name = name;
        }

        public bool HasTerminator()
        {
            return Block.Terminator != null;
        }

        // These two methods assume that 'before' and 'after' blocks are residing in same function
        // If they are not either:
        //  - Compiler has a bug
        //  - Somebody edited the binaries (or code itself, a.k.a compiler has a bug v2: electric boogaloo)
        public void MoveBefore(GamaBlockRef before) => Block.MoveBefore(before.Block);
        public void MoveAfter(GamaBlockRef after) => Block.MoveAfter(after.Block);

        public void PositionBuilderAtStart(LLVMBuilderRef builder) => builder.Position(Block, Block.FirstInstruction);
        public void PositionBuilderAtEnd(LLVMBuilderRef builder) => builder.PositionAtEnd(Block);
    }
}
