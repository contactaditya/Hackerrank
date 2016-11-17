import java.util.*;

public class TheMaximumSubarray {   
 
 public static int maxContiguousSubArraySum(int[] array) {

   int max = array[0];
   int sum[] = new int[array.length];
   sum[0] = array[0];
    
   for(int i = 1; i < array.length; i++) {
      sum[i] = Math.max(array[i], sum[i-1] + array[i]);
      max = Math.max(max, sum[i]);
   }
 return max; 	
 }	
 
 public static int maxNonContiguousSubArraySum(int[] array) {

   int max = array[0];
   int sumMax = 0;
   boolean negativeArray = true;
   int result = 0;
	    
   for(int i = 0; i < array.length; i++) {
	if (array[i] >= 0) {
	  sumMax += array[i];
	  negativeArray = false;
	}  
	if (array[i] >= max) { 
	  max = array[i];
	}
   }
   
   if (negativeArray == false) {
	  result = sumMax;  
   }
		
   if (negativeArray) {
	  result = max;
   }
	
  return result;	
 }	
	
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of test cases: ");    
    int numberOfTests = input.nextInt();
     for (int j = 0; j < numberOfTests; j++) {
      System.out.println();	 
	  System.out.print("Enter number of elements in the array: ");
	  int number = input.nextInt();  
	  int array[] = new int[number];
		
	  System.out.println();	
	  System.out.print("Please enter number: ");
	 for (int i = 0; i < array.length; i++) {
	   array[i] = input.nextInt();
     }
 		
    int max = maxContiguousSubArraySum(array);
    int max1 = maxNonContiguousSubArraySum(array);
	System.out.print("\n");
		    
	System.out.println("The value of the sum of the maximum contiguous and non contiguous subarray within an array is: " + max + " " + max1);
   }
  }     
 }