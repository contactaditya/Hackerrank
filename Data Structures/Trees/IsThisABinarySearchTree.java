import java.util.*;
	
 class BSTNode {
   int data;
   BSTNode left;
   BSTNode right;
   
  public BSTNode(int item) {
    data = item;
    left = right = null;
  }
 }
 
 public class IsThisABinarySearchTree {
	
  BSTNode root;	    
  BSTNode previous;
  
 boolean checkBST() {	 
   return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE); 
 }
 
 boolean checkBST(BSTNode node, int min, int max) {
	 
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
   tree.root = new BSTNode(4);
   tree.root.left = new BSTNode(2);
   tree.root.right = new BSTNode(5);
   tree.root.left.left = new BSTNode(1);
   tree.root.left.right = new BSTNode(3);
     
   if (tree.checkBST()) {
     System.out.println("This tree is a BST");
   }
   else {
     System.out.println("This tree is not a BST");
   }

 }
}
