import java.util.*;

 public class MarsExploration { 
    public static void MarsExploration(String s) {
      int count = 0;
      for (int i = 0; i < s.length(); i = i + 3) {
	if(s.charAt(i) != 'S') {
	  count++;  
	}
	if(s.charAt(i+1) != 'O') {
	  count++;  
	}
	if(s.charAt(i+2) != 'S') {
	  count++;  
	}
      } 
      System.out.println(); 
      System.out.print("The number of letters in the message that were altered by the cosmic radiation are: " + count); 
    }
	
    public static void main(String[] args) { 
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string with SOS repeated n times: ");
      String s = input.next();
      MarsExploration(s);
    }
 }
