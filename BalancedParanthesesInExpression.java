import java.util.*;
import java.io.*;

public class BalancedParanthesesInExpression {
 public static char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};
 
 public static boolean isOpenTerm(char c) {
  for (char[] array: TOKENS) {
   if(array[0] == c) {
	 return true;	
   }  
  }	
  return false;
 }
 
 public static boolean matches(char openTerm, char closeTerm) {
  for (char[] array: TOKENS) {
   if(array[0] == openTerm) {
	 return array[1] == closeTerm;	
   }  
  }	
 return false;
 }
 
 public static boolean isBalanced(String expression) {
  Stack<Character> stack = new Stack<Character>();
  for(char c : expression.toCharArray()) {
   if(isOpenTerm(c)) {
	stack.push(c);	  
   }
   else {
	if(stack.isEmpty() || !matches(stack.pop(), c)) {
	  return false;
	}
   }
  }
  return stack.isEmpty();
 }

 public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  String expression = new String();	
  System.out.print("Please enter an expression with only these characters (){}[]: ");
  expression = input.next();  
  
  boolean result =  isBalanced(expression);
  
  if(result == true) {
   System.out.println();
   System.out.println("The expression " + expression + " is a balanced expression.");
  }
  else {
   System.out.println();
   System.out.println("The expression " + expression + " is not a balanced expression.");	  
  }
 }
}
