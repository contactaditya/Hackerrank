import java.util.*;

  public class MergeTwoSortedLinkedLists { 	
    private static LinkedListNode head;
    private static int size;      

    public MergeTwoSortedLinkedLists() {
       // this is an empty list, so the reference to the head node is set to a new node with no data				  
       head = new LinkedListNode(null);
       size = 0;
    }

    public static LinkedListNode MergeLists(LinkedListNode headA, LinkedListNode headB) { 
       LinkedListNode list = headA;
       LinkedListNode list1 = headB;
       
       if (list == null && list1 == null) {
     	  return null; 
        }
      
       if (list == null) {
    	  return list1; 
       }
    	   
       if (list1 == null) {
    	   return list;
       }

       if ((int)list.data < (int)list1.data) {
    	 list.next = MergeLists(list.next, list1);
         return list;
       } else {
    	 list1.next = MergeLists(list1.next, list);
         return list1;
       }
    }

    public static void main(String[] args) { 	  

    }  
  }
