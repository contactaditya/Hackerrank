import java.util.Scanner;

 public class RepeatedString {

   public static void main(String[] args) {    
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the string: ");
     String s = input.next();
     System.out.println();
     System.out.print("Enter the number of times you want to repeat the string: ");
     long n = input.nextLong();
     int counterA = 0;
     int counterB = 0; 
  
     // Replacing Original String with a new Repeating String which is the original string repeated over n times     
     String string = String.format(String.format("%%%ds", n), " ").replace(" ",s);
	     
     for(int i=0; i<string.length(); i++) {
       if(string.charAt(i) == 'a') {
	 counterA++;  
       } 
       // We are calculating the number of times the character is appearing in the remaining n - (n mod|s|) 
       if((long)i < n % (long)string.length() && string.charAt(i) == 'a') {
	 counterB++;  
       } 
     }
     // The total number of times character a occurs in the repeated string of n length
     System.out.println(); 
     System.out.println("The number of times the letter a appears in the first n letters of the infinite string is: " + n/(long)string.length() * (long)counterA + (long)counterB);  
   }
 }
