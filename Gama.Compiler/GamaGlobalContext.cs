using System;
using System.Collections.Generic;
using System.Text;

using Gama.Error;
using Gama.Interop;
using LLVMSharp;
using LLVMSharp.Interop;

namespace Gama.Compiler
{
    /* This is the global compilation context used for most type checkings
     */
    public class GamaGlobalContext
    {
        public GamaErrorCollection ErrorList { get; set; }

        public LLVMModuleRef Module { get; private set; }
        public LLVMContextRef Context { get; private set; }

        public string ModuleName { get; private set; }

        // Used for standard types and non-context user types
        public GamaNamespace Root { get; set; }
        public List<GamaNamespace> Namespaces { get; set; }
        
        public List<string> ImportedFiles { get; set; }

        public GamaGlobalContext(string name)
        {
            ModuleName = $"{ name }.mod";

            ErrorList = new GamaErrorCollection();

            Module = LLVMModuleRef.CreateWithName(ModuleName);
            Context = Module.Context;

            Root = new GamaNamespace("[root]", this);
            Namespaces = new List<GamaNamespace>();

            ImportedFiles = new List<string>();

            // I know this is 'unsafe', but these methods are not implemeted to their OOP counterparts yet
            // So I am stuck with this for now
            unsafe
            {
                LLVM.SetDataLayout(Module, "e-m:w-i64:64-f80:128-n8:16:32:64-S128".GetSbytePtr());
                if (Environment.OSVersion.Platform == PlatformID.Unix)
                    LLVM.SetTarget(Module, "x86_64-pc-linux-gnu".GetSbytePtr());
                else
                    LLVM.SetTarget(Module, "x86_64-pc-windows".GetSbytePtr());

            }
        }

        public void AddError(GamaError error)
        {
            ErrorList.Add(error);
        }

        public GamaNamespace GetOrCreateNamespaceChain(params string[] names)
        {
            var ns = GetOrCreateNamespace(names[0]); // 0 is always there, so this shouldn't be a problem. If it's not, then there is a compiler bug
            for (int i = 1; i < names.Length; i++)
                ns = ns.GetOrCreateNamespace(names[i]);
            return ns;
        }

        public GamaNamespace GetOrCreateNamespace(string name)
        {
            foreach (var n in Namespaces)
                if (n.Name == name)
                    return n;
            var ns = new GamaNamespace(name, this);
            Namespaces.Add(ns);
            return ns;
        }
    }
}
