using System;
using System.Collections.Generic;
using System.Text;

using Gama.Interop;

namespace Gama.Compiler
{
    public class GamaStackFrame
    {
        private Stack<GamaFrame> Stack { get; set; }
        
        public GamaFrame Top { get; private set; }

        public GamaFrame Root { get; set; }

        public GamaStackFrame()
        {
            Root = new GamaFrame();
            Top = Root;

            Stack = new Stack<GamaFrame>();
            Stack.Push(Root);
        }

        public GamaFrame Push()
        {
            var frame = new GamaFrame(Peek());
            Stack.Push(frame);
            Top = frame;
            return frame;
        }

        public GamaFrame Peek()
        {
            return Stack.Peek();
        }

        public GamaFrame Pop()
        {
            var ret = Stack.Pop();
            Top = Stack.Peek();
            return ret;
        }

        public void Scrap()
        {
            Stack.Pop();
            Top = Stack.Peek();
        }
    }

    public class GamaFrame
    {
        public GamaFrame Parent { get; set; }

        public Dictionary<string, GamaValueRef> NamedValues { get; set; }

        public GamaFrame()
        {
            NamedValues = new Dictionary<string, GamaValueRef>();
        }

        public GamaFrame(GamaFrame parent)
        {
            Parent = parent;
            NamedValues = new Dictionary<string, GamaValueRef>();
        }

        public bool AddValue(string name, GamaValueRef val)
        {
            if (NamedValues.ContainsKey(name))
                return false;
            NamedValues[name] = val;
            return true;
        }

        public GamaValueRef FindValue(string name)
        {
            if (!NamedValues.TryGetValue(name, out GamaValueRef output))
                return null;
            return output;
        }

        public GamaValueRef FindValueRecursive(string name)
        {
            var found = FindValue(name);
            if (found == null)
            {
                if (Parent == null)
                    return null;
                return Parent.FindValueRecursive(name);
            }
            return found;
        }
    }
}
