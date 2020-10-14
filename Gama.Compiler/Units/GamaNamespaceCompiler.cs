using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Gama.Interop;

using Antlr4.Runtime.Misc;
using System.IO;
using Antlr4.Runtime;

namespace Gama.Compiler.Units
{
    public class GamaNamespaceCompiler : GamaBaseVisitor<GamaNamespace>
    {
        public GamaGlobalContext GlobalContext { get; set; }

        public GamaNamespaceCompiler(GamaGlobalContext ctx)
        {
            GlobalContext = ctx;
        }

        /* Added to a namespace of own */
        public override GamaNamespace VisitNamespaceDefault([NotNull] GamaParser.NamespaceDefaultContext context)
        {
            var fqtn = context.fqtn();
            var names = fqtn.Symbol().Select(s => s.GetText()).ToArray();
            var ns = GlobalContext.GetOrCreateNamespaceChain(names);
            if (!new GamaTopLevelCompiler(GlobalContext, ns).Visit(context.topLevelBlock()))
                return null;
            return ns;
        }

        /* Added to a namespace, child of root */
        public override GamaNamespace VisitNamespaceRootStart([NotNull] GamaParser.NamespaceRootStartContext context)
        {
            var fqtn = context.fqtnRoot();
            var names = fqtn.Symbol().Select(s => s.GetText()).ToArray();
            var ns = GlobalContext.Root.GetOrCreateNamespaceChain(names);
            if (!new GamaTopLevelCompiler(GlobalContext, ns).Visit(context.topLevelBlock()))
                return null;
            return ns;
        }

        /* Added to root namespace */
        public override GamaNamespace VisitNamespaceRoot([NotNull] GamaParser.NamespaceRootContext context)
        {
            if (!new GamaTopLevelCompiler(GlobalContext, GlobalContext.Root).Visit(context.topLevelBlock()))
                return null;
            return GlobalContext.Root;
        }

        // Well, this is not a namespace creator, instead this will import everything from another file
        public override GamaNamespace VisitImportStmt([NotNull] GamaParser.ImportStmtContext context)
        {
            var file = context.StringLiteral().GetText().Trim('"');
            
            if (GlobalContext.ImportedFiles.Contains(file))
                return null; // just skip already included files, this is dumb, fix later: TODO:

            if (!file.EndsWith(".gm"))
                file += ".gm";
            if (!File.Exists(file))
            {
                file = "./include/" + file; // TODO: might need fixing to app path
                if (!File.Exists(file))
                {
                    Console.WriteLine("Imported file not found: '{0}'", file);
                    // GlobalContext.AddError(new ErrorImportFileNotFound(file));
                    return null;
                }
            }

            GlobalContext.ImportedFiles.Add(file);

            var input = new AntlrInputStream(File.ReadAllText(file));
            var lexer = new GamaLexer(input);
            var tokens = new CommonTokenStream(lexer);
            var parser = new GamaParser(tokens);
            var program = parser.program();
            if (parser.NumberOfSyntaxErrors > 0)
            {
                Console.WriteLine("Imported file contains syntax errors, aborting compilation.");
                return null;
            }
            var unit = new GamaNamespaceCompiler(GlobalContext);
            unit.Visit(program);

            return null;
        }
    }
}
