//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.8
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from GamaPreprocessor.g4 by ANTLR 4.8

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="GamaPreprocessorParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public interface IGamaPreprocessorVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="GamaPreprocessorParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProgram([NotNull] GamaPreprocessorParser.ProgramContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>PreprocessorIncludeStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreprocessorIncludeStmt([NotNull] GamaPreprocessorParser.PreprocessorIncludeStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>PreprocessorDefineStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreprocessorDefineStmt([NotNull] GamaPreprocessorParser.PreprocessorDefineStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>PreprocessorUndefStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreprocessorUndefStmt([NotNull] GamaPreprocessorParser.PreprocessorUndefStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>PreprocessorIf</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreprocessorIf([NotNull] GamaPreprocessorParser.PreprocessorIfContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>PreprocessorIfdefStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreprocessorIfdefStmt([NotNull] GamaPreprocessorParser.PreprocessorIfdefStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>PreprocessorIfndefStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreprocessorIfndefStmt([NotNull] GamaPreprocessorParser.PreprocessorIfndefStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>PreprocessorPragmaStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreprocessorPragmaStmt([NotNull] GamaPreprocessorParser.PreprocessorPragmaStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>PreprocessorWarning</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreprocessorWarning([NotNull] GamaPreprocessorParser.PreprocessorWarningContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>PreprocessorError</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreprocessorError([NotNull] GamaPreprocessorParser.PreprocessorErrorContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GamaPreprocessorParser.preInclude"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreInclude([NotNull] GamaPreprocessorParser.PreIncludeContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GamaPreprocessorParser.symbolList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSymbolList([NotNull] GamaPreprocessorParser.SymbolListContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>StmtPreDefineBool</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preDefine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStmtPreDefineBool([NotNull] GamaPreprocessorParser.StmtPreDefineBoolContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>StmtPreDefineAbsolute</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preDefine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStmtPreDefineAbsolute([NotNull] GamaPreprocessorParser.StmtPreDefineAbsoluteContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>StmtPreDefineMacro</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preDefine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStmtPreDefineMacro([NotNull] GamaPreprocessorParser.StmtPreDefineMacroContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GamaPreprocessorParser.preSet"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreSet([NotNull] GamaPreprocessorParser.PreSetContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GamaPreprocessorParser.preUndef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreUndef([NotNull] GamaPreprocessorParser.PreUndefContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>StmtPreIfStringEq</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preIf"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStmtPreIfStringEq([NotNull] GamaPreprocessorParser.StmtPreIfStringEqContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>StmtPreIfStringNe</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preIf"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStmtPreIfStringNe([NotNull] GamaPreprocessorParser.StmtPreIfStringNeContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>StmtPreIfNumericComp</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preIf"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStmtPreIfNumericComp([NotNull] GamaPreprocessorParser.StmtPreIfNumericCompContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GamaPreprocessorParser.preIfdef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreIfdef([NotNull] GamaPreprocessorParser.PreIfdefContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GamaPreprocessorParser.preIfndef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreIfndef([NotNull] GamaPreprocessorParser.PreIfndefContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GamaPreprocessorParser.prePragma"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPrePragma([NotNull] GamaPreprocessorParser.PrePragmaContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GamaPreprocessorParser.preWarning"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreWarning([NotNull] GamaPreprocessorParser.PreWarningContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GamaPreprocessorParser.preError"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreError([NotNull] GamaPreprocessorParser.PreErrorContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Source</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.src"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSource([NotNull] GamaPreprocessorParser.SourceContext context);
}
