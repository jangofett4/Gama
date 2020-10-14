using System;
using System.IO;
using Antlr4.Runtime;
using CommandLine;
using Gama.Compiler;
using Gama.Compiler.Units;
using Gama.Types;
using LLVMSharp.Interop;

namespace Gama
{
    class Program
    {
        public static string UsageString { get; set; } =
            "Usage:\n" +
            " gamac -c src-file [-o object-file]\n  Invokes standard compilation unit to output an object file\n" +
            " gamac -link object-file [object-file [...]] [-o executable]\n  Invokes linker to link object files to create static programs\n" +
            " gamac -jit object-file [object-file [...]]\n  Invokes LLVM JIT to directly execute object file, 'main' method in first object is executed rest is environment\n" +
            " gamac -cjit src-file [src-file [...]]\n  Invokes LLVM JIT to compile and execute a source file, 'main' method in first source is executed rest is environment";

        public static Version Version { get; set; } = new Version(1, 0);

        public static int Main(string[] args)
        {
#if DEBUG
            args = new[] { "--files", "test.gm", "-o", "test.bc" };
#endif
            return CommandLine.Parser.Default.ParseArguments<
                GamaCompilerLoader.Compile,
                GamaCompilerLoader.JIT
                >(args)
                .MapResult(
                    (GamaCompilerLoader.Compile a) => GamaCompilerLoader.Compile.Process(a),
                    (GamaCompilerLoader.JIT a) => GamaCompilerLoader.JIT.Process(a),
                    (err) => 1
                    );
        }
    }
}
