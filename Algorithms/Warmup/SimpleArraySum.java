import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArraySum {

 public static void main(String[] args) {  
    
  Scanner input = new Scanner(System.in);
  System.out.print("Enter number of elements in the array: ");
  List<Integer> list = new ArrayList<Integer>();
  
  int t;
  int sum = 0;
  t = input.nextInt();
  
  System.out.println();	
  System.out.print("Please enter the elements in the array: ");
  
  for(int i=0;i<t;i++) {
    list.add(input.nextInt());
  }
  
  for(Integer i : list) {
    sum = sum + i;
  }
  
  System.out.println();
  System.out.println("The sum of the elements in the array is: " + sum);
		
  }
}