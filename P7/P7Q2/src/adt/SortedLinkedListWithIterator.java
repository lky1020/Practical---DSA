
package adt;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class SortedLinkedListWithIterator<T extends Comparable<T>> 
        implements SortedListWithIteratorInterface<T>{
  
    private Node firstNode;
    private int length;

    @Override
    public boolean add(T newEntry) {
        Node newNode = new Node(newEntry);

        Node nodeBefore = null; 
        Node currentNode = firstNode;   
        while (currentNode != null && newEntry.compareTo(currentNode.data) > 0) {
            nodeBefore = currentNode;
            currentNode = currentNode.next;
        }

        if (isEmpty() || (nodeBefore == null)) { // CASE 1: add at beginning
            newNode.next = firstNode;
            firstNode = newNode;
        } else {	// CASE 2: add in the middle or at the end, i.e. after nodeBefore
            newNode.next = currentNode;
            nodeBefore.next = newNode;
        }
        length++;
        return true;
    }

    @Override
    public boolean remove(T anEntry) {
        Node currentNode = firstNode;
        Node previousNode = firstNode;
        
        if(!isEmpty() && contains(anEntry)){
            while(currentNode != null && currentNode.data.compareTo(anEntry) < 0){

                previousNode = currentNode;
                currentNode = currentNode.next;
                //position++;
            }

            if(currentNode.data.equals(anEntry)){
                
                //first node
                if(currentNode == firstNode){
                    
                     firstNode = firstNode.next;
                     
                }
                //other node
                else{
                    previousNode.next = currentNode.next;
                }
               
                length--;
                return true;
            }
        }
        
        return false;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean found = false;
        Node tempNode = firstNode;
        int pos = 1;

        while (!found && (tempNode != null)) {
            if (anEntry.compareTo(tempNode.data) <= 0) {
                found = true;
            } else {
                tempNode = tempNode.next;
                pos++;
            }
        }
        if (tempNode != null && tempNode.data.equals(anEntry)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void clear() {
        firstNode = null;
        length = 0;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return (length == 0);
    }
    
    @Override
    public Iterator<T> getIterator() {
      return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {

        private Node currentNode;

        public LinkedListIterator() {
          currentNode = firstNode;
        }

        @Override
        public boolean hasNext() {
          return currentNode != null;
        }

        @Override
        public T next() {
            
            T returnData = null;
            
            if (hasNext()) {
              returnData = currentNode.data;
              currentNode = currentNode.next;
              
            } 
            
            return returnData;
        }
    }
    
    public String toString() {
        String outputStr = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            outputStr += currentNode.data + "\n";;
            currentNode = currentNode.next;
        }
        return outputStr;
    }
    
    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
