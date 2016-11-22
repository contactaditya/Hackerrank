import java.util.*;

 public class PrintInReverse { 	 
   private static LinkedListNode head;
   private static int size;  

   public PrintInReverse() {
  // this is an empty list, so the reference to the head node is set to a new node with no data				  
	  head = new LinkedListNode(null);
	  size = 0;
   }
   
   public static void ReversePrint(LinkedListNode head) { 
	 LinkedListNode current = head; 
	 LinkedListNode previous = null;
	 while(current != null) {	   
	   LinkedListNode next = current.next;
	   current.next = previous;
	   previous = current;
	   current = next;	 
	 }
	 head = previous;
	 current = head; 
     System.out.print("Contents of the linked list in the reverse order are: ");	 
     while(current != null) {	   
	   System.out.print(current.getData() + " ");	 	
	   current = current.getNext();
	 }
   } 
   
   public static void ReversePrint1(LinkedListNode head) {  
	 LinkedListNode current = head; 
	 LinkedListNode previous = null;
	 if(head == null) {	   
      return;
	 }
	 ReversePrint1(head.next);  
	 System.out.print(head.data + " ");	 	 
   }    
   
	public static void main(String[] args) { 
	  PrintInReverse list = new PrintInReverse();
	  list.head = new LinkedListNode(50);
	  list.head.next = new LinkedListNode(20);
	  list.head.next.next = new LinkedListNode(15);
	  list.head.next.next.next = new LinkedListNode(4);
	  list.head.next.next.next.next = new LinkedListNode(10); 	 
	  
	  list.ReversePrint(head);
  }
}
