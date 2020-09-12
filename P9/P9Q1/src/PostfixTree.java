import java.util.*;

public class PostfixTree {
    public static void main(String[] args){
        //String postfix = "ab*c+";
        String postfix = "abcd*+*e/";
        
        Stack<BinaryTree<String>> stackTree = new Stack<>();
        
        for(int i = 0; i < postfix.length(); i++){

            if(isOperator(postfix.charAt(i))){
                
                //Right SubTree
                BinaryTree<String> rightTree = stackTree.pop();
                
                //Left SubTree
                BinaryTree<String> leftTree = stackTree.pop();
                
                //Operator
                BinaryTree<String> operatorTree = new BinaryTree<>();
                operatorTree.setTree("" + postfix.charAt(i), leftTree, rightTree);
                
                stackTree.push(operatorTree);
                
            }else{
                
                BinaryTree<String> operandTree = new BinaryTree<>();
                operandTree.setTree("" + postfix.charAt(i));
                stackTree.push(operandTree);
            }
        }
        
        BinaryTree<String> expressionTree = stackTree.pop();
        
        // display root
        System.out.println("Root of tree contains " + expressionTree.getRootData());

        // display nodes in postorder
        System.out.println("\nA postorder traversal visits nodes in this order: ");
        expressionTree.postorderTraverse();
    }
    
    public static boolean isOperator(Character c){
        switch(c){
            case '*':
            case '/':
            case '^':
            case '+':
            case '-':
                return true;
                
            default:
                return false; 
        }
    }
}
