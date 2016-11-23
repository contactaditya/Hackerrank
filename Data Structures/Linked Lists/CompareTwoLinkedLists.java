import java.util.*;

 public class CompareTwoLinkedLists {   
	private static LinkedListNode head;
	private static int size;      
	
  public CompareTwoLinkedLists() {
	  // this is an empty list, so the reference to the head node is set to a new node with no data				  
	  head = new LinkedListNode(null);
	  size = 0;
  }

  public static int CompareTwoLinkedLists(LinkedListNode current, LinkedListNode current1) { 
	LinkedListNode list = current;
	LinkedListNode list1 = current1;
	
	while (list != null && list1 != null && list.data == list1.data) {    
	  list = list.next;
	  list1 = list1.next;
	}
	     
	if(list!=null || list1!=null) {
	  return 0;
	} else {
	  return 1;
	}
  }

	public static void main(String[] args) {  
	  CompareTwoLinkedLists list = new CompareTwoLinkedLists();
	  list.head = new LinkedListNode(50);
	  list.head.next = new LinkedListNode(20);
	  list.head.next.next = new LinkedListNode(15);
	  list.head.next.next.next = new LinkedListNode(4);
	  list.head.next.next.next.next = new LinkedListNode(10);
	  
	  int x = CompareTwoLinkedLists(list.head, list.head);
	  
	  if(x == 1) {	  
		System.out.println("The two linked lists are same.");
	  }
	  else {
		System.out.println("The two linked lists are not same."); 
	  }	  
 }
}
