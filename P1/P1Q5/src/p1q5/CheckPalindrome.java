package p1q5;

import java.util.*;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        String text = scanner.nextLine();
        
        //Remove space
        text = text.trim();
        
        //remove punctuation
        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        System.out.println(text);
        
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        
        for(int i = 0; i < text.length(); i++){
            stack.push(text.charAt(i));
            queue.add(text.charAt(i));
        }
        
        boolean isPalindrome = true;
        
        while(!queue.isEmpty()){
            if(queue.remove().equals(stack.pop())){
                continue;
            }
            else{
                isPalindrome = false;
                break;
            }
        }
        
        if(!isPalindrome){
            System.out.println("Not a Palindrome");
        }else{
            System.out.println("Palindrome");
        }
        
    }
    
}
