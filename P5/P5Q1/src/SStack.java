
import java.util.EmptyStackException;


public class SStack<T> implements StackInterface<T>{

    
    private Node topNode;
    private int size;
    
    public SStack(){
        clear();
    }
    
    public int size(){
        return this.size;
    }
    
    @Override
    public void push(T newEntry) {
        Node node = new Node(newEntry, topNode);
        topNode = node;
        size++;
    }

    @Override
    public T pop() {
        //for return the value
        T data = null;
        
        if(isEmpty()) throw new EmptyStackException();
        else{
            data = topNode.getData();
            //Node temp = topNode; // temp for topNode for setNext(null) before the topNode been replace by getNext();
            topNode = topNode.getNext();
            //temp.setNext(null);
            size--;
        }
        
        return data;
    }

    @Override
    public T peek() {
        T data = null;
        
        if(isEmpty()) throw new EmptyStackException();
        else{
            data = topNode.getData();
        }
        
        return data;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void clear() {
        this.topNode = null;
        this.size = 0;
    }
    
    private class Node{
        private T data;
        private Node next;
        
        Node(T data){
            this.data = data;
            this.next = null;
        }
        
        Node(T data, Node next){
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        
        
    }
    
}
