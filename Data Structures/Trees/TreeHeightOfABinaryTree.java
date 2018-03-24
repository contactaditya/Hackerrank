import java.util.*;

public class TreeHeightOfABinaryTree {
	 
  public static int getHeight(Node node) {
    if(node == null) {
      return -1;
    }
    else {
      return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
  }
  
  public static Node insert(Node root,int data) {
    if(root==null) {
      return new Node(data);
    }
    else {
      Node current;
      if(data <= root.data) {
        current = insert(root.left,data);
        root.left = current;
      }
      else {
        current = insert(root.right,data);
        root.right = current;
      }
      return root;
    }
  }

  public static void main(String[] args) {  
    Scanner input = new Scanner(System.in);
    int T = input.nextInt();
    Node root = null;
    while(T-->0) {
      int data = input.nextInt();
      root = insert(root,data);
    }
    int height = getHeight(root);
    System.out.println(height);
  }
}
