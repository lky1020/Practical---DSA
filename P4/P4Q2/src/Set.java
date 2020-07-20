import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Set<T> implements IteratorInterface<T>{

    private T[] setElement;
    private int length;
    private static final int DEFAULT_CAPACITY = 5; 
    
    Set(){
        this(DEFAULT_CAPACITY);
    }
    
    Set(int initialCapacity){
        length = 0;
        setElement = (T[]) new Object[initialCapacity];
    }

    public T[] getSetElement() {
        return setElement;
    }

    public void setSetElement(T[] setElement) {
        this.setElement = setElement;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    
    @Override
    public boolean add(T newElement) {
        //check whether exist the array size
        if(length == setElement.length){
            T[] oldSetElement = setElement;
            setElement = (T[]) new Object[setElement.length * 2];
            
            for(int i = 0; i < oldSetElement.length; i++){
                setElement[i] = oldSetElement[i];
            }
        }
        
        setElement[length] = newElement;
        length++;
        return true;
    }

    @Override
    public boolean remove(T anElement) {

        for(int i = 0; i < length; i++){
            if(setElement[i] == anElement){
                removeGap(i);     
                length--;
                return true;
            }
        }
        
        return false;
    }

    @Override
    public boolean checkSubset(Set anotherSet) {
        
        T[] anotherSetElement = (T[])anotherSet.getSetElement();
        
        for(int i = 0; i < length; i++){
            for(int j = 0; j < anotherSet.getLength(); j++){
                if(setElement[i] == anotherSetElement[j]){
                    return true;
                }
            }
        }
        
        return false;
    }

    @Override
    public void union(Set anotherSet) {
        int anotherSetLength = anotherSet.getLength();
        T[] result = (T[]) new Object[length + anotherSetLength];
        
        System.arraycopy(setElement, 0, result, 0, length);
        System.arraycopy(anotherSet.getSetElement(), 0, result, length, anotherSetLength);
        
        
        length += anotherSet.getSetElement().length;
        setElement = result;
    
    }

    @Override
    public Set intersection(Set anotherSet) {
        Set intersectionSet = new Set();
        
        for(int i = 0; i < length; i++){
            for(int j = 0; j < anotherSet.getSetElement().length; j++){
                if(setElement[i] == anotherSet.getSetElement()[j]){
                    intersectionSet.add(setElement[i]);
                }
            }
        }
        
        return intersectionSet;
    }
    
    @Override
    public String toString(){
        String str = "";
        
        for(int i = 0; i < length; i++){
            str += setElement[i] + "\n";
        }
        
        return str;
    }
    
    private void removeGap(int givenPosition) {
        int removedIndex = givenPosition;
        int lastIndex = length - 1;

        for (int index = removedIndex; index < lastIndex; index++) {
          setElement[index] = setElement[index + 1];
        }
    }
    
    public boolean isEmpty(){
        return length == 0;
    }

    @Override
    public Iterator<T> getIterator() {
        return new IteratorForSet();
    }
    
    private class IteratorForSet implements Iterator<T> {

        private int nextIndex;
        private boolean wasNextCalled; // needed by remove

        private IteratorForSet() {
          nextIndex = 0;
          wasNextCalled = false;
        }

        @Override
        public boolean hasNext() {
          return nextIndex < length;
        }

        @Override
        public T next() {
          if (hasNext()) {
            wasNextCalled = true;
            T nextEntry = setElement[nextIndex];
            nextIndex++; // advance iterator

            return nextEntry;
            
          } else {
            throw new NoSuchElementException("Illegal call to next();"
                    + "iterator is after end of list.");
          }
        }

        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
