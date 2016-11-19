import java.util.*;

public class SockMerchant {
	
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of socks: ");
    int n = input.nextInt();
    HashMap<Integer, Integer> colors = new HashMap<Integer, Integer>();
    System.out.println();
    System.out.print("Enter the number of socks: ");
    
    for(int i = 0; i < n; i++) {
      int color = input.nextInt();
      Integer frequency = colors.get(color);
      
      if(frequency == null) {
    	 colors.put(color, 1);  
      }
      else {
    	 colors.put(color, frequency + 1);    
      }
    }
    
    input.close();
    
    int pairs = 0;
    for(Integer frequency : colors.values()) {
        pairs += frequency >> 1;
    }
    
    System.out.println();	
    System.out.println("The total number of matching pairs of socks are: " + pairs);	 
  }
}
