import java.util.*;

 public class DeleteANode {    
  private static LinkedListNode head;
  private static int size;      
 
  public DeleteANode() {
	  // this is an empty list, so the reference to the head node is set to a new node with no data				  
	  head = new LinkedListNode(null);
	  size = 0;
  }
 
  public static LinkedListNode Delete(LinkedListNode head, int position) {   
	
	LinkedListNode current = head;
	
	 if (position == 0){
	   return current.next;
	 }  
	    
	for(int i=1; i < position; i++) {
      if(current.getNext() == null) {
       return head;
  	  }
      current = current.getNext();
    }	 		  
    System.out.println();
    System.out.println("The linked list has successfully removed " + current.getNext().getData());
    current.setNext(current.getNext().getNext());
    return head;
  } 
	
	public static void main(String[] args) {       
	  DeleteANode list = new DeleteANode();
	  list.head = new LinkedListNode(50);
	  list.head.next = new LinkedListNode(20);
	  list.head.next.next = new LinkedListNode(15);
	  list.head.next.next.next = new LinkedListNode(4);
	  list.head.next.next.next.next = new LinkedListNode(10);
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the position of the node which you want to insert in the linked list: ");
	  int position = input.nextInt();  
	  
	  list.Delete(head, position);
  }
}
