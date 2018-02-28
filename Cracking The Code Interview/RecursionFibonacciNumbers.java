import java.util.*;

  public class RecursionFibonacciNumbers {
	  
    public static int fibonacci(int n) {        
      if(n <= 0) {
        return 0; 
      }
	      
      else if (n == 1) {
   	return 1;
      }
	        
      else {
        return fibonacci(n-1) + fibonacci(n-2);
      }     
    }	

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the integer for which you want to return the value of the fibonacci function: ");
      int n = scanner.nextInt();
      scanner.close();
      System.out.println();
      System.out.println(fibonacci(n));
    }
  }
