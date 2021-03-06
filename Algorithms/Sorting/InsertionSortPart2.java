import java.util.Scanner;

  public class InsertionSortPart2 { 

     public static void insertionSortPart2(int[] array) {       
       for(int i =1; i < array.length; i++) {
         int valueToSort = array[i];
         int j = i;
         while(j>0 && array[j-1] > valueToSort) {
           array[j] = array[j-1]; 
           j--; 
         }          
         array[j] = valueToSort;
         printArray(array);     
       }
     }  	
	
     private static void printArray(int[] array) {
       for(int n: array) {
         System.out.print(n + " ");
       }
       System.out.println("");
     }    
		 	
     public static void main(String[] args) {   
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the number of integers in the array: ");
       int s = input.nextInt();
       int[] array = new int[s];
       System.out.println("");
       System.out.print("Enter the elements in the array: ");
       for(int i=0;i<s;i++){
         array[i]=input.nextInt(); 
       }
       insertionSortPart2(array);
     }
  }  
