import java.util.*;
import java.io.*;

  public class BirthdayCakeCandles {
	 
    public static int birthdayCakeCandles(int number, int array[]) {
      int frequency = 0;	
      int tallest = 0;
      for(int i=0; i < number; i++) {
	int height = array[i];
	            
	if(height > tallest) {
	  tallest = height;
	  frequency = 1;
	}
	else if(height == tallest) {
	  frequency++;
	}
      }
      return frequency;
    }

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of elements in the array: "); 
      int numbers = input.nextInt();   
      int array[] = new int[numbers];
	    
      System.out.print("\n");
      System.out.print("Please enter the actual values in the array: ");
      for(int i = 0; i < numbers; i++) {
	array[i] = input.nextInt(); 
      }	
	  
      int numberOfCandles = birthdayCakeCandles(numbers, array);
	    
      System.out.println();
      System.out.println("The number of candles she can successfully blow out are: " + numberOfCandles);
    }
  }
