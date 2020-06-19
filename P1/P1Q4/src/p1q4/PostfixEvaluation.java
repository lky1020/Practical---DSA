package p1q4;

import java.util.*;

public class PostfixEvaluation {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Infix Expression: ");
        String exp = scanner.nextLine();
        
        exp = infixToPostfix(exp);
        
        System.out.println(exp + " equals to " + evaluatePostfix(exp)); 
    }
    
    public static int checkPrecedence(char operator){
        
        //the precedence is based on the number, high precedence = high number
        
        switch(operator){
            case '+':
            case '-':
                return 1;
                
            case '*':
            case '/':
                return 2;
                
            case '^':
                return 3;
                
        }
        
        return -1;
    }
    
    public static String infixToPostfix(String exp){
        
        //Initialize empty String for result
        String result = new String("");
        
        //Initialize empty Stack
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < exp.length(); i++){
            
            char c = exp.charAt(i);
            
            //if c is operand put into the result String
            if(Character.isLetterOrDigit(c)){
                result += c;
            }
            
            //if c is left bracket, push to stack
            else if(c == '('){
                stack.push(c);
            }
            
            //if(c is right bracket, pop and output from the stack
            //until the '(' is encountered
            //(clear the characters in the bracket) when the ')' found
            else if(c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result += stack.pop();
                }
                
                //remove '('
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression"; // invalid expression                 
                else
                    stack.pop(); 
            }
            
            //operator encountered
            else{
                while(!stack.isEmpty() && checkPrecedence(c) <= checkPrecedence(stack.peek())){
                    if(stack.peek() == '('){
                        return "Invalid Expression";
                    }
                    
                    result += stack.pop();
                }
                
                stack.push(c);
            }

        }
        
        //pop all the operators from the stack
        while(!stack.isEmpty()){
            if(stack.peek() == '('){
                return "Invalid Expression";
            }
            
            result += stack.pop();
        }
        
        return result;
    }
    
    public static String evaluatePostfix(String exp){
       
        if(!exp.matches("^[a-zA-Z]*$")){
            Stack<Integer> stack = new Stack<>();
        
            for(int i = 0; i < exp.length(); i++){

                char c = exp.charAt(i);

                //number push to stack
                if(Character.isDigit(c)){
                    stack.push(c - '0');
                }

                //operator, pop two number
                else{
                    int num2 = stack.pop();
                    int num1 = stack.pop();

                    switch(c){
                        case '+':
                            stack.push(num1 + num2);
                            break;

                         case '-':
                            stack.push(num1 - num2);
                            break;

                         case '*':
                            stack.push(num1 * num2);
                            break;

                         case '/':
                            stack.push(num1 / num2);
                            break;
                    }
                }
            }

            return Integer.toString(stack.pop());
        }
        
        return "Error: Characters occur";
    }
}
