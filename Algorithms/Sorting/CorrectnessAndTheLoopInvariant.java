import java.util.*;

public class CorrectnessAndTheLoopInvariant {
  
 public static void insertionSort(int[] A) {
   for(int i = 0; i < A.length; i++) {
	int value = A[i];
	int j = i;
    while(j > 0 && A[j-1] > value) {
	  A[j] = A[j-1];
	  j = j - 1;
	}
   A[j] = value;
   } 
  printArray(A);
 }
 
 static void printArray(int[] ar) {
   System.out.print("\n"); 
   System.out.print("The sorted array is: ");
   for(int n: ar) {
     System.out.print(n+" ");
   }
 }

 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter number of elements in the array: ");
   int numbers = input.nextInt();
   int[] array = new int[numbers];
   System.out.print("\n");
   System.out.print("Please enter the actual values in the array: ");
   for(int i=0; i<numbers; i++) {
     array[i] = input.nextInt();
   }
  insertionSort(array);
 }
}
