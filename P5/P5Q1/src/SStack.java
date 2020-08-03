
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
        
        if(!isEmpty()){
            data = topNode.data;
            topNode = topNode.next;
            size--;
        }
        
        return data;
    }

    @Override
    public T peek() {
        T data = null;
        
        if(!isEmpty()){
            data = topNode.data;
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
        
        private Node(T data){
            this.data = data;
            this.next = null;
        }
        
        private Node(T data, Node next){
            this.data = data;
            this.next = next;
        }

    }
    
}
