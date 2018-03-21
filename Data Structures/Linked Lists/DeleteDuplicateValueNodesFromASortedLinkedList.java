import java.util.*;

 public class DeleteDuplicateValueNodesFromASortedLinkedList {  
    private static LinkedListNode head;
    private static int size;  

    public DeleteDuplicateValueNodesFromASortedLinkedList() {
      // this is an empty list, so the reference to the head node is set to a new node with no data				  
      head = new LinkedListNode(null);
      size = 0;
    }

    public static LinkedListNode RemoveDuplicates(LinkedListNode head) {
      LinkedListNode temp = head;
     
      while(temp.getNext() != null) {    
        if(temp.data == temp.next.data) {
   	  temp.next = temp.next.next;
        } else {
          temp = temp.next;
        }
      }
      return head;
    }

    public static void main(String[] args) { 	  
      DeleteDuplicateValueNodesFromASortedLinkedList list = new DeleteDuplicateValueNodesFromASortedLinkedList();
      PrintElementsOfALinkedList list1 = new PrintElementsOfALinkedList();
      list.head = new LinkedListNode(50);
      list.head.next = new LinkedListNode(20);
      list.head.next.next = new LinkedListNode(15);
      list.head.next.next.next = new LinkedListNode(4);
      list.head.next.next.next.next = new LinkedListNode(4);
	  
      list.RemoveDuplicates(head);
      list1.PrintElementsOfALinkedList(head);
    }
 }
