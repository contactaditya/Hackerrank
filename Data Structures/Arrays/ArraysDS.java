import java.util.Scanner;

public class ArraysDS {   
	
  public static void reverse(int[] data) {
    for (int left = 0, right = data.length - 1; left < right; left++, right--) {
      // swap the values at the left and right indices
      int temp = data[left];
      data[left]  = data[right];
      data[right] = temp;
    }
  }

  public static void main(String[] args) {  
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number of elements in the array: ");
     int n = input.nextInt();
     int array[] = new int[n];
     System.out.println();	
     System.out.print("Please enter the elements in the array: ");
     for(int i=0; i < n; i++) {
       array[i] = input.nextInt();
     }
     reverse(array);
     System.out.println();	
     System.out.print("The elements of the array in reverse order are: ");
     for(int i =0;i < n; i++) {
       System.out.print(array[i] + " ");
     }
  }
}
