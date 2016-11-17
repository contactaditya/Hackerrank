import java.util.*;

 public class TreeInorderTraversal { 
   Node root;	    
   Node previous;

 public void printInorderTraversal(Node node) {
		 
   if (node == null) {
	 return;
   }
 
   printInorderTraversal(node.left);
   System.out.print(node.data + " ");	
   printInorderTraversal(node.right);
}
			
 public static void main(String[] args) {  
	TreeInorderTraversal tree = new TreeInorderTraversal();
	tree.root = new Node(3);
	tree.root.left = new Node(5);
	tree.root.right = new Node(2);
	tree.root.left.left = new Node(1);
	tree.root.left.right = new Node(4);
	tree.root.right.left = new Node(6);
	     
	System.out.print("Inorder traversal of binary tree is: ");
	tree.printInorderTraversal(tree.root);		
 }
}
