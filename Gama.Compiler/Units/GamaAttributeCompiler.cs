using System;
using System.Collections.Generic;
using System.Linq;

using Antlr4.Runtime.Misc;
using Gama.Interop;

namespace Gama.Compiler.Units
{
    public class GamaAttributeCompiler : GamaBaseVisitor<GamaAttributeSet>
    {
        public class AttributeRule
        {
            public enum Type
            {
                Int, Float, String, Symbol
            }

            public string Name { get; }
            public List<Type> ArgTypes { get; }

            public AttributeRule(string name, params Type[] args)
            {
                Name = name;
                ArgTypes = new List<Type>(args);
            }
        }

        public GamaTopLevelCompiler Parent { get; }

        public GamaAttributeCompiler(GamaTopLevelCompiler parent)
        {
            Parent = parent;
        }

        public static List<AttributeRule> Rules { get; } = new List<AttributeRule>()
        {
            /* This attribute hides function/struct from other namespaces */
            new AttributeRule("hide"),
            
            /* This attribute marks function/struct as obsolete and compiler will create a warning for it's use */
            new AttributeRule("obsolete"),

            /* This attribute marks function/struct as unsafe which enables unsafe read/write of memory */
            new AttributeRule("unsafe"),

            /* This attribute marks function as private, which is only usable in same type */
            new AttributeRule("private"),
        };

        public AttributeRule FindRule(string attr)
        {
            foreach (var r in Rules)
                if (r.Name == attr)
                    return r;
            return null;
        }

        public override GamaAttributeSet VisitFuncAttr([NotNull] GamaParser.FuncAttrContext context)
        {
            var names = context.Symbol().Select(s => s.GetText()).ToArray();
            if (names.Distinct().Count() != names.Length)
            {
                Parent.GlobalContext.AddError(new ErrorDuplicateAttributeUsage(context));
                return null;
            }
            var list = new GamaAttributeSet();
            for (int i = 0; i < names.Length; i++)
            {
                var name = names[i];
                var rule = FindRule(name);
                if (rule == null)
                {
                    Parent.GlobalContext.AddError(new ErrorUnknownAttribute(context));
                    return null;
                }

                var symlist = context.symbolList(i);
                if (symlist == null)
                {
                    if (rule.ArgTypes.Count != 0)
                    {
                        Parent.GlobalContext.AddError(new ErrorWrongAttributeUsage(symlist));
                        return null;
                    }

                    list.Add(new GamaAttribute(name));
                }
                else
                {
                    var syms = symlist.Symbol().Select(s => s.GetText()).ToArray();
                    if (syms.Length != rule.ArgTypes.Count)
                    {
                        Parent.GlobalContext.AddError(new ErrorWrongAttributeUsage(symlist));
                        return null;
                    }

                    list.Add(new GamaAttribute(name, syms));
                }
            }

            return list;
        }
    }
}
