import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {     
 
  public static void countHashMap(String values[], String queries[]) {
    Map<String,Integer> list = new HashMap<String,Integer>();
    
    for (String value : values) {
      if (list.containsKey(value)) {
        int count = list.get(value);
        list.put(value, count + 1);
      } else {
        list.put(value, 1);
      }
    }
    
    int count = 0;
    int[] counts = new int[queries.length];

    for (int i = 0; i < queries.length; i++) {
      String query = queries[i];
      if(list.containsKey(query)) {
        counts[i] = list.get(query);
      }
      else {
        counts[i] = 0;
      }
      System.out.println("The number of times the query " + query + " occurs is: " + counts[i]);        
    }         
  }

  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of strings: ");
    int numberValues = input.nextInt();
    String[] values = new String[numberValues];
    System.out.println();	
    System.out.print("Enter the strings: ");
    for(int i=0;i<numberValues;i++) {
      values[i]=input.next(); 
    } 
    System.out.println();	
    System.out.print("Enter the number of queries: ");
    int numberQueries = input.nextInt();
    String[] queries = new String[numberQueries];
    System.out.println();	
    System.out.print("Enter the queries: ");
    for(int i=0;i<numberQueries;i++) {
      queries[i]=input.next(); 
    } 
    System.out.println();	
    countHashMap(values,queries);   
  }
}
