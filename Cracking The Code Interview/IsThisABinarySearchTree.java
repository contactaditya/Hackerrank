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
 
 public class IsThisABinarySearchTree {	
   Node root;	    
   Node previous;
  
   boolean checkBST() {	 
     return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE); 
   }
 
   boolean checkBST(Node node, int min, int max) { 
      if (node == null) {
        return true;
      }
  
      if (node.data < min || node.data > max) {
	return false; 
      }
    
     return (checkBST(node.left, min, node.data-1) && checkBST(node.right, node.data+1, max));  
   }
	
   public static void main(String[] args) {	 
     IsThisABinarySearchTree tree = new IsThisABinarySearchTree();
     tree.root = new Node(4);
     tree.root.left = new Node(2);
     tree.root.right = new Node(5);
     tree.root.left.left = new Node(1);
     tree.root.left.right = new Node(3);
     
     if (tree.checkBST()) {
       System.out.println("This tree is a BST");
     }
     else {
       System.out.println("This tree is not a BST");
     }
   }
 }
