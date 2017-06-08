import java.util.*;

 public class ReverseALinkedList { 	
   private static LinkedListNode head;
   private static int size;  

  public ReverseALinkedList() {
   // this is an empty list, so the reference to the head node is set to a new node with no data				  
     head = new LinkedListNode(null);
     size = 0;
  }

  public static LinkedListNode Reverse(LinkedListNode head) {
      LinkedListNode current = head;
      LinkedListNode previous = null;
         	         		     
      while(current!=null) {
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
    return head;
  }

  public static void main(String[] args) { 	  
      ReverseALinkedList list = new ReverseALinkedList();
      list.head = new LinkedListNode(50);
      list.head.next = new LinkedListNode(20);
      list.head.next.next = new LinkedListNode(15);
      list.head.next.next.next = new LinkedListNode(4);
      list.head.next.next.next.next = new LinkedListNode(10);
	  
      list.Reverse(head);
  }
}
