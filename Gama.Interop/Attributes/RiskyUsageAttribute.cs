using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Text;

namespace Gama.Interop.Attributes
{
    [AttributeUsage(AttributeTargets.All, Inherited = false, AllowMultiple = false)]
    [DebuggerDisplay("Use it at your own risk: {reason}")]
    public sealed class RiskyUsageAttribute : Attribute
    {
        public string Reason { get; }

        public RiskyUsageAttribute(string reason) : base()
        {
            Reason = reason;
        }
    }
}
