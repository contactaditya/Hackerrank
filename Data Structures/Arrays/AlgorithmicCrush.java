import java.util.*;
import java.io.*;

public class AlgorithmicCrush {

   public static void main(String[] args) {   
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the size of list: ");
	 int n = input.nextInt();
	 long[] array = new long[n + 1];  
	 System.out.println();
	 System.out.print("Enter the number of operations on the list: ");
	 int m =  input.nextInt();    
	 long max = 0;
	 long sum = 0;
	 for(int i=0; i<m; i++) {
	   System.out.println();
	   System.out.print("Enter the three integers index a, index b and k where k will be added to all elements ranging from index a to index b: ");
	   int a = input.nextInt();
	   int b = input.nextInt();
	   long k = input.nextLong();
	   if(b == n) { 
         array[a-1] += k;
       } else {
         array[a-1] += k;
         array[b] -= k;
       }
     }
	 for(int i=0; i<n; i++) {
	   sum += array[i];
	   if(sum > max) {
	     max = sum;
	   }
	 }
	 System.out.println();
	 System.out.println("The maximum value in the updated list is: " + max);
   }
 }
