using System;

using Gama.Interop;
using LLVMSharp.Interop;

namespace Gama.Types
{
    public class GamaF32 : GamaTypeRef
    {
        public GamaF32() : base("f32", LLVMTypeRef.Float) { }

        public override void Initialize()
        {
            Meta.CompiledOperators.Add.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) => {
                return new GamaValueRef(this, builder.BuildFAdd(args[0].Value, args[1].Value), false);
            }));
            Meta.CompiledOperators.Sub.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) => {
                return new GamaValueRef(this, builder.BuildFSub(args[0].Value, args[1].Value), false);
            }));
            Meta.CompiledOperators.Mul.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) => {
                return new GamaValueRef(this, builder.BuildFMul(args[0].Value, args[1].Value), false);
            }));
            Meta.CompiledOperators.Div.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) => {
                return new GamaValueRef(this, builder.BuildFDiv(args[0].Value, args[1].Value), false);
            }));
            // TOOD: add mod op
            Meta.CompiledOperators.Gt.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) => {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildFCmp(LLVMRealPredicate.LLVMRealOGT, args[0].Value, args[1].Value), false);
            }));
            Meta.CompiledOperators.Ge.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) => {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildFCmp(LLVMRealPredicate.LLVMRealOGE, args[0].Value, args[1].Value), false);
            }));
            Meta.CompiledOperators.Lt.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) => {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildFCmp(LLVMRealPredicate.LLVMRealOLT, args[0].Value, args[1].Value), false);
            }));
            Meta.CompiledOperators.Le.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) => {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildFCmp(LLVMRealPredicate.LLVMRealOLE, args[0].Value, args[1].Value), false);
            }));
            Meta.CompiledOperators.Eq.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) => {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildFCmp(LLVMRealPredicate.LLVMRealOEQ, args[0].Value, args[1].Value), false);
            }));
            Meta.CompiledOperators.Neq.AddFunction(new GamaCompiledFunctionRef(this, new[] { this, this }, (builder, args) => {
                return new GamaValueRef(InstanceTypes.Bool, builder.BuildFCmp(LLVMRealPredicate.LLVMRealONE, args[0].Value, args[1].Value), false);
            }));
            base.Initialize();
        }
    }
}
