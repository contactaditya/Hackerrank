import java.util.*;

 public class InsertANodeAtTheHeadOfALinkedList { 	 
	private static LinkedListNode head;
    private static int size;  

  public InsertANodeAtTheHeadOfALinkedList() {
  // this is an empty list, so the reference to the head node is set to a new node with no data				  
     head = new LinkedListNode(null);
     size = 0;
  }
	 
  public static LinkedListNode Insert(LinkedListNode head, int data) {
	LinkedListNode temp = new LinkedListNode(data);
	LinkedListNode current = head; 
 
	if(head == null) {
	  head = temp;
	  head.next = null;
	}
 
	else {	   
	  temp.next = head;
	  head = temp;	
    }
	
   return head;	
 }

  public static void main(String[] args) { 
	InsertANodeAtTheHeadOfALinkedList list = new InsertANodeAtTheHeadOfALinkedList();
    list.head = new LinkedListNode(50);
    list.head.next = new LinkedListNode(20);
    list.head.next.next = new LinkedListNode(15);
    list.head.next.next.next = new LinkedListNode(4);
    list.head.next.next.next.next = new LinkedListNode(10); 	 
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value of the node you want to insert at the beginning in the linked list: ");
    int value = input.nextInt();  
	   
    list.Insert(list.head, value);
  }
}
