import java.io.*;
import java.util.*;

 public class TheHurdleRace {
	
    public static int getMinimumMagicBeverage(int[] array, int maximumHeight) {
       int countDrinks = 0;	
       int max = maximumHeight;
       
       for(int i = 0; i < array.length; i++) {
         if(array[i] > max){
            countDrinks += (array[i] - max);
            max = array[i];
         }
       }
       return countDrinks;
    } 
	 
	public static void main(String[] args) { 
	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter number of hurdles and the maximum height he can jump without consuming any beverages: ");
	   int numberOfHurdles = input.nextInt();  
	   int maximumHeight = input.nextInt(); 
	   int array[] = new int[numberOfHurdles];
	    
	   System.out.print("\n");
	   System.out.print("Please enter the different heights that needs to be jumped as part of the hurdle race: ");
	   for (int i = 0; i < numberOfHurdles; i++) {
		 array[i] = input.nextInt(); 
	   }
	   
	   int numberOfMagicBeverages = getMinimumMagicBeverage(array, maximumHeight);
	   System.out.print("\n");
	   System.out.print("The minimum number of magic beverages that Dan must drink to complete the race are: " + numberOfMagicBeverages);
	   
	}	
  }