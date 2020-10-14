using Gama.Interop;

namespace Gama.Types
{
    public static class InstanceTypes
    {
        public static GamaTypeRef I32 { get; set; }
        public static GamaTypeRef I64 { get; set; }

        public static GamaTypeRef F32 { get; set; }
        public static GamaTypeRef F64 { get; set; }

        public static GamaTypeRef Bool { get; set; }
        public static GamaTypeRef Char { get; set; }
        public static GamaTypeRef Void { get; set; }

        public static GamaTypeRef[] All { get; set; }

        public static void Initialize()
        {
            I32 = new GamaI32();
            I64 = new GamaI64();

            F32 = new GamaF32();
            F64 = new GamaF64();

            Bool = new GamaBool();
            Char = new GamaChar();
            Void = new GamaVoid();

            All = new GamaTypeRef[]
            {
                Void, Bool, Char,
                I32, I64, F32, F64,
            };

            foreach (var ty in All)
                ty.Initialize(); // Late initialization required for compiled operators and to avoid from self-null-referencing
        }
    }
}
