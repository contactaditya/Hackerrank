import java.util.Scanner;

 public class RunningTimeOfAlgorithms {

   public static void main(String[] args) {   
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number of integers in the array: ");
     int s = input.nextInt();
     int[] ar = new int[s];
     System.out.println();
     System.out.print("Enter the elements in the array: ");
     for(int i=0;i<s;i++) {
       ar[i]=input.nextInt(); 
     }
    
     int counter = 0;
     int sum = 0;    
       
     for(int i =1; i < ar.length; i++) {
       int valueToSort = ar[i];
       int j = i;

       while(j>0 && ar[j-1] > valueToSort) {
         ar[j] = ar[j-1]; 
         j--; 
         counter++;  
       }          
       ar[j] = valueToSort;  
     } 
     System.out.println(); 
     System.out.print("The number of shifts it takes to sort the array is: " + counter);   
   }
 }
