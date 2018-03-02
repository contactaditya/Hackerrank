import java.util.Scanner;

  public class InsertANodeAtASpecificPositionInALinkedList { 	 
     private static LinkedListNode head;
     private static int size;  
	
     public InsertANodeAtASpecificPositionInALinkedList() {
        // this is an empty list, so the reference to the head node is set to a new node with no data				  
	head = new LinkedListNode(null);
	size = 0;
     }
			 	 
     public static LinkedListNode InsertNth(LinkedListNode head, int data, int position) {
	LinkedListNode temp = new LinkedListNode(data);
	LinkedListNode current = head; 
			  
	if(position == 0) {  
	  temp.next = head;
	  head = temp;
	  size++;
	  return head;
	}
	        
	if(head == null) {
	  head = temp;
	  head.next = null;
	}
	    
	else {
	  // crawl to the requested index or the last element in the list, whichever comes first
	  for(int i = 1; i < position && current.getNext() != null; i++) {
	     current = current.getNext();
	  }
	  // set the new node's next-node reference to this node's next-node reference
	  temp.setNext(current.getNext());
	  // now set this node's next-node reference to the new node
	  current.setNext(temp);
	}
		
	return head;				 
     }

     public static void main(String[] args) {       
        InsertANodeAtASpecificPositionInALinkedList list = new InsertANodeAtASpecificPositionInALinkedList();
	list.head = new LinkedListNode(50);
	list.head.next = new LinkedListNode(20);
	list.head.next.next = new LinkedListNode(15);
	list.head.next.next.next = new LinkedListNode(4);
	list.head.next.next.next.next = new LinkedListNode(10); 	 
 	Scanner input = new Scanner(System.in);
	System.out.print("Enter the value of the node you want to insert in the linked list: ");
	int value = input.nextInt();  
	  
	System.out.println();
	System.out.print("Enter the position of the node which you want to insert in the linked list: ");
	int position = input.nextInt();  
		   
	list.InsertNth(list.head, value, position);	
     }
  }
