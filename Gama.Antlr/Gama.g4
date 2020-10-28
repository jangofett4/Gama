/* Gama.g4
 * Author: Yahya GEDİK
 * antlr -visitor -Dlanguage=Csharp
 */

grammar Gama;

program
    : namespace* EOF
    ;

namespace
    : Namespace fqtn topLevelBlock      #NamespaceDefault   /* Contents will be added to a namespace of own, or existing                */
    | Namespace fqtnRoot topLevelBlock  #NamespaceRootStart /* Contents will be added to a namespace of own, or existing, child of root */
    | Namespace topLevelBlock           #NamespaceRoot      /* Contents will be added to root namespace directly                        */
    | Import StringLiteral SC           #ImportStmt         /* Contents of the file will be parsed and added to current context         */
    ;
    
topLevelStatement
    : topLevelUsingNamespace SC
	| topLevelDelegate SC
	| topLevelExternDef	SC
    | topLevelFuncDef
    | topLevelStructDef
	| topLevelImpl
    ;

structLevelStatement
    : topLevelDelegate SC	#StructLevelDelegate
    | topLevelFuncDef		#StructLevelMethod
    ;

/* Statements
 *  Not all statements need semicolon at the end of them
 *  Those that need semicolon has a 'SC' rule at the end
 *  These statements are handled by rules themselves
 *  - Since rules like 'if' can have variations this makes it easier to compile them 
 */
statement
    : stmtVarDef SC
    | stmtAssign SC
    | stmtIf
    | stmtWhile 
    | stmtFnCall SC
	| stmtReturn SC
    ;

stmtVarDef
    : Let Symbol Equals expr        	        #StmtVarDefBase
    | Let Symbol Colon typeName  Equals expr	#StmtVarDefFull
    | Let Symbol Colon typeName                 #StmtVarDefNull
    ;

stmtAssign
    : expr Equals expr
    ;

stmtIf
    : If LP expr RP block                                           #StmtIfBase
    | If LP expr RP block Else block                                #StmtIfElse
    | If LP expr RP block (Else If LP expr RP block)+               #StmtIfElseIf
    | If LP expr RP block (Else If LP expr RP block)+ Else block    #StmtIfElseIfElse
    ;
	
stmtReturn
	: Return		#StmtReturnVoid
	| Return expr	#StmtReturnValue
	;

stmtWhile
    : While LP expr RP block    #StmtWhileBase
    | Do block While LP expr RP #StmtDoWhile
    ;

stmtFnCall
    : expr LP exprList RP
    ;


topLevelBlock
    : LB topLevelStatement* RB
    ;

block
    : LB statement* RB
    ;

expr
    : LP expr RP            #ExprParenthesis
	| AND expr				#ExprAddressOf
	| MUL expr				#ExprPointerLoad
    /*| NullLiteral         #ExprLiteralNull*/
    | IntegerLiteral        #ExprLiteralInteger
	| FloatingLiteral		#ExprLiteralFloating
    | (True | False)        #ExprLiteralBoolean
    | CharLiteral           #ExprLiteralChar
    | StringLiteral         #ExprLiteralString
	| fqtn					#ExprFQTN
	| expr LP exprList? RP  #ExprCall
    | expr ('.' Symbol)+    #ExprFQMB
    | expr opMul expr       #ExprOpMul
    | expr opAdd expr       #ExprOpAdd
    | expr opComp expr      #ExprOpComp
    | expr opLogic expr     #ExprOpLogic
    ;

exprList
    : expr (Comma expr)*
    ;

topLevelUsingNamespace
    : Using Namespace fqtn
    ;

/* delegate test_fn_type() : void; */
topLevelDelegate
	: Delegate Symbol LP fqtnList? RP (Colon fqtn)
	;

/* extern printf(char*); */
topLevelExternDef
	: Extern Symbol LP typeList? RP ellipsis? (Colon typeName)?
	;

topLevelFuncDef
    : funcAttr? Symbol LP symbolTypePairList? RP (Colon typeName)? block 
    ;

/* struct vector2 { x: f32, y: f32 } */
topLevelStructDef
    : Packed? Struct Symbol LB symbolTypePairList? RB
    ;

/* impl vector2 { add(l: vector2, r: vector2) { ... } } */
topLevelImpl
    : Impl fqtn LB structLevelStatement* RB
    ;

symbolTypePairList
    : symbolTypePair (Comma symbolTypePair)*
    ;

symbolTypePair
    : Symbol Colon typeName
    ;

ellipsis
    : '...'
    ;

funcAttr
	: LQ (Symbol (LP symbolList RP)?)+ RQ
	;
	
symbolList
	: Symbol (',' Symbol)*
	;
	
opMul   : MUL | DIV | MOD;
opAdd   : ADD | SUB;
opComp  : LT | GT | LE | GE | EQ | NE;
opLogic : AND AND | OR OR | XOR;

LT  : '<';
GT  : '>';
LE  : '<=';
GE  : '>=';
EQ  : '==';
NE  : '!=';

ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';

LP  : '(';
RP  : ')';
LB  : '{';
RB  : '}';
LQ  : '[';
RQ  : ']';

AND	: '&';
OR	: '|';
XOR	: '^';

HASH: '#';

SC      : ';';
NSDiv   : '::';
Colon   : ':';
Comma   : ',';
Period  : '.';
Equals  : '=';

Namespace   : 'namespace';
Let         : 'let';
Operator    : 'operator';
Using       : 'using';
Return		: 'return';
Delegate	: 'delegate';
Extern		: 'extern';
Packed      : 'packed';
Struct      : 'struct';
Impl        : 'impl';
True		: 'true';
False		: 'false';
Import      : 'import';
StackAlloc  : 'stackalloc';
New         : 'new';

If      : 'if';
Else    : 'else';
While   : 'while';
Do      : 'do';

OpMul   : MUL | DIV | MOD;
OpAdd   : ADD | SUB;
OpComp  : LT | GT | LE | GE | EQ | NE;

OpComparison
    : LT | GT | LE | GE | EQ | NE
    ;

// Fully qualified type name
/* Examples:
 *  i32, i64, ::f32, ::i32
 *  std::stl::array, std::stl::list etc
 *  if using namespace std::stl then ::array, ::list etc becomes available
 *  if using namespace std then stl::array, std::list etc becomes available
 */
fqtnRoot    : Symbol (NSDiv Symbol)*;	    /* Mainly useful for root namespaces eg: namespace ::hello { ... }, or: ::i32 etc.  */
fqtn        : Symbol (NSDiv Symbol)*;	    /* Default fully qualified type name eg: namespace hello { ... }, or i32 etc.       */
fqtnList	: fqtn (Comma fqtn)*;		    /* Mainly used for function type definitions eg: void(i32, f32)						*/
typeList    : typeName (Comma typeName)*;   /* Replacer for fqtnList usage, used for function defs etc                          */

typeName    : fqtn ptr*;
ptr         : MUL;

Symbol
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

fragment EscapeSequence	: SingleEscape;
fragment SingleEscape	: ['"\\bfnrtv];
    
fragment SuffixFloat    : [fF];
fragment SuffixDouble   : [dD];
fragment SuffixLong     : [lL];
fragment SuffixUnsigned : [uU];
fragment SuffixShort    : [sS];
fragment SuffixDecimal  : [mM];
fragment NumericSuffix  : SuffixFloat | SuffixDouble | SuffixLong | SuffixUnsigned | SuffixShort | SuffixDecimal;

StringLiteral   : '"' DoubleStringChar* '"';
CharLiteral     : '\'' SingleStringChar '\'';
FloatingLiteral : IntegerLiteral? '.' [0-9]+;
IntegerLiteral
    : '0'
    | [1-9] [0-9]*
    | '0' [xX] [0-9a-fA-F]
    | '0b' [0-1]+
    ;
NumericLiteral
    : FloatingLiteral
    | IntegerLiteral
    ;

MultiComment	: '/*' .*? '*/'					-> channel(HIDDEN);
LineComment		: '//' ~[\r\n\u2028\u2029]*		-> channel(HIDDEN);
WhiteSpace		: [ \t\r\n]+					-> skip;
