import java.util.*;

public class TimeComplexityPrimality {
	
 public static void primality(int number) {
        
  boolean isPrime = true;
       
  if(number < 2) {
   isPrime = false;
  }
       
  if(number == 2 || number == 3) {
    isPrime = true; 
  }
        
  if (number > 2 && number%2 == 0 ) {
    isPrime = false;  
  }
                
  for (int i = 3; i <= Math.sqrt(number); i+=2) {
   if(number % i == 0) {
     isPrime = false;
   }
  }
        
  if(isPrime) {
   System.out.println();
   System.out.println("Prime");  
  }
        
  else {
   System.out.println();	  
   System.out.println("Not prime");      
  }    
 } 	

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of integers that you want to check whether they are prime or not: ");
  int p = input.nextInt();
  for(int i = 0; i < p; i++) {
   System.out.println();
   System.out.print("Enter the integer: ");  
   int n = input.nextInt();
   primality(n);
  }
 }
}