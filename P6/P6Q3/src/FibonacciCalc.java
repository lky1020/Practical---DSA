
public class FibonacciCalc {
    
    public static int fibonacciRecursion(int n){
        
        if (n <= 1) {
            return n; 
        }
            
        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2); 
    }
    
    public static void fibonacciIteration(int maxNumber){
        int i = 1, previousNumber = 0, nextNumber = 1;
        
        while(i <= maxNumber){
            System.out.print(previousNumber + ", ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }
    
    public static void fibonacciArray(int maxNumber){
        int[] fibonacci = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229};
    
        for(int i = 0; i < maxNumber; i++){
            System.out.print(fibonacci[i] + " ");
        }
    }
    
    public static void main(String[] args){
        
        int maxNumber = 30;
        long startTime, endTime, elapseTime;

        //Recursion
        System.out.println("Fibonacci Series of " + maxNumber + " numbers: ");
        
        startTime = System.currentTimeMillis();
        for(int i = 0; i < maxNumber; i++){
            System.out.print(fibonacciRecursion(i) + " ");
        }
        endTime = System.currentTimeMillis();;
        
        elapseTime = endTime - startTime;
        System.out.println("\nMilli Time(Recursion): " + elapseTime);
    
        
        //Iteration
        System.out.println("\nFibonacci Series of " + maxNumber + " numbers: ");
        startTime = System.currentTimeMillis();
        fibonacciIteration(maxNumber);
        endTime = System.currentTimeMillis();
        
        elapseTime = endTime - startTime;
        System.out.println("\nMilli Time(Iteration): " + elapseTime);
    
        
        //Array
        System.out.println("\nFibonacci Series of " + maxNumber + " numbers: ");
        startTime = System.currentTimeMillis();
        fibonacciArray(maxNumber);
        endTime = System.currentTimeMillis();
        
        elapseTime = endTime - startTime;
        System.out.println("\nMilli Time(Array): " + elapseTime);
    }
    
}
