using System;

using Gama.Interop;
using LLVMSharp.Interop;

namespace Gama.Types
{
    public class GamaBool : GamaTypeRef
    {
        public GamaBool() : base("bool", LLVMTypeRef.Int1) { }

        public override void Initialize()
        {
            Meta.CompiledOperators.And.AddFunction(new GamaCompiledFunctionRef(InstanceTypes.Bool, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildAnd(args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Or.AddFunction(new GamaCompiledFunctionRef(InstanceTypes.Bool, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildOr(args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Xor.AddFunction(new GamaCompiledFunctionRef(InstanceTypes.Bool, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildXor(args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Eq.AddFunction(new GamaCompiledFunctionRef(InstanceTypes.Bool, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildICmp(LLVMIntPredicate.LLVMIntEQ, args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Neq.AddFunction(new GamaCompiledFunctionRef(InstanceTypes.Bool, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildICmp(LLVMIntPredicate.LLVMIntNE, args[0].Value, args[1].Value), false);
            }));
        }
    }
}
