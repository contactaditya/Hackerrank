import java.util.*;

 public class GetNodeValue { 	
     private static LinkedListNode head;
     private static int size;  

     public GetNodeValue() {
       // this is an empty list, so the reference to the head node is set to a new node with no data				  
	 head = new LinkedListNode(null);
	 size = 0;
     }
 
     public static void GetNode(LinkedListNode head, int position) {
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;

        for(int i = 0; i < position; i++) {
	   p2 = p2.getNext();
        }
	   
        while(p2.next != null) {
	  p1 = p1.getNext();
	  p2 = p2.getNext();	  
        }
	   
        System.out.println();	   
        System.out.println("Content of the specific element of the linked list is: " + p1.getData());
    }

   public static void main(String[] args) { 	  
       GetNodeValue list = new GetNodeValue();
       list.head = new LinkedListNode(50);
       list.head.next = new LinkedListNode(20);
       list.head.next.next = new LinkedListNode(15);
       list.head.next.next.next = new LinkedListNode(4);
       list.head.next.next.next.next = new LinkedListNode(10);
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the position of the node from the tail which you want to insert in the linked list: ");
       int position = input.nextInt();  
	  
       list.GetNode(head, position);

  }
}
