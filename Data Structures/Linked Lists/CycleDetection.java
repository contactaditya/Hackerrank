import java.util.*;

public class CycleDetection { 	
    private static LinkedListNode head;
    private static int size;  

   public CycleDetection() {
   // this is an empty list, so the reference to the head node is set to a new node with no data				  
      head = new LinkedListNode(null);
      size = 0;
   }

   public static boolean hasCycle(LinkedListNode head) {
      LinkedListNode fast = head;
      LinkedListNode slow = head;
     	         		     
      while(fast != null && fast.next != null && slow != null) {
    	slow = slow.next;
    	fast = fast.next.next; 
    			     
    	if(slow == fast) {
    	  return true; 
    	}
     }   	  
  return false;   
  }

   public static void main(String[] args) {  
        CycleDetection list = new CycleDetection();
	list.head = new LinkedListNode(50);
	list.head.next = new LinkedListNode(20);
	list.head.next.next = new LinkedListNode(15);
	list.head.next.next.next = new LinkedListNode(4);
	list.head.next.next.next.next = new LinkedListNode(10);
	     	     
	boolean IsACycle = list.hasCycle(head);
	  
	if(IsACycle) {
	   System.out.println("There is a cycle in the linkedlist.");  
	}
	else {
	   System.out.println("There is no cycle in the linkedlist.");    
	}
      }
    }

