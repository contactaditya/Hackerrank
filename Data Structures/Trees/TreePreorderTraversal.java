import java.util.*;

 class Node {
   int data;
   Node left;
   Node right;
	   
  public Node(int item) {
    data = item;
    left = right = null;
  }
 }

public class TreePreorderTraversal {
	
  Node root;	    
  Node previous;
	
  public void printPreorderTraversal(Node node) {
		 
    if (node == null) {
	  return;
    }
    
    System.out.print(node.data + " ");		  
    printPreorderTraversal(node.left);
    printPreorderTraversal(node.right);
  }
			
  public static void main(String[] args) {  
	TreePreorderTraversal tree = new TreePreorderTraversal();
	tree.root = new Node(3);
	tree.root.left = new Node(5);
	tree.root.right = new Node(2);
	tree.root.left.left = new Node(1);
	tree.root.left.right = new Node(4);
	tree.root.right.left = new Node(6);
	     
	System.out.print("Preorder traversal of binary tree is: ");
	tree.printPreorderTraversal(tree.root);		
  }
}
