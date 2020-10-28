using System;

namespace Gama.Interop
{
    /* This interface is used to create a lazy-like compilation
     * Pretty useful to create and close loopholes (such as self-referncing classes)
     * - Used in GamaBlock to find non-terminating blocks and terminate them accordingly
     * - Used in GamaFunctionRef to finalize blocks manually
     */
    public interface IFinalize
    {
        // int Initialize();
        int Finish();
    }
}
