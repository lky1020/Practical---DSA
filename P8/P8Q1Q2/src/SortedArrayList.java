

/**
 * SortedArrayList - Implements the ADT Sorted List using an array. - Note: Some
 * methods are not implemented yet and have been left as practical exercises
 */
public class SortedArrayList<T extends Comparable<T>> implements SortedListInterface<T> {

  private T[] list;
  private int length;
  private static final int DEFAULT_CAPACITY = 25;

  public SortedArrayList() {
    this(DEFAULT_CAPACITY);
  }

  public SortedArrayList(int initialCapacity) {
    length = 0;
    list = (T[]) new Comparable[initialCapacity];
  }

  public boolean add(T newEntry) {
    int i = 0;
    while (i < length && newEntry.compareTo(list[i]) > 0) {
      i++;
    }
    makeRoom(i + 1);
    list[i] = newEntry;
    length++;
    return true;
  }

  @Override
  public boolean remove(T anEntry) {
    if(!isEmpty()){
        
        int index = binarySearch(anEntry);
        
        removeGap(index + 1);
        length--;
        
        return true;
    }
    
    return false;
  }

  @Override
  public void clear() {
    length = 0;
  }

  @Override
  public int contains(T anEntry) {
      
     /*int found = -1;
      
      for(int index = 0;index < length; index++){
          if(anEntry.equals(list[index])){
              
              found = index;
              
          }else if(anEntry.compareTo(list[index]) <= -1){ 
              
              break;
              
          }
      }
      
      return found;*/
      
    return binarySearch(anEntry);
  }
  
  private int binarySearch(T desiredItem) {
    int i = 0;
    int arrLength = list.length - 1;
    
    //Since it will have null, because it may use default capacity
    while(list[arrLength] == null){
        arrLength -= 1;
    }
    
    while(i <= arrLength){
        int middle = (i + arrLength) / 2;
        
        if(desiredItem.compareTo(list[middle]) < 0){
            arrLength = middle - 1;
        }
        else if(desiredItem.compareTo(list[middle]) > 0){
            i = middle + 1;
        }else{
            return middle;
        }
    }
    
    return -1;
    
  }

  @Override
  public int getLength() {
    return length;
  }

  @Override
  public boolean isEmpty() {
    return length == 0;
  }

  @Override
  public String toString() {
    String outputStr = "";
    for (int index = 0; index < length; ++index) {
      outputStr += list[index] + "\n";
    }

    return outputStr;
  }

  private boolean isArrayFull() {
    return length == list.length;
  }

  private void doubleArray() {
    T[] oldList = list;
    int oldSize = oldList.length;

    list = (T[]) new Object[2 * oldSize];

    for (int index = 0; index < oldSize; index++) {
      list[index] = oldList[index];
    }
  }

  private void makeRoom(int newPosition) {
    int newIndex = newPosition - 1;
    int lastIndex = length - 1;

    for (int index = lastIndex; index >= newIndex; index--) {
      list[index + 1] = list[index];
    }
  }

  private void removeGap(int givenPosition) {
    int removedIndex = givenPosition - 1;
    int lastIndex = length - 1;

    for (int index = removedIndex; index < lastIndex; index++) {
      list[index] = list[index + 1];
    }
  }

}
