
public class QQueue<T> implements QueueInterface<T> {

    private Node lastNode;
    private int size;
    
    public QQueue(){
        clear();
    }
    
    public int size(){
        return this.size;
    }
    
    @Override
    public void enqueue(T newEntry) {
        Node node = new Node(newEntry, null);
        
        if(isEmpty()){
            lastNode = node;
            lastNode.next = lastNode;

        }else{
            Node temp = lastNode.next;
            lastNode.next = node;
            lastNode = node;
            lastNode.next = temp;
        }
        
        size++;
        
    }

    @Override
    public T dequeue() {
        
        T data = null;
        
        if(!isEmpty()){
            
            data = lastNode.next.data;
            
            if(lastNode == lastNode.next){
                lastNode = null;
            }
            else{
                lastNode.next = lastNode.next.next;
            }
            
        }
        
        size--;

        return data;
    }

    @Override
    public T getFront() {
        
        T temp = null;
        
        if(!isEmpty()){
            
            temp = lastNode.next.data;
        }
        
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        this.lastNode = null;
        this.size = 0;
    }
    
    private class Node{
        private T data;
        private Node next;
        
        Node(T data){
            this.data= data;
            this.next = null;
        }
        
        Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    
}
