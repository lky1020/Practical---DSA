
public class TestQQueue {
    public static void main(String[] atgs){
        QQueue<Integer> queue = new QQueue<>();
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        System.out.println("After enqueue, size of the queue: " + queue.size());
        System.out.println("Front is: " + queue.getFront());
        
        System.out.println("*** Testing dequeue ***");
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
        
        System.out.println("After dequeue, size of the queue: " + queue.size());
    }
}
