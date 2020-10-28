using System;
using System.Collections.Generic;
using System.Text;

using Gama.Interop;

namespace Gama.Compiler
{
    /* GamaNamespace
     *  Virtual namespace definition used to organize types
     *  Namespaces can contain pretty much all top level elements (structs, functions etc)
     */
    public class GamaNamespace
    {
        public GamaNamespace Parent { get; set; }

        public string Name { get; }

        public List<GamaStructRef> Structs { get; set; }

        // static and 'member' functions
        // member functions are just glorified static functions (in this language at least)
        public List<GamaFunctionList> Functions { get; set; }

        // Types in this context
        public List<GamaTypeRef> Types { get; set; }

        // Namespaces in this namespace
        public List<GamaNamespace> Namespaces { get; set; }

        public GamaGlobalContext Context { get; set; }

        public GamaNamespace(string name, GamaGlobalContext ctx)
        {
            Name = name;

            Structs = new List<GamaStructRef>();
            Functions = new List<GamaFunctionList>();
            Types = new List<GamaTypeRef>();
            Namespaces = new List<GamaNamespace>();

            Context = ctx;
        }

        public GamaNamespace(string name, GamaNamespace parent, GamaGlobalContext ctx) : this(name, ctx)
        {
            Parent = parent;
        }

        public GamaNamespace FindNamespace(string name) => Namespaces.Find(n => n.Name == name);
        public GamaFunctionList FindFunction(string name) => Functions.Find(f => f.Name == name);

        public GamaTypeRef FindType(string name) => Types.Find(f => f.Name == name);
        public GamaStructRef FindStruct(string name) => null; // TODO: implement after structs

        public GamaNamespace GetOrCreateNamespaceChain(params string[] names)
        {
            var ns = this;
            foreach (var n in names)
                ns = ns.GetOrCreateNamespace(n);
            return ns;
        }

        public GamaNamespace GetOrCreateNamespace(string name)
        {
            foreach (var n in Namespaces)
                if (n.Name == name)
                    return n;
            var ns = new GamaNamespace(name, this, Context);
            Namespaces.Add(ns);
            return ns;
        }

        /* Basic rundown of Find...Chain functions below:
         *  Using given parameter 'names' search sub-namespaces
         *  Last name parameter is not searched as namespace, but a Type, function or a struct
         */
        // NamespaceContext sends FQTN's still containing origin namespace
        // If thats the case, skip it. TODO: might introduce compiler bugs
        // Do more tests and possibly change the algorithm for FQTN probing
        public GamaTypeRef FindTypeChain(params string[] names)
        {
            int i = 0;
            if (names[0] == Name)
                i = 1;
            var ns = this;
            for (; i < names.Length - 1; i++) // every name, except last
            {
                if (ns == null)
                    return null; // Name or part of the name does not exists in current context
                ns = ns.FindNamespace(names[i]);
            }
            if (ns == null)
                return null;
            return ns.FindType(names[names.Length - 1]);
        }

        public GamaFunctionList FindFunctionChain(params string[] names)
        {
            int i = 0;
            if (names[0] == Name)
                i = 1;
            var ns = this;
            for (; i < names.Length - 1; i++)
            {
                if (ns == null)
                    return null;
                ns = ns.FindNamespace(names[i]);
            }
            if (ns == null)
                return null;
            return ns.FindFunction(names[names.Length - 1]);
        }

        public GamaStructRef FindStructChain(params string[] names)
        {
            int i = 0;
            if (names[0] == Name)
                i = 1;
            var ns = this;
            for (; i < names.Length - 1; i++)
            {
                if (ns == null)
                    return null;
                ns = ns.FindNamespace(names[i]);
            }
            if (ns == null)
                return null;
            return ns.FindStruct(names[names.Length - 1]);
        }
    }
}
