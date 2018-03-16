import java.util.*;

 public class BitManipulationLonelyInteger {
	
   public static int lonelyInteger(int[] array) {
     int n = array.length;
     int result = 0; 
   
     for(int value : array) {
       result = result ^ value;    
     }   
     return result;
   }

   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter number of elements in the array: ");
     int numbers = input.nextInt();   
     int array[] = new int[numbers];
	    
     System.out.print("\n"); 
     System.out.print("Please enter the actual values in the array: ");
     for (int i = 0; i < numbers; i++) {
       array[i] = input.nextInt(); 
     }
   
     System.out.println();
     System.out.println("The lonely integer is: " + lonelyInteger(array));
   }
 }
