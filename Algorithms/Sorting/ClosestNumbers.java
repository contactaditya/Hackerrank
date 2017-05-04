import java.io.*;
import java.util.*;

 public class ClosestNumbers { 	
	 
	public static ArrayList<Long> getClosestNumbers(long[] array) {
	   int n = array.length;  
	   ArrayList<Long> closestNumbersList = new ArrayList<Long>();
	   long min = Long.MAX_VALUE;
	   
	   for(int i = 0; i < array.length - 1; i++) {
		   long numberA = array[i];
           long numberB = array[i + 1];
           long difference = Math.abs(numberB - numberA); 
           if(difference < min) {
        	  min = difference;
              closestNumbersList.clear();
              closestNumbersList.add(numberA);
              closestNumbersList.add(numberB);   
           }
           
           else if(difference == min) {
        	  closestNumbersList.add(numberA);
              closestNumbersList.add(numberB);
           }
	   }
	   
	   Collections.sort(closestNumbersList);
       return closestNumbersList;
	}	

	public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);
	    System.out.print("Enter number of elements in the array: ");
	    int numbers = input.nextInt();   
	    long array[] = new long[numbers];
	    
	    System.out.print("\n");
		System.out.print("Please enter the actual values in the array: ");
		for (int i = 0; i < numbers; i++) {
		  array[i] = input.nextInt(); 
		}
						
		Arrays.sort(array);
		
		ArrayList<Long> result = new ArrayList<Long>();
		
	    result = getClosestNumbers(array);
	    
	    System.out.print("\n");
	    
	    System.out.print("The pair of elements that have smallest absolute difference between them are: ");
	    for(int i = 0; i < result.size(); i++) {
           System.out.print(result.get(i) + " ");
        }
	}
 }
