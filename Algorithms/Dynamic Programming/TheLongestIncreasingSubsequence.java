import java.util.*;
import java.io.*;

 public class TheLongestIncreasingSubsequence { 
	
   private static int lengthOfLIS(int[] array) {
      ArrayList<Integer> list = new ArrayList<Integer>();   
      if(array == null || array.length == 0) {
	 return 0;
      }
	 
      for(int number : array) {
	if(list.size() == 0 || number > list.get(list.size()-1)) {
	  list.add(number);
	} else {
          int start = 0;
          int end = list.size() - 1; 
		  
	  while(start < end) {
	    int mid = (start + end) / 2;
	    if(list.get(mid) < number) {
	      start = mid + 1;	
	    } else {
	      end = mid;	
	    }		  
	  }
          list.set(end, number);  
	}
      }
	   
     return list.size(); 
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of elements in the array: ");
      int number = input.nextInt();   
      int array[] = new int[number];
		    
      System.out.print("\n");
      System.out.print("Please enter the actual values in the array: ");
      for(int i = 0; i < number; i++) {
        array[i] = input.nextInt(); 
      }
	   
      int max = lengthOfLIS(array);
       
      System.out.println();
      System.out.println("The length of the Longest Increasing Subsequence is: " + max);
   }
 }
