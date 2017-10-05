import java.io.*;
import java.util.*;

 public class EqualStacks {
	 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number of cylinders in stacks 1, 2, and 3: ");
       int n1 = input.nextInt();  
       int n2 = input.nextInt();  
       int n3 = input.nextInt();  
       int h1[] = new int[n1];
       int h2[] = new int[n2];
       int h3[] = new int[n3];
       int sum1 = 0, sum2 = 0, sum3 = 0;
       int index1 = 0, index2 = 0, index3 = 0;
       int height = 0;
		    
       System.out.print("\n");
       System.out.print("Please enter the integers describing the cylinder heights in stack 1: ");
       for (int i = 0; i < n1; i++) {
          h1[i] = input.nextInt(); 
	  sum1 += h1[i];
       }
		
       System.out.print("\n");
       System.out.print("Please enter the integers describing the cylinder heights in stack 2: ");
       for (int i = 0; i < n2; i++) {
          h2[i] = input.nextInt(); 
	  sum2 += h2[i];
       }
		
       System.out.print("\n");
       System.out.print("Please enter the integers describing the cylinder heights in stack 3: ");
       for (int i = 0; i < n3; i++) {
	  h3[i] = input.nextInt(); 
          sum3 += h3[i];
       }
			
       while (true) {
	 if(index1 == n1 || index2 == n2 || index3 == n3) { 
	    height = 0;
	    break;
	 }
			
	 if((sum1 == sum2) && (sum1 == sum3)) {
            height = sum1;
	    break;
         }
		   
	 // If height of pile one is highest
	 if(sum1 >= sum2 && sum1 >= sum3) {
	    sum1 -= h1[index1++];
	 }

	 // If height of pile two is highest
         else if(sum2 >= sum1 && sum2 >= sum3) {
	    sum2 -= h2[index2++];
         }
	 // If height of pile three is highest
	 else if(sum3 >= sum2 && sum3 >= sum1) {
	    sum3 -= h3[index3++];
	 }
       }
	
       System.out.print("\n");
       System.out.print("The maximum height at which all stacks will be of equal height: " + height);
    }
 }
