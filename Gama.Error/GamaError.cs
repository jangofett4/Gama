using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;

namespace Gama.Error
{
    public class GamaError
    {
        public string Message { get; set; }
        public SourceIndex At { get; set; }

        public GamaError(string msg, params object[] format)
        {
            Message = string.Format(msg, format);
        }

        public GamaError(string msg, SourceIndex at, params object[] format)
        {
            Message = string.Format(msg, format);
            At = at;
        }

        public GamaError(string msg, ParserRuleContext rule, params object[] format)
        {
            Message = string.Format(msg, format);
            At = new SourceIndex(rule.Start);
        }

        public override string ToString()
        {
            if (At == null)
                return $"{ ErrorType } at { At }:\n { Message }";
            return $"{ ErrorType }:\n { Message }";
        }

        public string ErrorType { get => GetType().Name; }
    }

    public class SourceIndex
    {
        /// <summary>
        /// Index from start of the file
        /// </summary>
        public int Index { get; set; }
        
        /// <summary>
        /// Line number
        /// </summary>
        public int Line { get; set; }

        /// <summary>
        /// Index from start of the line
        /// </summary>
        public int Column { get; set; }

        public SourceIndex(int index, int row, int col)
        {
            Index = index;
            Line = row;
            Column = col;
        }

        public SourceIndex(ITerminalNode from)
        {
            Index = from.Symbol.StartIndex;
            Line = from.Symbol.Line;
            Column = from.Symbol.Column;
        }

        public SourceIndex(IToken from)
        {
            Index = from.StartIndex;
            Line = from.Line;
            Column = from.Column;
        }
    }
}
