using LLVMSharp;
using LLVMSharp.Interop;

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Gama.Interop
{
    public class GamaFunctionList : IFinalize
    {
        public string Name { get; }
        public List<GamaFunctionRef> Callbacks { get; set; }

        public GamaFunctionList(string name)
        {
            Name = name;
            Callbacks = new List<GamaFunctionRef>();
        }

        public GamaFunctionRef FindFunction(GamaParamList parms, bool skipHidden = false)
        {
            foreach (var cb in Callbacks)
            {
                if (cb.Parameters.Count != parms.Count) continue;
                bool found = true;
                for (int i = 0; i < parms.Count; i++)
                    if (cb.Parameters[i].Type != parms[i].Type)
                    {
                        found = false;
                        break;
                    }

                if (found)
                {
                    // Skipping hidden types are useful for hiding some functions from other namespaces
                    // This won't stop this type from apparing in same namespace tho
                    if (skipHidden && cb.HasAttribute("hide"))
                        continue;
                    else
                        return cb;
                }

            }
            return null;
        }

        public GamaFunctionRef FindFunction(GamaTypeRef[] parms, bool skipHidden = false)
        {
            foreach (var cb in Callbacks)
            {
                if (cb.Parameters.Count != parms.Length) continue;
                bool found = true;
                for (int i = 0; i < parms.Length; i++)
                    if (cb.Parameters[i].Type != parms[i])
                    {
                        found = false;
                        break;
                    }

                if (found)
                {
                    // Skipping hidden types are useful for hiding some functions from other namespaces
                    // This won't stop this type from apparing in same namespace tho
                    if (skipHidden && cb.HasAttribute("hide"))
                        continue;
                    else
                        return cb;
                }
                
            }
            return null;
        }

        public GamaFunctionRef FindFunction(GamaTypeRef ret, GamaTypeRef[] parms, bool skipHidden = false)
        {
            foreach (var cb in Callbacks)
            {
                if (cb.Parameters.Count != parms.Length) continue;
                if (cb.ReturnType != ret) continue;

                bool found = true;
                for (int i = 0; i < parms.Length; i++)
                    if (cb.Parameters[i].Type != parms[i])
                    {
                        found = false;
                        break;
                    }

                if (found)
                {
                    // Skipping hidden types are useful for hiding some functions from other namespaces
                    // This won't stop this type from apparing in same namespace tho
                    if (skipHidden && cb.HasAttribute("hide"))
                        continue;
                    else
                        return cb;
                }
            }
            return null;
        }

        public void AddFunction(GamaFunctionRef fn) => Callbacks.Add(fn);

        // Returns next name for an override of this function
        public string GetNextName()
        {
            return $"{ Name }:{ Callbacks.Count }";
        }

        /* Returns i + 1 if an override does not terminate all of its blocks.
         * Returns 0 if overrides are ok
         */
        public int Finish()
        {
            for (int i = 0; i < Callbacks.Count; i++)
            {
                if (Callbacks[i].Finish() != 0)
                    return i + 1;
            }
            return 0;
        }
    }

    public class GamaParamRef
    {
        public uint Index { get; set; }
        public string Name { get; set; }
        public GamaTypeRef Type { get; set; }

        public GamaParamRef(uint index, string name, GamaTypeRef type)
        {
            Index = index;
            Name = name;
            Type = type;
        }

        public GamaParamRef(string name, GamaTypeRef type)
        {
            Name = name;
            Type = type;
        }
    }

    public class GamaParamList
    {
        public List<GamaParamRef> Parameters { get; }
        public int Count { get { return Parameters.Count; } }

        public GamaParamRef this[string name]
        {
            get { return Find(name); }
        }

        public GamaParamRef this[int index]
        {
            get { return Parameters[index]; }
        }

        public GamaParamList()
        {
            Parameters = new List<GamaParamRef>();
        }

        public bool Add(string name, GamaTypeRef type)
        {
            if (Parameters.Find(p => p.Name == name) != null)
                return false;
            Parameters.Add(new GamaParamRef((uint)Parameters.Count, name, type));
            return true;
        }

        public bool Add(GamaParamRef param)
        {
            if (Parameters.Find(p => p.Name == param.Name) != null)
                return false;
            param.Index = (uint)Parameters.Count;
            Parameters.Add(param);
            return true;
        }

        public GamaParamRef Find(string name)
        {
            return Parameters.Find(p => p.Name == name);
        }
    }

    public class GamaFunctionRef : GamaValueRef
    {
        public GamaAttributeSet Attributes { get; set; }
        public List<ObjectGroup<GamaBlockRef>> Blocks { get; set; }

        public GamaTypeRef ReturnType { get; set; }
        public GamaParamList Parameters { get; set; }

        public bool IsMethod { get; set; }

        public GamaFunctionRef(GamaTypeRef ret, GamaParamList parms, GamaTypeRef ty, LLVMValueRef val, bool ismethod) : base(ty, val, true)
        {
            Blocks = new List<ObjectGroup<GamaBlockRef>>();
            ReturnType = ret;
            Parameters = parms;
            Attributes = new GamaAttributeSet();
            IsMethod = ismethod;
        }

        public GamaBlockRef AddBlock(string name)
        {
            foreach (var b in Blocks)
            {
                if (b.Name == name)
                {
                    name = b.Next();
                    var block = new GamaBlockRef(name, Value.AppendBasicBlock(name));
                    b.Add(block);
                    return block;
                }
            }
            var group = new ObjectGroup<GamaBlockRef>(name);
            name = group.Next();
            var blk = new GamaBlockRef(name, Value.AppendBasicBlock(name));
            group.Add(blk);
            Blocks.Add(group);
            return blk;
        }

        public GamaAttribute Attribute(string name)
        {
            foreach (var a in Attributes)
                if (a.Name == name)
                    return a;
            return null;
        }

        public bool HasAttribute(string name)
        {
            foreach (var a in Attributes)
                if (a.Name == name)
                    return true;
            return false;
        }

        /* Finish function can connect blocks that are not terminated. This would create compiler bugs such as if true block connected to a false block.
         * For this reason finish function only returns error code -1 if not all of the blocks are terminated. And 0 if all blocks are terminated.
         */
        public int Finish()
        {
            foreach (var g in Blocks)
                foreach (var b in g.Items)
                    if (!b.HasTerminator())
                        return -1;
            return 0;
        }
    }
}
