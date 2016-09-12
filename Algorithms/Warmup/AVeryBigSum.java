import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {

 public static void main(String[] args) { 
   Scanner in = new Scanner(System.in);
   Scanner input = new Scanner(System.in);
   List<Long> list = new ArrayList<Long>();
   
   System.out.print("Enter the number of elements in the array: ");
    
   int t;
   long sum = 0;
   t = input.nextInt();
   
   System.out.println();	
   System.out.print("Please enter the elements in the array: ");
    
   for (int i=0;i<t;i++) {
     list.add(input.nextLong());
   }
    
   for(Long i : list) {
     sum = sum + i;
   }
   
  System.out.println();	 
  System.out.println("The sum of the elements in the array is " + sum);   
 }
}