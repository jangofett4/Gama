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
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="GamaPreprocessorParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public interface IGamaPreprocessorListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="GamaPreprocessorParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProgram([NotNull] GamaPreprocessorParser.ProgramContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GamaPreprocessorParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProgram([NotNull] GamaPreprocessorParser.ProgramContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>PreprocessorIncludeStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreprocessorIncludeStmt([NotNull] GamaPreprocessorParser.PreprocessorIncludeStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>PreprocessorIncludeStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreprocessorIncludeStmt([NotNull] GamaPreprocessorParser.PreprocessorIncludeStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>PreprocessorDefineStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreprocessorDefineStmt([NotNull] GamaPreprocessorParser.PreprocessorDefineStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>PreprocessorDefineStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreprocessorDefineStmt([NotNull] GamaPreprocessorParser.PreprocessorDefineStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>PreprocessorUndefStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreprocessorUndefStmt([NotNull] GamaPreprocessorParser.PreprocessorUndefStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>PreprocessorUndefStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreprocessorUndefStmt([NotNull] GamaPreprocessorParser.PreprocessorUndefStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>PreprocessorIf</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreprocessorIf([NotNull] GamaPreprocessorParser.PreprocessorIfContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>PreprocessorIf</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreprocessorIf([NotNull] GamaPreprocessorParser.PreprocessorIfContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>PreprocessorIfdefStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreprocessorIfdefStmt([NotNull] GamaPreprocessorParser.PreprocessorIfdefStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>PreprocessorIfdefStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreprocessorIfdefStmt([NotNull] GamaPreprocessorParser.PreprocessorIfdefStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>PreprocessorIfndefStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreprocessorIfndefStmt([NotNull] GamaPreprocessorParser.PreprocessorIfndefStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>PreprocessorIfndefStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreprocessorIfndefStmt([NotNull] GamaPreprocessorParser.PreprocessorIfndefStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>PreprocessorPragmaStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreprocessorPragmaStmt([NotNull] GamaPreprocessorParser.PreprocessorPragmaStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>PreprocessorPragmaStmt</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreprocessorPragmaStmt([NotNull] GamaPreprocessorParser.PreprocessorPragmaStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>PreprocessorWarning</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreprocessorWarning([NotNull] GamaPreprocessorParser.PreprocessorWarningContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>PreprocessorWarning</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreprocessorWarning([NotNull] GamaPreprocessorParser.PreprocessorWarningContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>PreprocessorError</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreprocessorError([NotNull] GamaPreprocessorParser.PreprocessorErrorContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>PreprocessorError</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreprocessorError([NotNull] GamaPreprocessorParser.PreprocessorErrorContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GamaPreprocessorParser.preInclude"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreInclude([NotNull] GamaPreprocessorParser.PreIncludeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GamaPreprocessorParser.preInclude"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreInclude([NotNull] GamaPreprocessorParser.PreIncludeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GamaPreprocessorParser.symbolList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSymbolList([NotNull] GamaPreprocessorParser.SymbolListContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GamaPreprocessorParser.symbolList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSymbolList([NotNull] GamaPreprocessorParser.SymbolListContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>StmtPreDefineBool</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preDefine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmtPreDefineBool([NotNull] GamaPreprocessorParser.StmtPreDefineBoolContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>StmtPreDefineBool</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preDefine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmtPreDefineBool([NotNull] GamaPreprocessorParser.StmtPreDefineBoolContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>StmtPreDefineAbsolute</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preDefine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmtPreDefineAbsolute([NotNull] GamaPreprocessorParser.StmtPreDefineAbsoluteContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>StmtPreDefineAbsolute</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preDefine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmtPreDefineAbsolute([NotNull] GamaPreprocessorParser.StmtPreDefineAbsoluteContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>StmtPreDefineMacro</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preDefine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmtPreDefineMacro([NotNull] GamaPreprocessorParser.StmtPreDefineMacroContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>StmtPreDefineMacro</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preDefine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmtPreDefineMacro([NotNull] GamaPreprocessorParser.StmtPreDefineMacroContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GamaPreprocessorParser.preSet"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreSet([NotNull] GamaPreprocessorParser.PreSetContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GamaPreprocessorParser.preSet"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreSet([NotNull] GamaPreprocessorParser.PreSetContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GamaPreprocessorParser.preUndef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreUndef([NotNull] GamaPreprocessorParser.PreUndefContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GamaPreprocessorParser.preUndef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreUndef([NotNull] GamaPreprocessorParser.PreUndefContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>StmtPreIfStringEq</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preIf"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmtPreIfStringEq([NotNull] GamaPreprocessorParser.StmtPreIfStringEqContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>StmtPreIfStringEq</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preIf"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmtPreIfStringEq([NotNull] GamaPreprocessorParser.StmtPreIfStringEqContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>StmtPreIfStringNe</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preIf"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmtPreIfStringNe([NotNull] GamaPreprocessorParser.StmtPreIfStringNeContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>StmtPreIfStringNe</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preIf"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmtPreIfStringNe([NotNull] GamaPreprocessorParser.StmtPreIfStringNeContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>StmtPreIfNumericComp</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preIf"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmtPreIfNumericComp([NotNull] GamaPreprocessorParser.StmtPreIfNumericCompContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>StmtPreIfNumericComp</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.preIf"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmtPreIfNumericComp([NotNull] GamaPreprocessorParser.StmtPreIfNumericCompContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GamaPreprocessorParser.preIfdef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreIfdef([NotNull] GamaPreprocessorParser.PreIfdefContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GamaPreprocessorParser.preIfdef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreIfdef([NotNull] GamaPreprocessorParser.PreIfdefContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GamaPreprocessorParser.preIfndef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreIfndef([NotNull] GamaPreprocessorParser.PreIfndefContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GamaPreprocessorParser.preIfndef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreIfndef([NotNull] GamaPreprocessorParser.PreIfndefContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GamaPreprocessorParser.prePragma"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrePragma([NotNull] GamaPreprocessorParser.PrePragmaContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GamaPreprocessorParser.prePragma"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrePragma([NotNull] GamaPreprocessorParser.PrePragmaContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GamaPreprocessorParser.preWarning"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreWarning([NotNull] GamaPreprocessorParser.PreWarningContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GamaPreprocessorParser.preWarning"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreWarning([NotNull] GamaPreprocessorParser.PreWarningContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GamaPreprocessorParser.preError"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreError([NotNull] GamaPreprocessorParser.PreErrorContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GamaPreprocessorParser.preError"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreError([NotNull] GamaPreprocessorParser.PreErrorContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>Source</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.src"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSource([NotNull] GamaPreprocessorParser.SourceContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>Source</c>
	/// labeled alternative in <see cref="GamaPreprocessorParser.src"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSource([NotNull] GamaPreprocessorParser.SourceContext context);
}
