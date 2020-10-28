using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Gama.Error
{
    public class GamaErrorCollection : ICollection<GamaError>
    {
        private List<GamaError> Errors { get; set; }

        public int Count => Errors.Count;

        public bool IsReadOnly => false;

        public GamaError this[int index]
        {
            get { return Errors[index]; }
            set { Errors[index] = value; }
        }

        public GamaErrorCollection()
        {
            Errors = new List<GamaError>();
        }
        
        public void Add(GamaError item)
        {
            Errors.Add(item);
        }

        public void Clear()
        {
            Errors.Clear();
        }

        public bool Contains(GamaError item)
        {
            return Errors.Contains(item);
        }

        public void CopyTo(GamaError[] array, int arrayIndex)
        {
            Errors.CopyTo(array, arrayIndex);
        }

        public IEnumerator<GamaError> GetEnumerator()
        {
            return Errors.GetEnumerator();
        }

        public bool Remove(GamaError item)
        {
            return Errors.Remove(item);
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return Errors.GetEnumerator();
        }
    }
}
