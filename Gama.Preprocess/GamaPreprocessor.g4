/* GamaPreprocess.g4
 * Author: Yahya GEDİK
 * antlr -visitor -Dlanguage=Csharp
 */

grammar GamaPreprocessor;

program
    : preStatement* EOF
    ;

preStatement
    : preInclude    #PreprocessorIncludeStmt
    | preDefine     #PreprocessorDefineStmt
    | preUndef      #PreprocessorUndefStmt
    | preIf         #PreprocessorIf
    | preIfdef      #PreprocessorIfdefStmt
    | preIfndef     #PreprocessorIfndefStmt
    | prePragma     #PreprocessorPragmaStmt
    | preWarning    #PreprocessorWarning
    | preError      #PreprocessorError
    ;
    
Hash        : '#';
PreInclude  : Hash 'include';
PreDefine   : Hash 'define';
PreUndef    : Hash 'undef';
PreSet      : Hash 'set';
PreIf       : Hash 'if';
PreIfDef    : Hash 'ifdef';
PreIfndef   : Hash 'ifndef';
PreElse     : Hash 'else';
PreEndif    : Hash 'endif';
PrePragmna  : Hash 'pragma';
Warning     : 'warning';
Disable     : 'disable';
Restore     : 'restore';
Once        : 'once';

LT  : '<';
GT  : '>';
LE  : '<=';
GE  : '>=';
EQ  : '==';
NE  : '!=';

OpComparison
    : LT | GT | LE | GE | EQ | NE
    ;

preInclude
    : PreInclude StringLiteral
    ;

symbolList
    : Symbol (',' Symbol)*
    ;

preDefine
    : PreDefine Symbol                                      #StmtPreDefineBool
    | PreDefine Symbol NonNewlineString                      #StmtPreDefineAbsolute
    | PreDefine Symbol '(' symbolList? ')' NonNewlineString #StmtPreDefineMacro
    ;

preSet
    : PreSet Symbol NonNewlineChar+
    ;

preUndef
    : PreUndef Symbol
    ;

preIf
    : PreIf Symbol EQ StringLiteral preblock=.*? (PreElse preelse=.*?) PreEndif             #StmtPreIfStringEq
    | PreIf Symbol NE StringLiteral preblock=.*? (PreElse preelse=.*?) PreEndif             #StmtPreIfStringNe
    | PreIf Symbol OpComparison NumericLiteral preblock=.*? (PreElse preelse=.*?) PreEndif  #StmtPreIfNumericComp
    ;

preIfdef
    : PreIfdef Symbol preblock=.*? (PreElse preelse=.*?) PreEndif
    ;

preIfndef
    : PreIfndef Symbol preblock=.*? (PreElse preelse=.*?) PreEndif
    ;

prePragma
    : PrePragma Once
    | PrePragma Warning Disable StringLiteral
    | PrePragma Warning Restore StringLiteral
    ;

preWarning
    : PreWarning StringLiteral
    ;

preError
    : PreError StringLiteral
    ;

SC  : ';';
ADD : '+';
NEG : '-';
MUL : '*';
DIV : '/';

fragment Symbol
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

/* Anything except whitespace and ' */
fragment SingleStringChar
	: ~['\\\r\n]
	| '\\' EscapeSequence
	;
/* Anything except whitespace and " */
fragment DoubleStringChar
	: ~["\\\r\n]
	| '\\' EscapeSequence
	;

fragment NonNewlineChar
    : ~[\n]
    ;

fragment NonNewlineString
    : NonNewlineChar+
    ;

fragment EscapeSequence	: SingleEscape;
fragment SingleEscape	: ['"\\bfnrtv];
    
fragment SuffixFloat    : [fF];
fragment SuffixDouble   : [dD];
fragment SuffixLong     : [lL];
fragment SuffixUnsigned : [uU];
fragment SuffixShort    : [sS];
fragment SuffixDecimal  : [mM];
    
NullLiteral     : 'null';
StringLiteral   : '"' DoubleStringChar* '"';
CharLiteral     : '\'' SingleStringChar '\'';
BooleanLiteral  : 'true' | 'false';
FloatingLiteral : IntegerLiteral? '.' [0-9]+;
IntegerLiteral  :
    ( '0'
    | [1-9] [0-9]*
    | '0' [xX] [0-9a-fA-F]
    | '0b' [0-1]+
    );

MultiComment	: '/*' .*? '*/'					-> channel(HIDDEN);
LineComment		: '//' ~[\r\n\u2028\u2029]*		-> channel(HIDDEN);
WhiteSpace		: [ \t\r\n]+					-> channel(HIDDEN);
src             : .                             #Source;