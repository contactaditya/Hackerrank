import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

  public class MaximumElement {  
     private static Stack<Integer> stack = new Stack<Integer>();	
     private static Stack<Integer> maxStack = new Stack<Integer>();	

  public static void push(int value) {
	 /**
	  * Add an item to back of stack.
	  */
		   
	 stack.push(value);
	 if (maxStack.empty() || maxStack.peek() <= value) {
        maxStack.push(value);
     }
  }	

  public static int pop() {
	/**
	 * Removes the next item from the front of the stack.	 
	 */	 
	  
      int value = stack.pop();
      if (maxStack.peek() == value) {
        maxStack.pop();
      }
     return value;
  }
  
  public static int max() {
     /**
	  * It finds the maximum value of the stack.
	  */	 
					  
	 return maxStack.peek();
  }
		
  public static void main(String[] args) throws NumberFormatException, IOException {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter number of queries: ");
	 int queries = input.nextInt();  
	 while(--queries >= 0) {
	   System.out.println();	 
	   System.out.print("Enter the query type: ");	 
	   int queryType = input.nextInt();
	   if (queryType == 1) {
		  System.out.println();	  
		  System.out.print("Enter a element to insert in the stack: "); 
          push(input.nextInt());
       }
	   else if (queryType == 2) {
	      pop();
	   }
	   else if (queryType == 3) {
		 System.out.println();	  
		 System.out.println("The maximum element in the stack is: " + max());
	   }
	}
  }
 }
	