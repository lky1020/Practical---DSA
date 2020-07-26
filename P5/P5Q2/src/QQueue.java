
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
            lastNode.setNext(lastNode);

        }else{
            Node temp = lastNode.getNext();
            lastNode.setNext(node);
            lastNode = node;
            lastNode.setNext(temp);

        }
        
        size++;
        
    }

    @Override
    public T dequeue() {
        
        T data = null;
        
        if(!isEmpty()){
            Node temp = lastNode.getNext();
            data = temp.getData();
            lastNode.setNext(temp.getNext());
        }
        
        size--;

        return data;
    }

    @Override
    public T getFront() {
        
        T temp = null;
        
        if(!isEmpty()){
            
            temp = lastNode.getNext().getData();
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
