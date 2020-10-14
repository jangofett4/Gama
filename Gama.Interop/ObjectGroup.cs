using System;
using System.Collections.Generic;
using System.Text;

namespace Gama.Interop
{
    public class ObjectGroup<T>
    {
        public string Name { get; set; }
        public List<T> Items { get; set; }
        
        public ObjectGroup(string name)
        {
            Name = name;
            Items = new List<T>();
        }

        public virtual void Add(T item)
        {
            Items.Add(item);
        }

        public virtual void Remove(T item)
        {
            Items.Remove(item);
        }

        public string Next()
        {
            return $"{ Name }.{ Items.Count }";
        }
    }
}
