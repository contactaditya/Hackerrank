import java.util.*;

 public class TrieNode {
    public static int NUMBER_OF_CHARACTERS = 26;
    TrieNode[] children = new TrieNode[NUMBER_OF_CHARACTERS];
    int size = 0;
	    
    public static int getCharIndex(char c) {
      return c - 'a';
    }
	    
    private TrieNode getNode(char c) {
      return children[getCharIndex(c)];
    }
	    
    private TrieNode setNode(char c, TrieNode node) {
      return children[getCharIndex(c)] = node;
    }
	    
    public void add(String s) {
      add(s, 0);
    }
	    
    public void add(String s, int index) {
      size++;	
      if(index == s.length()) {
	return;
      }
      char current = s.charAt(index);
      int charCode = getCharIndex(current);
      TrieNode child = getNode(current);
      if(child == null) {
        child = new TrieNode();
	setNode(current, child);
      }
      child.add(s, index + 1);
    }
 
    public int findCount(String s, int index) {
      if(index == s.length()) {
	return size;
      }
	
      TrieNode child = getNode(s.charAt(index));
      if(child == null) {
        return 0;
      }
	 
      return child.findCount(s, index + 1);
    }
	    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      TrieNode trie = new TrieNode();
      System.out.print("Enter the number of operations to perform: ");
      int n = input.nextInt();
      System.out.println();
      System.out.print("Enter the operation either add or find: ");
      for(int i = 0; i < n; i++) {
        String operation = input.next();
        String contact = input.next();
       
        if (operation.equals("add")) {
          trie.add(contact);
        }
        else {
          int x = trie.findCount(contact, 0);
          System.out.println();
          System.out.println("The number of contacts starting with the partial string " + contact + " are: " + x);   
        }
      }
    }     
 }

