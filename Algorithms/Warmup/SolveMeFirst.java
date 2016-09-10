import java.util.Scanner;

public class SolveMeFirst {
	
 public static int solveMeFirst(int a, int b) {
    return a+b;
 }

 public static void main(String[] args) { 
   System.out.print("Please enter the two numbers whose sum you want to calculate: ");	 
   Scanner input = new Scanner(System.in);
   int a;
   a = input.nextInt();
   int b;
   b = input.nextInt();
   int sum;
   sum = solveMeFirst(a, b);
   System.out.println();
   System.out.println("The sum of the two numbers is: " + sum);
  }
}
