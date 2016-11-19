import java.util.*;

public class DivisibleSumPairs { 
	
  public static void divisibleSumPairs(int array[], int k) {
    
    int pairs = 0;
    
   for(int i = 0; i < array.length; i++) {
     for(int j = i + 1; j < array.length; j++) {
        if((array[i] + array[j]) % k == 0) {
          pairs = pairs + 1; 
        }
     }  
   }
   
  System.out.println();  
  System.out.println("The number of pairs where array[i] and array[j] is evenly divisible by k are: " + pairs);
  }
	
	

  public static void main(String[] args) { 
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of elements in the array and the number which evenly divides the sum of two numbers in the array where i<j: ");
    int n = input.nextInt();
    int k = input.nextInt();
    int array[] = new int[n];
    System.out.println();
    System.out.print("Please enter the actual values in the array: ");
    for(int i=0; i < n; i++){
      array[i] = input.nextInt();
    }	
    divisibleSumPairs(array, k);
  }
}
