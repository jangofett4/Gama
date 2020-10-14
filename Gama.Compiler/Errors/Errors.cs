using System;
using Gama.Error;
using Antlr4.Runtime;

namespace Gama.Compiler
{
	public class ErrorTypeNotFound : GamaError
	{
		public ErrorTypeNotFound(ParserRuleContext ctx) : base("Type {0} is not found, are you missing a reference?", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorIdentifierNotFound : GamaError
	{
		public ErrorIdentifierNotFound(ParserRuleContext ctx) : base("Identifier {0} is not found in current context, are you missing a reference?", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorDuplicateVariable : GamaError
	{
		public ErrorDuplicateVariable(ParserRuleContext ctx) : base("Variable name {0} is already defined in this context.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorDuplicateFunction : GamaError
	{
		public ErrorDuplicateFunction(ParserRuleContext ctx) : base("Function {0} is already defined with same parameters in current context.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorDuplicateParameter : GamaError
	{
		public ErrorDuplicateParameter(ParserRuleContext ctx) : base("Parameters {0} is defined more than once.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorFunctionNeedsReturn : GamaError
	{
		public ErrorFunctionNeedsReturn(ParserRuleContext ctx) : base("Function {0} does not return a value in all paths.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorVoidReturnsValue : GamaError
	{
		public ErrorVoidReturnsValue(ParserRuleContext ctx) : base("Cannot return value from function {0}, it's return type is void.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorTypeMismatch : GamaError
	{
		public ErrorTypeMismatch(ParserRuleContext ctx) : base("Cannot assign/return type {0}, [formatter.2] expected.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorDuplicateIdentity : GamaError
	{
		public ErrorDuplicateIdentity(ParserRuleContext ctx) : base("Function identifier {0} is used twice in same namespace.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorDuplicateType : GamaError
	{
		public ErrorDuplicateType(ParserRuleContext ctx) : base("Type {0} is defined twice in current context.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorVariableVoid : GamaError
	{
		public ErrorVariableVoid(ParserRuleContext ctx) : base("Unable to define a variable with void type: {0}.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorNonPointerLoad : GamaError
	{
		public ErrorNonPointerLoad(ParserRuleContext ctx) : base("Unable to load non-pointer value: {0}.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorNonFunctionCall : GamaError
	{
		public ErrorNonFunctionCall(ParserRuleContext ctx) : base("Unable to call non-function expression: {0}.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorDuplicateAttributeUsage : GamaError
	{
		public ErrorDuplicateAttributeUsage(ParserRuleContext ctx) : base("Attribute {0} is used twice for same type.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorWrongAttributeUsage : GamaError
	{
		public ErrorWrongAttributeUsage(ParserRuleContext ctx) : base("Attribute {0} is wrong, [rule] expected.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorUnknownAttribute : GamaError
	{
		public ErrorUnknownAttribute(ParserRuleContext ctx) : base("Unknown attribute: {0}.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorNoViableOverride : GamaError
	{
		public ErrorNoViableOverride(ParserRuleContext ctx) : base("No viable override for {0} that takes given arguments.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorAmbiguousCall : GamaError
	{
		public ErrorAmbiguousCall(ParserRuleContext ctx) : base("Ambiguous function call: {0}.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorDuplicateField : GamaError
	{
		public ErrorDuplicateField(ParserRuleContext ctx) : base("Field name {0} is used twice in same struct definition.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorEmptyStruct : GamaError
	{
		public ErrorEmptyStruct(ParserRuleContext ctx) : base("Unable to define empty struct '{0}', use empty type instead.", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorDuplicateMethod : GamaError
	{
		public ErrorDuplicateMethod(ParserRuleContext ctx) : base("Method {0} is already defined for [formatter.2]", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorNoViableOperator : GamaError
	{
		public ErrorNoViableOperator(ParserRuleContext ctx) : base("No valid operator found for operation: {0}", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorAssignToNonModLValue : GamaError
	{
		public ErrorAssignToNonModLValue(ParserRuleContext ctx) : base("Attempt to assign value to a non modifiable l-value: {0}", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorInternalExpressionNull : GamaError
	{
		public ErrorInternalExpressionNull(ParserRuleContext ctx) : base("Compiler internal error: Expression is null: {0}", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
	public class ErrorInternalUnknownError : GamaError
	{
		public ErrorInternalUnknownError(ParserRuleContext ctx) : base("Compiler internal error: Unknown fatal error: {0}", ctx, ctx.GetText())
		{
			// Auto-generated stub code using error2src.py file
		}
	}
}