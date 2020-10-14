using LLVMSharp.Interop;
using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Interop
{
    public delegate GamaValueRef GamaCompiledFunctionDelegate(LLVMBuilderRef builder, params GamaValueRef[] values);

    public class GamaCompiledFunctionList : IFinalize
    {
        public string Name { get; }
        public List<GamaCompiledFunctionRef> Callbacks { get; set; }

        public GamaCompiledFunctionList(string name)
        {
            Name = name;
            Callbacks = new List<GamaCompiledFunctionRef>();
        }

        public GamaCompiledFunctionRef FindFunction(params GamaTypeRef[] paramtypes)
        {
            foreach (var cb in Callbacks)
            {
                if (cb.ParameterTypes.Length != paramtypes.Length) continue;
                bool found = true;
                for (int i = 0; i < paramtypes.Length; i++)
                    if (cb.ParameterTypes[i] != paramtypes[i])
                    {
                        found = false;
                        break;
                    }

                if (found)
                    return cb;
            }

            return null;
        }

        public GamaCompiledFunctionRef FindFunction(GamaTypeRef ret, GamaTypeRef[] paramtypes)
        {
            foreach (var cb in Callbacks)
            {
                if (cb.ParameterTypes.Length != paramtypes.Length) continue;
                if (cb.ReturnType != ret) continue;

                bool found = true;
                for (int i = 0; i < paramtypes.Length; i++)
                    if (cb.ParameterTypes[i] != paramtypes[i])
                    {
                        found = false;
                        break;
                    }

                if (found)
                    return cb;
            }

            return null;
        }

        public void AddFunction(GamaCompiledFunctionRef fn) => Callbacks.Add(fn);

        public int Finish()
        {
            throw new NotImplementedException();
        }
    }

    public class GamaCompiledFunctionRef
    {
        public GamaTypeRef ReturnType { get; }
        public GamaTypeRef[] ParameterTypes { get; }

        public GamaCompiledFunctionDelegate Callback { get; }

        public GamaCompiledFunctionRef(GamaTypeRef ret, GamaTypeRef[] paramtypes, GamaCompiledFunctionDelegate cb)
        {
            ReturnType = ret;
            ParameterTypes = paramtypes;
            Callback = cb;
        }

        public GamaValueRef Call(LLVMBuilderRef builder, params GamaValueRef[] parms) => Callback(builder, parms);
    }
}
