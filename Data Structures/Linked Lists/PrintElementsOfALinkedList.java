import java.util.*;

  public class PrintElementsOfALinkedList {
      private static LinkedListNode head;
      private static int size;  
	 
      public PrintElementsOfALinkedList() {
        // this is an empty list, so the reference to the head node is set to a new node with no data				  
	head = new LinkedListNode(null);
	size = 0;
      }
	 
      public static void PrintElementsOfALinkedList(LinkedListNode head) {	 
	LinkedListNode current = head; 
	System.out.print("Contents of the linked list are: ");	 
	while(current != null) {	   
	  System.out.print(current.getData() + " ");	 	
	  current = current.getNext();
	}
      } 

      public static void main(String[] args) {   
        PrintElementsOfALinkedList list = new PrintElementsOfALinkedList();
        list.head = new LinkedListNode(50);
        list.head.next = new LinkedListNode(20);
        list.head.next.next = new LinkedListNode(15);
        list.head.next.next.next = new LinkedListNode(4);
        list.head.next.next.next.next = new LinkedListNode(10);
	  
        list.PrintElementsOfALinkedList(head);
  }
}
