import java.util.*;

  public class TreeTopView {
    Node root;	    
    Node previous;	
    
  public void printgoLeft(Node node) {
		 
    if (node.left != null) {
      printgoLeft(node.left);
    }
            
    System.out.print(node.data + " ");		  
  }   

  public void printgoRight(Node node) {
	
    System.out.print(node.data + " ");		   
		 
    if (node.right != null) {
      printgoRight(node.right);
    } 
  }     

  public void printTopView(Node root) {
		 
    if (root.left != null) {
       printgoLeft(root.left);
    }
        
    System.out.print(root.data + " ");		  
    
    if(root.right != null) {
       printgoRight(root.right);
    }
  }    
	
  public static void main(String[] args) { 
     TreeTopView tree = new TreeTopView();
     tree.root = new Node(3);
     tree.root.left = new Node(5);
     tree.root.right = new Node(2);
     tree.root.left.left = new Node(1); 
     tree.root.left.right = new Node(4);
     tree.root.left.left.right = new Node(9);
     tree.root.right.left = new Node(6);
     tree.root.right.right = new Node(7);
     tree.root.right.right.left = new Node(8);
	     
     System.out.print("Top view of the binary tree is: ");
     tree.printTopView(tree.root);		
  }
}
