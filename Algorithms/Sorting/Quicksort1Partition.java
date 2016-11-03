import java.util.*;

public class Quicksort1Partition {
	
  static void partition(int[] array) {
    int pivot = array[0];  
    int left = 0;
    int right = array.length;  
        
    List<Integer> leftElements = new ArrayList<Integer>();
    List<Integer> rightElements = new ArrayList<Integer>();    
        
    for(int i = 1; i < array.length; i++) {
          
     if(array[i] < pivot) {
       leftElements.add(array[i]);
     }
          
     else {
       rightElements.add(array[i]); 
     }
    }
          
     for (int i = 0; i < leftElements.size(); i++) {
       array[i] = leftElements.get(i);
     }  
          
     array[leftElements.size()] = pivot;  
          
     for(int i = 0; i < rightElements.size(); i++) {
	array[i + leftElements.size() + 1] = rightElements.get(i);
     }  
          
  printArray(array);               
 }   
 
  static void printArray(int[] array) {
    System.out.print("\n"); 
    System.out.print("The array after partioning is: ");  
    for(int n: array) {
      System.out.print(n+" ");
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
     for(int i=0; i<numbers; i++) {
       array[i] = input.nextInt();
     }
     partition(array);
  }
 }

