using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Interop
{
    // TODO: change operator callback fields to dictionaries
    public class GamaMetaRef
    {
        public GamaTypeRef Parent { get; set; }

        public GamaOperatorList Operators { get; set; }
        public GamaOperatorListCompiled CompiledOperators { get; set; }

        public List<GamaFunctionList> Methods { get; set; }
        public GamaFunctionList Constructors { get; set; }
        public List<GamaFieldRef> Fields { get; set; }

        public GamaMetaRef(GamaTypeRef parent)
        {
            Parent = parent;

            Operators = new GamaOperatorList();
            CompiledOperators = new GamaOperatorListCompiled();

            Methods = new List<GamaFunctionList>();
            Fields = new List<GamaFieldRef>();
            Constructors = new GamaFunctionList(".new");
        }

        public GamaFieldRef GetField(string name) => Fields.Find(f => f.Name == name);
        public GamaFunctionList GetMethod(string name) => Methods.Find(m => m.Name == name);
        public GamaFunctionRef GetConstructor(params GamaTypeRef[] paramtypes) => Constructors.FindFunction(paramtypes);
    }

    public class GamaOperatorList
    {
        public GamaFunctionList Add { get; set; }
        public GamaFunctionList Sub { get; set; }
        public GamaFunctionList Mul { get; set; }
        public GamaFunctionList Div { get; set; }
        public GamaFunctionList Mod { get; set; }

        public GamaFunctionList And { get; set; }
        public GamaFunctionList Or { get; set; }
        public GamaFunctionList Xor { get; set; }

        public GamaFunctionList Eq { get; set; }
        public GamaFunctionList Neq { get; set; }

        public GamaFunctionList Gt { get; set; }
        public GamaFunctionList Ge { get; set; }
        public GamaFunctionList Lt { get; set; }
        public GamaFunctionList Le { get; set; }

        // TODO: add casting operators

        public GamaOperatorList()
        {
            Add = new GamaFunctionList("+");
            Sub = new GamaFunctionList("-");
            Mul = new GamaFunctionList("*");
            Div = new GamaFunctionList("/");
            Mod = new GamaFunctionList("%");

            And = new GamaFunctionList("&");
            Or = new GamaFunctionList("|");
            Xor = new GamaFunctionList("^");

            Eq = new GamaFunctionList("==");
            Neq = new GamaFunctionList("!=");

            Gt = new GamaFunctionList(">");
            Ge = new GamaFunctionList(">=");
            Lt = new GamaFunctionList("<");
            Le = new GamaFunctionList("<=");
        }
    }

    public class GamaOperatorListCompiled
    {
        public GamaCompiledFunctionList Add { get; set; }
        public GamaCompiledFunctionList Sub { get; set; }
        public GamaCompiledFunctionList Mul { get; set; }
        public GamaCompiledFunctionList Div { get; set; }
        public GamaCompiledFunctionList Mod { get; set; }

        public GamaCompiledFunctionList And { get; set; }
        public GamaCompiledFunctionList Or { get; set; }
        public GamaCompiledFunctionList Xor { get; set; }

        public GamaCompiledFunctionList Eq { get; set; }
        public GamaCompiledFunctionList Neq { get; set; }

        public GamaCompiledFunctionList Gt { get; set; }
        public GamaCompiledFunctionList Ge { get; set; }
        public GamaCompiledFunctionList Lt { get; set; }
        public GamaCompiledFunctionList Le { get; set; }

        public GamaOperatorListCompiled()
        {
            Add = new GamaCompiledFunctionList("+");
            Sub = new GamaCompiledFunctionList("-");
            Mul = new GamaCompiledFunctionList("*");
            Div = new GamaCompiledFunctionList("/");
            Mod = new GamaCompiledFunctionList("%");

            And = new GamaCompiledFunctionList("&");
            Or = new GamaCompiledFunctionList("|");
            Xor = new GamaCompiledFunctionList("^");
            
            Eq = new GamaCompiledFunctionList("==");
            Neq = new GamaCompiledFunctionList("!=");
            
            Gt = new GamaCompiledFunctionList(">");
            Ge = new GamaCompiledFunctionList(">=");
            Lt = new GamaCompiledFunctionList("<");
            Le = new GamaCompiledFunctionList("<=");
        }
    }
}
