using System;
using System.IO;
using System.Linq;
using System.Diagnostics;
using System.Collections.Generic;

using Gama.Compiler;
using Gama.Compiler.Units;
using Gama.Types;

using LLVMSharp.Interop;

using Antlr4.Runtime;
using CommandLine;

namespace Gama
{
    public class GamaCompilerLoader
    {
        [Verb("compile", isDefault: true)]
        public class Compile
        {
            [Value(0)]
            public IEnumerable<string> Files { get; set; }
            
            [Option('c', "compile", HelpText = "Compiles to linkable object file instead of Gama binary file", Default = false)]
            public bool NativeOutput { get; set; }

            [Option('s', "seperate", HelpText = "Compiles input files to seperate files, does not work if -c flag is enabled", Default = false)]
            public bool SeperateCompile { get; set; }

            [Option('o', "output", HelpText = "Output file name, does not work if -s flag is enabled", Required = true)]
            public string Output { get; set; }

            [Option('l', "link", HelpText = "Automaticall compiles to native application using LLVM tools present in system", Required= false)]
            public bool Link { get; set; }

            public static int Process(Compile args)
            {
                if (args.Files.Count() == 0)
                {
                    Console.WriteLine("Error: No input files provided");
                    return 1;
                }

                string file = args.Files.First();
                if (!File.Exists(file))
                {
                    Console.WriteLine($"File does not exists: { file }");
                    return 1;
                }

                var ctx = new GamaGlobalContext($"[module/{ file }]");

                InstanceTypes.Initialize();
                ctx.Root.Types.AddRange(InstanceTypes.All);

                var sw = new Stopwatch();
                sw.Start();

                var inputtxt = File.ReadAllText(file);
                var input = new AntlrInputStream(inputtxt);
                var lexer = new GamaLexer(input);
                var tokens = new CommonTokenStream(lexer);
                var parser = new GamaParser(tokens);
                var program = parser.program();
                if (parser.NumberOfSyntaxErrors > 0)
                {
                    Console.WriteLine("Code contains syntax errors, aborting compilation.");
                    return 2;
                }
                var unit = new GamaNamespaceCompiler(ctx);
                unit.Visit(program);

                sw.Stop();
                
                if (!ctx.Module.TryVerify(LLVMVerifierFailureAction.LLVMPrintMessageAction, out string err))
                {
                    ctx.Module.Dump();
                    if (ctx.ErrorList.Count > 0)
                        foreach (var e in ctx.ErrorList)
                            Console.WriteLine(e.ToString());
                    return 3;
                }
                else
                {
                    if (ctx.ErrorList.Count > 0)
                        foreach (var e in ctx.ErrorList)
                            Console.WriteLine(e.ToString());
                    else
                    {
                        Console.WriteLine(ctx.Module.PrintToString());
                        Console.WriteLine($"Compilation took { sw.Elapsed.Seconds } sec, { sw.Elapsed.Milliseconds } ms");
                        ctx.Module.WriteBitcodeToFile(args.Output);
                        if (args.Link)
                        {
                            
                        }
                    }
                }
                return 0;
            }
        }

        [Verb("jit", HelpText = "Creates a JIT compiler and executes provided binary file")]
        public class JIT
        {
            [Option(HelpText = "Binary file to be executed", Required = true)]
            public string File { get; set; }

            public static int Process(JIT args)
            {
                if (!System.IO.File.Exists(args.File))
                {
                    Console.WriteLine($"File does not exists: { args.File }");
                    return 1;
                }

                /* LLVM */
                LLVM.LinkInMCJIT();
                LLVM.InitializeX86TargetInfo();
                LLVM.InitializeX86Target();
                LLVM.InitializeX86TargetMC();

                LLVM.InitializeX86AsmParser();
                LLVM.InitializeX86AsmPrinter();

                LLVMMCJITCompilerOptions options = new LLVMMCJITCompilerOptions()
                {
                    NoFramePointerElim = 1
                };

                return 0;
            }
        }
    }
}
