import java.util.Scanner;

public class Kangaroo {

 public static void main(String[] args) {         
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the location at which first kangaroo starts: ");
  int x1 = in.nextInt();
  System.out.println();
  System.out.print("Enter the speed at which the first kangaroo moves: ");
  int v1 = in.nextInt();
  System.out.println();
  System.out.print("Enter the location at which second kangaroo starts: ");
  int x2 = in.nextInt();
  System.out.println();
  System.out.print("Enter the speed at which the second kangaroo moves: ");
  int v2 = in.nextInt();
    
  if(v1 == v2) {
   System.out.println();	  
   System.out.println("NO");   
  }
    
  else if ((x2 - x1) / (v1 - v2) > 0 && (x2 - x1) % (v1 - v2) == 0) {
   System.out.println();  
   System.out.println("YES");
  }
    
  else {
   System.out.println();
   System.out.println("NO"); 
  }
 }
}