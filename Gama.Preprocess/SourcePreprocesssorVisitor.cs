using Antlr4.Runtime.Misc;

using System;
using System.Collections.Generic;

using Gama.Error;
using System.Text;

namespace Gama.Preprocess
{
    public class SourcePreprocesssorVisitor : GamaPreprocessorBaseVisitor<bool>
    {
        public GamaErrorCollection Errors { get; set; }
        
        public Dictionary<string, string> Defines { get; set; }

        public StringBuilder Output { get; set; }

        public SourcePreprocesssorVisitor()
        {
            Defines = new Dictionary<string, string>();
            Errors = new GamaErrorCollection();
        }

        public override bool VisitStmtPreDefineBool([NotNull] GamaPreprocessorParser.StmtPreDefineBoolContext context)
        {
            var name = context.Symbol().GetText();
            if (Defines.ContainsKey(name))
                return false;
            Defines.Add(name, "");
            return true;
        }

        public override bool VisitStmtPreDefineAbsolute([NotNull] GamaPreprocessorParser.StmtPreDefineAbsoluteContext context)
        {
            var name = context.Symbol().GetText();
            if (Defines.ContainsKey(name))
                return false;
            Defines.Add(name, context.NonNewlineString().GetText());
            return true;
        }

        public override bool VisitStmtPreDefineMacro([NotNull] GamaPreprocessorParser.StmtPreDefineMacroContext context)
        {
            throw new NotImplementedException("Macro defines are not implemented.");
        }

        public override bool VisitPreprocessorUndefStmt([NotNull] GamaPreprocessorParser.PreprocessorUndefStmtContext context)
        {
            var undef = context.preUndef();
            var name = undef.Symbol().GetText();
            if (!Defines.ContainsKey(name))
                return false;
            Defines.Remove(name);
            return true;
        }

        public override bool VisitPreprocessorIncludeStmt([NotNull] GamaPreprocessorParser.PreprocessorIncludeStmtContext context)
        {
            throw new NotImplementedException("Source code include is not implemented yet.");
        }
    }
}
