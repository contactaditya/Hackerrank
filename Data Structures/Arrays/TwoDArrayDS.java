import java.util.*;

 public class TwoDArrayDS {
   static int maxHourGlassSum = -63; // initialize to lowest possible sum (-9 x 7)
   static int array[][] = new int[6][6];
	 
   public static void hourglass(int i, int j, int array[][]) {  
     int currentHourGlassSum = 0;  
	 
     // sum top 3 and bottom 3 elements
     for(int k = j; k <= j + 2; k++) {
       currentHourGlassSum += array[i][k]; 
       currentHourGlassSum += array[i + 2][k]; 
     }
	 
     currentHourGlassSum += array[i + 1][j + 1];
	 
     if(currentHourGlassSum > maxHourGlassSum) {
       maxHourGlassSum = currentHourGlassSum;
     }
   }
	 
   public static void main(String[] args) {     
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter the actual values in the matrix: ");
     for(int i=0; i < 6; i++) {
       for(int j=0; j < 6; j++) {
         array[i][j] = input.nextInt();
       }
     }
	  
     for(int i=0; i < 4; i++) {
       for(int j=0; j < 4; j++) {
         hourglass(i, j, array);
       }
     }
     System.out.println();
     System.out.println("The largest maximum hourglass sum in the matrix is: " + maxHourGlassSum);
   }
 }
