import java.util.*;

public class Quicksort2Sorting {
 
  static int partition(int[] array, int left, int right) {
        
   int pivot = array[left];  
	        
   List<Integer> leftElements = new ArrayList<Integer>();
   List<Integer> rightElements = new ArrayList<Integer>();    
	        
   for(int i = left + 1; i < right; i++) {
	          
     if(array[i] < pivot) {
       leftElements.add(array[i]);
     }
	          
     else {
       rightElements.add(array[i]); 
     }
   }
	          
   for (int i = 0; i < leftElements.size(); i++) {
     array[i + left] = leftElements.get(i);
   }  
	          
   array[left + leftElements.size()] = pivot;  
	          
   for (int i = 0; i < rightElements.size(); i++) {
     array[left + i + leftElements.size() + 1] = rightElements.get(i);
   }  
	                    
 return left + leftElements.size();            
 }   	
	

 static void quickSort(int[] array, int left, int right) {
   if (right - left >= 2) {
     int pivot = partition(array, left, right);
     quickSort(array, left, pivot);
     quickSort(array, (pivot + 1), right);
     printArray(array, left, right);
  }	         
 }  	
		
 static void printArray(int[] array, int left, int right) {
   System.out.print("\n"); 
   System.out.print("The array after sorting is: ");  
   for (int i = left; i < right; i++) {
     System.out.print(array[i]+" ");
   }
 System.out.println("");
 }	

 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter number of elements in the array: ");
   int numbers = input.nextInt();
   int[] array = new int[numbers];
   System.out.print("\n");
   System.out.print("Please enter the actual values in the array: ");
   for(int i=0;i<numbers;i++) {
     array[i] = input.nextInt(); 
   }
   quickSort(array, 0 , array.length);
  }
}
