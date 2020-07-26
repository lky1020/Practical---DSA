
public class TestSStack {
    public static void main(String[] args){
        SStack<Integer> stack = new SStack<>();
        stack.push(37);
        stack.push(99);
        stack.push(12);
        
        System.out.println("After push, size of the stack: " + stack.size());
        System.out.println("Top is: " + stack.peek());
        
        System.out.println("*** Testing Pop ***");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
        System.out.println("After push, size of the stack: " + stack.size());
    }
}
