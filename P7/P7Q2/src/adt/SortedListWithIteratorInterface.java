
package adt;

import java.util.Iterator;

public interface SortedListWithIteratorInterface<T extends Comparable<T>> 
        extends SortedListInterface<T>{
    
    Iterator<T> getIterator();
}
