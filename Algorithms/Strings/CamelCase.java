import java.util.*;

 public class CamelCase {

   public static void CamelCase(String s) {
     int count = 1;
     for (int i = 0; i < s.length(); i++) {
       if(Character.isUpperCase(s.charAt(i))) {
	 count++; 
       }
     } 
     System.out.println(); 
     System.out.print("The number of words in the String " + s + " is: " + count); 
   }

   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter a string in camel case: ");
     String s = in.next();
     CamelCase(s);
   }
 }
