using System;

using Gama.Interop;
using LLVMSharp.Interop;

namespace Gama.Types
{
    public class GamaI32 : GamaTypeRef
    {
        public GamaI32() : base("i32", LLVMTypeRef.Int32) { }

        public override void Initialize()
        {
            Meta.CompiledOperators.Add.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(this, builder.BuildAdd(args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Sub.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(this, builder.BuildSub(args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Mul.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(this, builder.BuildMul(args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Div.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(this, builder.BuildSDiv(args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Mod.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(this, builder.BuildSRem(args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Gt.AddFunction(new GamaCompiledFunctionRef(InstanceTypes.Bool, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildICmp(LLVMIntPredicate.LLVMIntSGT, args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Ge.AddFunction(new GamaCompiledFunctionRef(InstanceTypes.Bool, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildICmp(LLVMIntPredicate.LLVMIntSGE, args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Lt.AddFunction(new GamaCompiledFunctionRef(InstanceTypes.Bool, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildICmp(LLVMIntPredicate.LLVMIntSLT, args[0].Value, args[1].Value), false);
            }));

            Meta.CompiledOperators.Le.AddFunction(new GamaCompiledFunctionRef(InstanceTypes.Bool, new[] { this, this }, (builder, args) =>
            {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildICmp(LLVMIntPredicate.LLVMIntSLE, args[0].Value, args[1].Value), false);
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
