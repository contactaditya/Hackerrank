import java.util.*;

 public class TreeLevelOrderTraversal { 
	Node root;	    
    Node previous;

  public void printLevelOrderTraversal(Node node) {
		 
   Queue<Node> queue = new LinkedList<Node>();
   queue.add(root);
   while (!queue.isEmpty()) {
	 Node tempNode = queue.poll();
     System.out.print(tempNode.data + " ");   
	   
     if (tempNode.left != null) {
         queue.add(tempNode.left);
     }

     /*Enqueue right child */
     if (tempNode.right != null) {
         queue.add(tempNode.right);
     }
  }	
 }

   public static void main(String[] args) { 	
	 TreeLevelOrderTraversal tree = new TreeLevelOrderTraversal();
	 tree.root = new Node(3);
	 tree.root.left = new Node(5);
	 tree.root.right = new Node(2);
	 tree.root.left.left = new Node(1);
	 tree.root.left.right = new Node(4);
	 tree.root.right.left = new Node(6);
	     
	 System.out.print("Level order traversal of binary tree is: ");
	 tree.printLevelOrderTraversal(tree.root);		

   }
  }
