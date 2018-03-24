import java.util.Scanner;

public class DiagonalDifference {

  public static void main(String[] args) {  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns in the square matrix: ");
    int n = input.nextInt();
    int a[][] = new int[n][n];
    int diagonal1 = 0;
    int diagonal2 = 0;
    System.out.println();
    System.out.println("Enter the actual values of the elements in the square matrix: ");
    for(int i=0; i < n; i++){
      for(int j=0; j < n; j++){
        a[i][j] = input.nextInt();  
     
        if(i==j) {
          diagonal1 += a[i][i];
        }
            
        if(j==(n-i-1)) {
          diagonal2 += a[i][j];                  
        }     
      }
    }
  
    System.out.println();
    System.out.println("The absolute difference between the sums of it's diagonals is: " + Math.abs(diagonal1 - diagonal2));          
  }
}
