import java.util.ArrayList;
import java.util.Scanner;

public class CompareTheTriplets {    
	
 public static void compareTriplets(int a0, int a1, int a2, int b0, int b1, int b2) {
   
  int counter = 0;    
  int counter1 = 0;   
              
  if(a0 > b0) {
   counter++;
  }   

  if(a0 == b0) {

  }    

  if(a0 < b0) {
   counter1++;
  }  
 
  if(a1 > b1) {
   counter++;
  }   

  if(a1 == b1) {
	
  }    
	
  if(a1 < b1) {
   counter1++;
  }  
	
  if(a2 > b2) {
    counter++;
  }   
	
  if(a2 == b2) {
	 
  }    
	
  if(a2 < b2) {
   counter1++;
  }       
	 
  System.out.print(counter + " " + counter1);		
 }
	
 public static void main(String[] args) {   
  Scanner input = new Scanner(System.in);
  ArrayList<Integer> elements  = new ArrayList<>();
  System.out.print("Please enter the three numbers in the triplet: ");
  int a0 = input.nextInt();
  int a1 = input.nextInt();
  int a2 = input.nextInt();
  System.out.println();
  System.out.print("Please enter the three numbers in the triplet: ");
  int b0 = input.nextInt();
  int b1 = input.nextInt();
  int b2 = input.nextInt();
  
  System.out.println();
  compareTriplets(a0,a1,a2,b0,b1,b2);  
  }
}
