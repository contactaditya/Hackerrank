import java.util.*;

  public class BinarySearchTreeInsertion {
    Node root;	    
    Node previous;
    
    public Node Insert(Node root, int value) {
      if(root == null) {	   
        Node node = new Node(value);
        root = node;
      }    	          
      else if (root.data > value) {    
        root.left = Insert(root.left, value);
      }
      else if (root.data < value) { 
        root.right = Insert(root.right, value);
      }  
      return root;   
    }

    public static void main(String[] args) { 	 
      BinarySearchTreeInsertion tree = new BinarySearchTreeInsertion();
      tree.root = new Node(4);
      tree.root.left = new Node(2);
      tree.root.right = new Node(7);
      tree.root.left.left = new Node(1);
      tree.root.left.right = new Node(3);
	 
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the value of the node you want to insert in the tree: ");
      int value = input.nextInt();  
	   
      tree.Insert(tree.root, value);		
  }
}
