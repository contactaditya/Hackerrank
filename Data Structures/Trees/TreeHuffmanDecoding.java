import java.util.*;

 class NodeHuffman {
   char data;
   int frequency;
   NodeHuffman left;
   NodeHuffman right;
   
   public NodeHuffman(char data, int frequency) {
     this.data = data;
     this.frequency = frequency;
     left = right = null;
   }
 } 
 
 public class TreeHuffmanDecoding {
	 
  void decode(String S ,Node root) {
    StringBuilder sb = new StringBuilder();
    Node c = root;
    for (int i = 0; i < S.length(); i++) {
      c = S.charAt(i) == '1' ? c.right : c.left;
      if (c.data!='\0') {
	sb.append(c.data);
	c = root;
      }
    }
    System.out.print(sb);
  }

  public static void main(String[] args) {


  }
}
