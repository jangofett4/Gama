## Function Resolution

In language 'Gama' there are compilation units within compilers. The main compiler (source code compiler) has these compilers:
 - Namespace compiler
 - Top level compiler
 - Attribute compiler
 - Function compiler
 - Expression compiler
 
These compilers generally don't know what is happening in one another. They can call each other and can learn/manipulate current state of them.
But for example when a variable definition is being compiled, expression compiler has no idea what type it should return unless function compiler explicitly specifies it.

Top level compiler has the job of compiling and adding the functions and structs in a namespace.
When adding a new function, top level compiler checks if there is already a function list with same name.
If there is, function will be added to that list. If not, then a function list is created and added to current namespace.
Top level compiler creates a function signature by resolving the parameter types. If the function list contains another function with same signature, an error is added to global context.
Top level compiler then creates a new attribute and function compiler unit, and compiles the function accordingly.

Since a function can have multiple overloads, resolving these overloads are mandatory. Normally function signature consists of only parameter types.
But to resolve call expressions that send function pointers as parameters, return type is included in signature too.

```
Do((int):void, (float):void) { ... }
Do((float):void, (int):void) { ... }

Fn(int x) { ... }
Fn(float x) { ... }

Do(Fn, Fn);
```

Which 'Do' function does compiler needs to select? This is an ambiguous function call expression, therefore this would create a compiler error.
To detect if a call expression is ambiguous, compiler needs to do following:

```
fn = FindFunctionList("Do")
ambiguous = AmbiguousCallHandler(fn)

for param, index in context.Parameters {
	value = VisitExpression(param)
	
	// Given parameter is a function list
	// Needs to be resolved first
	if value is FunctionList {
		ambiguous.Resolve(index, (FunctionList)value);	
	} else {
		ambiguous.Resolve(index, value) // Since this is a fixed type, super helpful for resolving ambiguous expressions
	}
}

callback = ambiguous.Resolve();
if !callback {
	AddError("Ambiguous call between: {0}", ambiguous.RemainingStr())
	return null;
}

args = ambiguous.ResolvedArgs;

/* Compile callback and args */
...

```

Ambiguous call handler is handling most of the work. Basic structure of call handler is like following:

```
class AmbiguousCallHandler {
	Remaining = List();
	
	Args = {
		Fixed = [],
		Ambiguous = []
	}
	
	Resolve(index, val) {
		Args.Fixed[index] = val
		
		Remaining.RemoveAll(cb => {
			cb.Parameters[index].Type == val.Type
		})
	}
	
	Resolve(index, func) {
		Args.Ambiguous[index] = func
		
		func.ForEach(fn => {
			Remaining.RemoveAll(cb => {
				return !fn.Compatible(cb.Parameters[index].Type)
			})		
		})
	}
	
	Resolve() {
		if Remaining.Length != 1 {
			return null
		}
		return Remaining[0]
	}
}
```