import java.util.*;

 class DoublyLinkedListNode {
   public Object data; 
   public DoublyLinkedListNode next;
   public DoublyLinkedListNode previous;

	  //Node constructor
		    
  public DoublyLinkedListNode(Object data) {
	this.data = data;
	next = null;
	previous = null;
  }
		    
  public DoublyLinkedListNode(Object data, DoublyLinkedListNode next, DoublyLinkedListNode previous) {
	this.data = data;
	this.next = next;
	this.previous = previous;
  }
	 
  public Object getData() {
	 return data;
  }
			
   public void setData(Object data) {
	  this.data = data; 
   }
			
   public DoublyLinkedListNode getNext() {
	  return next;
   }
			
  public void setNext(DoublyLinkedListNode next) {
	 this.next = next;
   }
  
  public DoublyLinkedListNode getPrevious() {
	 return previous;
  }
			
  public void setPrevious(DoublyLinkedListNode previous) {
	 this.previous = previous;
  }
 }

 public class InsertingANodeIntoASortedDoublyLinkedList { 	
	private static DoublyLinkedListNode head;
	private static int size;      
	
	public InsertingANodeIntoASortedDoublyLinkedList() {
   // this is an empty list, so the reference to the head node is set to a new node with no data				  
		 head = new DoublyLinkedListNode(null);
		 size = 0;
	 }

	 public static DoublyLinkedListNode SortedInsert(DoublyLinkedListNode head, int data) {
		DoublyLinkedListNode n = new DoublyLinkedListNode(data);
		if (head == null) {
		   return n;
		}
	    else if (data < (int)head.data) {
		   n.next = head;
		   head.previous = n;
		   return n;
		}
		else {
		   DoublyLinkedListNode rest = SortedInsert(head.next, data);
		   head.next = rest;
		   rest.previous = head;
		   return head;  
	   }
	  }
	 
	 public static DoublyLinkedListNode SortedInsert1(DoublyLinkedListNode head, int data) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		if (head == null) {
		   return newNode;
		}
	    else if (data < (int)head.data) {
	       newNode.next = head;
		   head.previous = newNode;
		   return newNode;
		}
		else {
		   DoublyLinkedListNode current = head;
		   while(current.next != null && (int)current.next.data < (int)newNode.data) {
	          current = current.next;
	       }
		 // New Node lies between current and current->next.
		   newNode.previous = current;
	       newNode.next = current.next;
	       
	     // If the new Node's position is at the end then we only update the previous pointer as the next pointer is NULL
	 
	       if (current.next != null) {
	          current.next.previous = newNode;
	       }
	       // Update the next pointer of current to point to this new node.
	       current.next = newNode; 
		   return head;  		   
	   }
	  }

	public static void main(String[] args) {   
	  InsertingANodeIntoASortedDoublyLinkedList list = new InsertingANodeIntoASortedDoublyLinkedList();
	  list.head = new DoublyLinkedListNode(3);
	  list.head.next = new DoublyLinkedListNode(6);
	  list.head.next.next = new DoublyLinkedListNode(15);
	  list.head.next.next.next = new DoublyLinkedListNode(30);
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the data of the node that you want to insert in the linked list: ");
	  int data = input.nextInt();  
	  	  
	  DoublyLinkedListNode current = SortedInsert(list.head, data);	
	  System.out.println();
	  System.out.print("Contents of the doubly linked list are: ");	 
	  while(current != null) {	   
		 System.out.print(current.getData() + " ");	 	
		 current = current.getNext();
	  }
  }
}
