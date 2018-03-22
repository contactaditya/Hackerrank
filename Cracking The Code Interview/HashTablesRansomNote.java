import java.util.*;
import java.io.*;

public class HashTablesRansomNote {     
	
  public static String getResponse(int m, int n, String[] magazine, String[] ransom) {
    HashMap<String, Integer> magazineHashMap = new HashMap<String, Integer>();  
    HashMap<String, Integer> ransomHashMap = new HashMap<String, Integer>(); 
    int count = 0;
    String response = "Yes"; 
    
    for (String i : magazine) {
      int x = magazineHashMap.containsKey(i) ? magazineHashMap.get(i) : 0;
      magazineHashMap.put(i,x+1);         
    } 
     
    for (String i : ransom) {
      int x = ransomHashMap.containsKey(i) ? ransomHashMap.get(i) : 0;
      ransomHashMap.put(i,x+1);         
    }  
     
    for (String i : ransomHashMap.keySet()) {
      if (!(magazineHashMap.containsKey(i) && magazineHashMap.get(i) >= ransomHashMap.get(i))) {
        response = "No";
      }
    }
    return response;
  }
 
  public static HashMap<String, Integer> getStringFrequency(String[] text) {
    HashMap<String, Integer> frequencies = new HashMap<String, Integer>();
    for(String word : text) {
      if(!frequencies.containsKey(word)) {
        frequencies.put(word, 0); 
      }
      frequencies.put(word, frequencies.get(word) + 1);
    }
    return frequencies;
  }
 
  public static boolean hasEnoughStrings(HashMap<String, Integer> magazineFrequency, HashMap<String, Integer> ransomFrequency) {
    HashMap<String, Integer> frequencies = new HashMap<String, Integer>();
    for(Map.Entry<String, Integer> entry : ransomFrequency.entrySet()) {
      String word = entry.getKey();   
      if(!magazineFrequency.containsKey(word) || magazineFrequency.get(word) < entry.getValue()) {
        return false;	
      }  
    } 
    return true;
  }
 
  public static boolean canBuildRandomNote(String[] magazine, String[] ransom) {
    HashMap<String, Integer> magazineFrequency = getStringFrequency(magazine);  
    HashMap<String, Integer> ransomFrequency = getStringFrequency(ransom);  

    return hasEnoughStrings(magazineFrequency, ransomFrequency);
  }
		
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of words in magazine and ransom note: ");
    int m = input.nextInt();
    int n = input.nextInt();
    String magazine[] = new String[m];
    System.out.println();
    System.out.print("Enter the words in the magazine: ");
    for(int i=0; i < m; i++) {
      magazine[i] = input.next();
    }
    System.out.println();
    System.out.print("Enter the words in the ransom note: ");
    String ransom[] = new String[n];
    for(int j=0; j < n; j++) {
      ransom[j] = input.next();
    }
     
    System.out.println();
    System.out.println(getResponse(m,n,magazine,ransom));  
  
    System.out.println();
    System.out.println(canBuildRandomNote(magazine,ransom));  
  }
}
