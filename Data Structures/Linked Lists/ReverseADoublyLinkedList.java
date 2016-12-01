import java.util.*;

 public class ReverseADoublyLinkedList { 	
	private static DoublyLinkedListNode head;
	private static int size;      

	public ReverseADoublyLinkedList() {
	// this is an empty list, so the reference to the head node is set to a new node with no data				  
	  head = new DoublyLinkedListNode(null);
	  size = 0;
	}

	public static DoublyLinkedListNode Reverse(DoublyLinkedListNode head) {
	   DoublyLinkedListNode current = head;
	   DoublyLinkedListNode previous = null;
	   
       while(current!=null) {
    	 DoublyLinkedListNode next = current.next;
         current.next = previous;
         previous = current;
         current = next;
       }	
       head = previous;
	 return head;  
    }
  
	public static void main(String[] args) { 	  
	  ReverseADoublyLinkedList list = new ReverseADoublyLinkedList();
	  list.head = new DoublyLinkedListNode(3);
	  list.head.next = new DoublyLinkedListNode(6);
	  list.head.next.next = new DoublyLinkedListNode(10);
	  list.head.next.next.next = new DoublyLinkedListNode(15);
	  list.head.next.next.next.next = new DoublyLinkedListNode(30);
	  	  	  
	  DoublyLinkedListNode current = Reverse(list.head);	
	  System.out.print("Contents of the doubly linked list in the reverse order are: ");	 
	    while(current != null) {	   
	  	  System.out.print(current.getData() + " ");	 	
	  	  current = current.getNext();
	  	} 
  }
}
