package p1q3;

import java.util.*;

public class CheckBalance {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter an Expression: ");
        String expression = scanner.nextLine();

        
        boolean isBalanced = checkBracketBalanced(expression);
        
        System.out.print(expression + " is ");
        if(isBalanced == true){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
    
    //method 1
    public static boolean checkBalancedParentesis(String expression){
        if(expression.isEmpty()){
            return true;
        }
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < expression.length(); i++){
            
            char current = expression.charAt(i);
            
            if(current == '(' || current == '{' || current == '['){
                //Left bracket will push to the stack
                stack.push(current);
            }
            
            if(current == ')' || current == '}' || current == ']'){
                
                if(stack.isEmpty()){
                    return false;
                }
                
                //Get the last char from the stack to perform checking
                char last = stack.peek();
                
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '['){
                    
                    stack.pop();
                    
                }else{
                    
                    return false;
                    
                }
                
            }
        }
        return stack.isEmpty()?true:false;
    }
    
    //method 2
    public static boolean checkBracketBalanced(String expr){
        boolean isBalanced = true;
        int i = 0;
        Stack<Character> stack = new Stack<Character>();
        
        while(isBalanced == true && !expr.isEmpty()){
            char nextCharacter = expr.charAt(i);
            
            switch(nextCharacter){
                case '(':
                case '{': 
                case '[':
                    stack.push(nextCharacter);
                    break;
                    
                case ')': 
                case '}':  
                case ']':
                    if(stack.isEmpty()){
                        isBalanced = false;
                    }
                    else{
                        char openDelimeter = stack.pop();
                        
                        if(nextCharacter == ')' && openDelimeter =='(' || nextCharacter == '}' && openDelimeter =='{' || nextCharacter == ']' && openDelimeter =='['){
                            isBalanced = true;
                        }else{
                            isBalanced = false;
                        }
                    }
                    break;
            }
            
        }
        
        if(!stack.isEmpty()){
            isBalanced = false;
        }
            
        return isBalanced;
    }
}
