import java.util.Scanner;

public class MergeSortCountingInversions {
 
  public static long countInversions(int[] array){
    int[] helper = new int[array.length];
    return mergeSort(array, helper, 0, array.length - 1);
  }
       
  public static long mergeSort(int[] array, int[] helper, int start, int end) {
    if(start == end) {
      return 0;    
    }
             
    int middle = (start + end) / 2; 
    long count = 0; 
           
    // Sort left half
   count += mergeSort(array, helper, start, middle); 
   // Sort right half
   count += mergeSort(array, helper, middle+1, end); 
   // Merge them
   count += merge(array, helper, start, middle, end); 
           
   return count;       
  }
       
  public static long merge(int[] array, int[] helper, int start, int middle, int end) {
   int mid = (start + end) / 2;
   int current = 0;
   int i = start;
   int j = middle + 1;
   long count = 0;
   while(i <= middle && j <=end) {
   if(array[i] > array[j]) {
     helper[current++] = array[j++];
     count += mid - i + 1; // Tricky part.
   }
   else {
     helper[current++] = array[i++];          
   }
  }
  // Leftover elements here.
  while(i <= mid) {
    helper[current++] = array[i++];    
  }
           
  while(j <= end) {
    helper[current++] = array[j++];
  }
        
  System.arraycopy(helper, 0, array, start, end - start + 1); // Usual stuff from merge sort algorithm with arrays.
  return count;
  }
     
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter number of datasets: ");
  int datasets = input.nextInt();  
  for (int j = 0; j < datasets; j++) {
   System.out.println();
   System.out.print("Enter number of elements in the datasets: ");
   int number = input.nextInt();  
   int array[] = new int[number];
			
   System.out.println();
   System.out.print("Please enter the actual values in the array: ");
  for (int i = 0; i < array.length; i++) {
   array[i] = input.nextInt();
  }
  System.out.println();
  System.out.println("The number of inversions that must be swapped to sort each dataset on a new line: " + countInversions(array));
  }
 }
}
