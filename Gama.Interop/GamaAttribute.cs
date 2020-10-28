using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Gama.Interop
{
    public class GamaAttribute
    {
        public string Name { get; }
        public string[] Parameters { get; }

        public GamaAttribute(string name, params string[] parms)
        {
            Name = name;
            Parameters = parms;
        }

        public GamaAttribute(string name)
        {
            Name = name;
            Parameters = new string[0];
        }
    }

    public class GamaAttributeSet : ICollection<GamaAttribute>
    {
        private List<GamaAttribute> Attributes { get; }

        public GamaAttribute this[string key]
        {
            get => Attributes.FirstOrDefault(a => a.Name == key);
        }

        public int Count => Attributes.Count;

        public bool IsReadOnly => true;

        public GamaAttributeSet()
        {
            Attributes = new List<GamaAttribute>();
        }

        public void Add(GamaAttribute item) => Attributes.Add(item);

        public void Clear() => Attributes.Clear();

        public bool Contains(GamaAttribute item) => Attributes.Contains(item);

        public void CopyTo(GamaAttribute[] array, int arrayIndex) => Attributes.CopyTo(array, arrayIndex);

        public IEnumerator<GamaAttribute> GetEnumerator() => Attributes.GetEnumerator();

        public bool Remove(GamaAttribute item) => Attributes.Remove(item);

        IEnumerator IEnumerable.GetEnumerator() => Attributes.GetEnumerator();
    }

}
