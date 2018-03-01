import java.util.Scanner;

  public class SortingBubbleSort {
	
    public static void BubbleSort(long array[]) { 
      int n = array.length;
      int numberOfSwaps = 0;
      for (int j = 0; j < n; j++) {	 
        for (int i = 0; i < n-1; i++) {
          if(array[i] > array[i+1]) {
	    swap(array, i, i+1);
	    numberOfSwaps++;
          }
        }
  
        if(numberOfSwaps == 0) {
	  break;
        }	 
      }
      System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
      System.out.println("First Element: " + array[0]);
      System.out.println("Last Element: " + array[n-1]);
    }
 
    public static void swap(long array[], int i, int j) {
      long t = array[i];
      array[i] = array[j];
      array[j] = t; 
    }

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of elements in the array: ");
      int numbers = input.nextInt();   
      long array[] = new long[numbers];
	    
      System.out.print("\n");
      System.out.print("Please enter the actual values in the array: ");
      for (int i = 0; i < numbers; i++) {
        array[i] = input.nextInt(); 
      }
		
      System.out.print("\n");
      BubbleSort(array);
    }
  }
