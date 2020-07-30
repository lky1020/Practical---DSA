
import java.util.Scanner;


public class CountUp {
    
    public void countUp(int n){
        
        if(n >= 1){
            countUp(n - 1);
            
            System.out.print(n + " ");
        }
        
    }
    
    public static void main(String[] args){
        CountUp c = new CountUp();
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer number: ");
        int number = scanner.nextInt();

        System.out.printf("\nOutput for countDown(%d):\n", number);
        c.countUp(number);
        System.out.println();
    }
}
