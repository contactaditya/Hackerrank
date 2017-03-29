import java.util.Scanner;

public class CircularArrayRotation {

 public static void main(String[] args) { 
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of integers in the array: ");
  int n = input.nextInt();
  int[] array = new int[n];   
  System.out.println();
  System.out.print("Enter the number of circular rotations: ");
  int numberofrotations =  input.nextInt();  
  System.out.println();
  System.out.print("Enter the number of queries for which we will print the value of the element at index m: ");
  int queries = input.nextInt();  
  System.out.println();
  System.out.print("Enter the elements in the array: ");
       
  for(int i=0; i<n; i++) {
   array[(i + numberofrotations) % n] = input.nextInt();
  }
  
  System.out.println();
  System.out.print("Enter the index of the array whose value you want to print: ");             
  for(int k=0; k<queries; k++) {
   System.out.println();
   System.out.print(array[(input.nextInt())]);
  }       
 }
}        