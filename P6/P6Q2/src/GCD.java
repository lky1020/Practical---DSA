
import java.util.*;

public class GCD {
    
    public int gcd(int num1, int num2) {
        if(num2 == 0){
            return num1;
        }
        
        return gcd(num2, num1 % num2);
    }

    public static void main(String[] args){
        GCD g = new GCD();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter 1st Digit: ");
        int num1 = scan.nextInt();
        
        System.out.print("Enter 2nd Digit: ");
        int num2 = scan.nextInt();
        
        System.out.println("\nGCD for " + num1 + " & " + num2 + " is " + g.gcd(num1, num2));
    }
}
