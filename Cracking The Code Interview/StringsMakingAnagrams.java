import java.util.Scanner;

public class StringsMakingAnagrams {
 
 public static int NUMBER_LETTERS = 26;

 public static int getDelta(int[] array1, int[] array2) {
  if(array1.length != array2.length) {
     return -1;  
  }
  
  int delta = 0;
  
  for(int i = 0; i < array1.length; i++) {
     int difference = Math.abs(array1[i] - array2[i]);
     delta += difference;
  }
	 
 return delta;	 
 }

 public static int[] getCharCounts(String string) {
  
  int[] charCounts = new int[NUMBER_LETTERS];	 
  
  for(int i=0; i < string.length(); i++) {
    char c = string.charAt(i);
    int offset = (int) 'a';
    int code = c - offset;
    charCounts[code]++;
  }
  return charCounts;	 
 }
	
 public static int numberNeeded(String first, String second) {
  int[] charCount1 = getCharCounts(first);	
  int[] charCount2 = getCharCounts(second);		 
 
  return getDelta(charCount1, charCount2);      
 }

 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the first string: ");
   String first = input.next();
   System.out.println();
   System.out.print("Enter the second string: ");
   String second = input.next();
   System.out.println();
   System.out.print("The number of characters that you need to delete to make the strings anagrams of each other: ");
   System.out.println(numberNeeded(first, second));
 }
}
