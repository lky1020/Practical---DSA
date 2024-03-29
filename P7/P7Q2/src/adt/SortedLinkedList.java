package adt;

import java.util.Iterator;

public class SortedLinkedList<T extends Comparable<T>> implements SortedListInterface<T> {

    private Node firstNode;
    private int length;

    public SortedLinkedList() {
        firstNode = null;
        length = 0;
    }

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

    public final void clear() {
        firstNode = null;
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return (length == 0);
    }

    public String toString() {
        String outputStr = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            outputStr += currentNode.data;
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
    
  /*public Iterator<T> getIterator() {
    return new SortedLinkedListIterator();
  }
  
  private class SortedLinkedListIterator implements Iterator<T> {
    Node currentNode = firstNode;

    @Override
    public boolean hasNext() {
      return currentNode != null;
    }

    @Override
    public T next() {
      T currentElement = null;
      if (hasNext()) {
        currentElement = currentNode.data;
        currentNode = currentNode.next;
      }
      return currentElement;
    }
  }*/

}
