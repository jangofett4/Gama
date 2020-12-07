using Gama.Types;

using LLVMSharp.Interop;

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Gama.Interop
{
    /// <summary>
    /// Class to resolve function calls, see FunctionResolution.md for more information.
    /// </summary>
    public class GamaFunctionResolver
    {
        private Dictionary<int, GamaValueRef> FixedArgs;
        private Dictionary<int, GamaFunctionList> AmbiguousArgs;

        public string Name { get; }
        public List<GamaFunctionRef> Remaining { get; }

        public GamaFunctionResolver(GamaFunctionList list)
        {
            Name = list.Name;

            FixedArgs = new Dictionary<int, GamaValueRef>();
            AmbiguousArgs = new Dictionary<int, GamaFunctionList>();

            // Create copy of original callbacks
            Remaining = new List<GamaFunctionRef>(list.Callbacks);
        }

        /* Resolve using a fixed type                               */
        /* Generally main reducing factor of remaining overloads    */
        public void Resolve(int index, GamaValueRef fixedValue)
        {
            if (index < 0) return;
            
            FixedArgs[index] = fixedValue;

            Remaining.RemoveAll((fnref) =>
            {
                if (fnref.IsMethod) index++; // skip first for object reference
                var ty = fnref.Type as GamaFunction;
                if (fnref.Parameters.Count == 0)
                    return true;
                if (index >= fnref.Parameters.Count)
                {
                    if (ty.IsVarArg)
                        return false;
                    return true;
                }
                return !fnref.Parameters[index].Type.Compatible(fixedValue.Type);
            });
        }

        /* This is the main reason why function resolver is created and used            */
        /* Resolving function that take functions as parameters create quite a ruckus   */
        /* Thats why they need special care and algorithm                               */
        public void Resolve(int index, GamaFunctionList fnlist)
        {
            if (index < 0) return;

            AmbiguousArgs[index] = fnlist;

            Remaining.RemoveAll((fnref) =>
            {
                if (fnref.IsMethod) index++; // skip first for object reference
                var ty = fnref.Type as GamaFunction;
                if (fnref.Parameters.Count == 0)
                    return true;
                if (index >= fnref.Parameters.Count)
                {
                    if (ty.IsVarArg)
                        return false;
                    return true;
                }
                // Check this later: TODO
                foreach (var cb in fnlist.Callbacks)
                {
                    var paramty = fnref.Parameters[index].Type;
                    if (paramty is GamaPointer ptr)
                        paramty = ptr.BaseType;
                    if (cb.Type.Compatible(paramty))
                        return false;
                }
                return true;
            });
        }

        public enum ArgResolveStatus
        {
            Success,
            ErrorAmbiguous,
            ErrorNotEnoughArgs,
            ErrorFunctionInVararg,
            ErrorArgCountMismatch,
        }

        /* Returns resolved parameters for the function call            */
        /* If remaining number of functions is not one reuturns a null  */
        // TODO: maybe change GamaValueRef to LLVMValueRef to gain some performance
        public (ArgResolveStatus, GamaValueRef[]) ResolveArgs()
        {
            if (Remaining.Count != 1) return (ArgResolveStatus.ErrorAmbiguous, null);
            var fnref = Remaining[0];
            var ty = fnref.Type as GamaFunction;
            
            var argcount = FixedArgs.Count + AmbiguousArgs.Count;
            var fnrefparmscount = fnref.Parameters.Count;

            if (ty.IsVarArg)
            {
                if (argcount < fnrefparmscount) return (ArgResolveStatus.ErrorNotEnoughArgs, null);
                var start = fnref.IsMethod ? 1 : 0; // clever hack to let compiler decide first argument
                var args = new GamaValueRef[argcount + start];
                for (int i = start; i < args.Length; i++)
                {
                    if (i >= fnrefparmscount) // vararg
                    {
                        if (FixedArgs.TryGetValue(i, out GamaValueRef fixedval))
                            args[i] = fixedval;
                        else
                            return (ArgResolveStatus.ErrorFunctionInVararg, null);
                    }
                    else
                    {
                        var param = fnref.Parameters[i];
                        if (FixedArgs.TryGetValue(i, out GamaValueRef fixedval))
                            args[i] = fixedval;
                        else
                        {
                            var list = AmbiguousArgs[i];
                            var fnty = param.Type as GamaFunction;
                            args[i] = list.FindFunction(fnty.ReturnType, fnty.ParameterTypes);
                        }
                    }
                }

                return (ArgResolveStatus.Success, args);
            }
            else
            {
                var start = fnref.IsMethod ? 1 : 0;
                if (argcount + start != fnrefparmscount) return (ArgResolveStatus.ErrorArgCountMismatch, null);
                var args = new GamaValueRef[fnrefparmscount];
                for (int i = start; i < fnrefparmscount; i++)
                {
                    var param = fnref.Parameters[i];
                    if (FixedArgs.TryGetValue(i - start, out GamaValueRef fixedval))
                        args[i] = fixedval;
                    else
                    {
                        var list = AmbiguousArgs[i - start];
                        var fnty = param.Type as GamaFunction;
                        args[i] = list.FindFunction(fnty.ReturnType, fnty.ParameterTypes);
                    }
                }

                return (ArgResolveStatus.Success, args);
            }
        }

        /* This function does NOT determine if this call is fully resolved  */
        /* Is function resolved until now?                                  */
        /* If it is, returns a function reference                           */
        /* If it doesn't, returns a null reference                          */
        /* Expression compiler also needs to check remaining function count */
        public GamaFunctionRef Resolve()
        {
            if (Remaining.Count != 1)
                return null;
            return Remaining[0];
        }

        /* Good for printing out error messages */
        public string RemainingFunctionListToString()
        {
            var sb = new StringBuilder();
            var remstr = Remaining.Select(cb => string.Join(", ", cb.Parameters.Parameters.Select(p => p.Type.Name))).ToList();

            for (int i = 0; i < remstr.Count; i++)
            {
                sb.Append($"{ Name }({ remstr[i] })");
                if (i == remstr.Count - 1)
                    break;
                sb.Append(", ");
            }

            return sb.ToString();
        }
    }
}
