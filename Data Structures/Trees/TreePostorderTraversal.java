import java.util.*;

 public class TreePostorderTraversal {  
   Node root;	    
   Node previous;

  public void printPostorderTraversal(Node node) {
		 
   if (node == null) {
	 return;
   }
   
   printPostorderTraversal(node.left);
   printPostorderTraversal(node.right);
   System.out.print(node.data + " ");		
 }
			
 public static void main(String[] args) {  
	TreePostorderTraversal tree = new TreePostorderTraversal();
	tree.root = new Node(3);
	tree.root.left = new Node(5);
	tree.root.right = new Node(2);
	tree.root.left.left = new Node(1);
	tree.root.left.right = new Node(4);
	tree.root.right.left = new Node(6);
	     
	System.out.print("Postorder traversal of binary tree is: ");
	tree.printPostorderTraversal(tree.root);		
 }
}
