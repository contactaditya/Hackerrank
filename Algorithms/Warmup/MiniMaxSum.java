import java.util.Arrays;
import java.util.Scanner;

  public class MiniMaxSum {

     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       long array[] = new long[5];
       System.out.print("Please enter only five values in the array: ");
       for (int i = 0; i < 5; i++) {
	 array[i] = input.nextLong(); 
       }
	   
       Arrays.sort(array);
       long min = 0;
       long max = 0;
	   
       for(int i=0; i<4; i++) {
	 min += array[i];
       }
	   
       for(int i=1; i<5; i++) {
	 max += array[i];
       }
	   
       System.out.println();
       System.out.println("The minimum value that can be obtained by summing exactly four of the five integers: " + min);
	   
       System.out.println();
       System.out.println("The maximum value that can be obtained by summing exactly four of the five integers: " + max);	   
     }
  }
