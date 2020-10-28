using System;
using System.Collections.Generic;
using System.Text;
using Gama.Interop.Attributes;
using LLVMSharp.Interop;

namespace Gama.Interop
{
    public class GamaTypeRef
    {
        private static int id = 0;

        public GamaTypeRef Parent { get; set; }

        public int ID { get; }
        public string Name { get; set; }

        public LLVMTypeRef UnderlyingType { get; }

        public GamaMetaRef Meta { get; }

        public GamaTypeRef(string name, LLVMTypeRef type, GamaTypeRef parent)
        {
            ID = id++;
            Name = name;
            Parent = parent;
            UnderlyingType = type;
            Meta = new GamaMetaRef(this);
        }

        public GamaTypeRef(string name, LLVMTypeRef type)
        {
            ID = id++;
            Name = name;
            UnderlyingType = type;
            Meta = new GamaMetaRef(this);
        }

        [RiskyUsage("This constructor does not initialize native LLVM type, using it will segfault compiler.")]
        public GamaTypeRef(string name)
        {
            ID = id++;
            Name = name;
            Meta = new GamaMetaRef(this);
        }

        public bool IsSubtypeOf(GamaTypeRef r)
        {
            var p = this;
            while (p != null)
            {
                if (p == r)
                    return true;
                p = p.Parent;
            }
            return false;
        }

        // Overridable compatible definitions
        // Useful for libraries that don't know each other
        // And custom compatible implementations
        public virtual bool Compatible(GamaTypeRef other)
        {
            return this == other;
        }

        public virtual void Initialize()
        {
            return;
        }

        public static bool operator==(GamaTypeRef l, GamaTypeRef r)
        {
            return l?.ID == r?.ID;
        }

        public static bool operator!=(GamaTypeRef l, GamaTypeRef r)
        {
            return l?.ID != r?.ID;
        }

        public override int GetHashCode()
        {
            return ID;
        }

        public override bool Equals(object obj)
        {
            return obj is GamaTypeRef @ref && @ref == this;
        }

        public override string ToString()
        {
            return $"type({ Name }, { ID })";
        }
    }
}
