import java.util.*;

 public class BinarySearchTreeLowestCommonAncestor {
	Node root;
	
	public Node findLowestCommonAncestor(Node node, int n1, int n2) {
		 
	   if (node == null) {
	     return null;
	   }
		    
	   // If both n1 and n2 are smaller than root, then LCA lies on the left side
       if (node.data > n1 && node.data > n2) {
           return findLowestCommonAncestor(node.left, n1, n2);
       }
 
       // If both n1 and n2 are greater than root, then LCA lies on the right side
       if (node.data < n1 && node.data < n2) {
           return findLowestCommonAncestor(node.right, n1, n2);
       }
       
       return node; 
	}

    public static void main(String[] args) {
      BinarySearchTreeLowestCommonAncestor tree = new BinarySearchTreeLowestCommonAncestor();
      tree.root = new Node(4);
      tree.root.left = new Node(2);
      tree.root.right = new Node(7);
      tree.root.left.left = new Node(1);
      tree.root.left.right = new Node(3);
      tree.root.right.left = new Node(6);
      
      int n1 = 1, n2 = 7;
      Node t = tree.findLowestCommonAncestor(tree.root, n1, n2);
      System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

	}
  }
