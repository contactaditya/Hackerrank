import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CutTheSticks { 
	
 public static void cutSticks(ArrayList<Integer> sticks) {
  int totalNumberOfCuts = 0;
  int cutLength = Collections.min(sticks);
  sticks.removeAll(Arrays.asList(cutLength));    
  for(int i=0;i<sticks.size();i++) {
   int temp = sticks.get(i) - cutLength;
   sticks.remove(i);
   sticks.add(i, temp);
 }  
}

 public static void main(String[] args) {
 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of elements in the array: ");
  int numberOfSticks = input.nextInt(); 
  ArrayList<Integer> sticks = new ArrayList<Integer>();
  System.out.println();	
  System.out.print("Please enter the elements in the array: ");
  for(int i=0;i<numberOfSticks;i++) { 
	sticks.add(input.nextInt());
  }
  System.out.println();	
	  
 while (!sticks.isEmpty()) {
  System.out.println(sticks.size());
  cutSticks(sticks);
  }    
 }   
}    