import java.util.Scanner;

public class PlusMinus {

  public static void main(String[] args) {  
	  
   Scanner input = new Scanner(System.in);
   double counterpositive = 0; 
   double counternegative = 0; 
   double counterzeroes = 0;  
   System.out.print("Please enter the numbers of integers in the array: ");
             
   while (input.hasNext()) { 
   int n = Integer.parseInt(input.nextLine());
   int array[] = new int[n];    
   
   for (int i = 0; i < n; i++) {
      
    array[i] = input.nextInt(); 
         
	if(array[i] == 0) {
      counterzeroes++; 
    } 
    if(array[i] > 0)  {
      counterpositive++; 
    }
    if(array[i] < 0)  {
      counternegative++; 
    }
   }   
       		          
   System.out.println("A decimal representing the fraction of positive numbers in the array: " + counterpositive/n);   
   System.out.println("A decimal representing the fraction of negative numbers in the array: " + counternegative/n);
   System.out.println("A decimal representing the fraction of zeroes in the array: " + counterzeroes/n);    
        
 }
}
}