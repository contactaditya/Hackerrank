import java.io.*;
import java.util.*;

public class Staircase {

 public static void main(String[] args) {        
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the size of the staircase: ");
  int n = input.nextInt();
  System.out.println();  
  for(int i=1; i<=n; i++) {
   for(int j=1; j<=n; j++) {
     if((i + j) > n) {
       System.out.print("#");
     }
     else {
       System.out.print(" ");
     }           
   }
        
  System.out.println();   
  }
 }
}