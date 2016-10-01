import java.util.*;
import java.io.*;

public class QueuesATaleofTwoStacks {

 public static class MyQueue<T> {
	 
  private Stack<T> stackNewestOnTop = new Stack<T>();
  private Stack<T> stackOldestOnTop = new Stack<T>();
 
 public void enqueue(T value) { // Add item
  stackNewestOnTop.push(value); 
 }
 
 public T peek() { // Get "oldest" item
  shiftStacks();
  return stackOldestOnTop.peek();  
 }
 
 public T dequeue() { // Get "oldest" item and remove it
  shiftStacks(); 
  return stackOldestOnTop.pop();	 	 
 }
 
 private void shiftStacks() {
   if(stackOldestOnTop.isEmpty()) {
     while(!stackNewestOnTop.isEmpty()) {
       stackOldestOnTop.push(stackNewestOnTop.pop());	
     }
   }
 }
}
		
public static void main(String[] args) {  
	 
 MyQueue<Integer> queue = new MyQueue<Integer>();

 Scanner scan = new Scanner(System.in);
 System.out.print("Enter number of operations: ");
 int n = scan.nextInt();

 for (int i = 0; i < n; i++) {
  System.out.println();	 
  System.out.print("Enter the query type and value: ");	 
  int operation = scan.nextInt();
  if (operation == 1) { // enqueue
    queue.enqueue(scan.nextInt());
  } else if (operation == 2) { // dequeue
    queue.dequeue();
  } else if (operation == 3) { // print/peek
    System.out.println();	 
    System.out.println(queue.peek());
  }
 }
 scan.close();
 }
}
