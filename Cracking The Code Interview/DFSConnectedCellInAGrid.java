import java.io.*;
import java.util.*;

public class DFSConnectedCellInAGrid {

 /** Use DFS to return a count of the number of cells in the region connected to [x][y]. **/
 public static int getRegionSize(int matrix[][], int row, int column) {
  if (row < 0 || column < 0 || row >= matrix.length || column >= matrix[row].length) {
    return 0;
  }
        
  if(matrix[row][column] == 0) {
    return 0;
  }
        
  matrix[row][column] = 0;
  int size = 1;
        
  for (int r = row - 1; r <= row + 1; r++) {
   for (int c = column - 1; c <= column + 1; c++) {
    if(r != row || c!= column) {
      size += getRegionSize(matrix, r, c);
    }
   }
  }

 return size;
 }
    
 /** Find the largest region in the matrix. **/
 public static int getBiggestRegion(int matrix[][]) {
  // Stores size of current largest region
  int maxRegion = 0;
        
  for (int row = 0; row < matrix.length; row++) {
   for (int column = 0; column < matrix[row].length; column++) {
                
  // If the current region is larger than any previously checked region, set new maxRegion
    if(matrix[row][column] == 1) {
     int size = getRegionSize(matrix, row, column);
     maxRegion = Math.max(size, maxRegion);
    }
   }
  }
        
 return maxRegion;
 }

 /** Problem Setup **/
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("Enter the number of rows in the matrix: ");
  int n = scanner.nextInt();
  System.out.println();
  System.out.print("Enter the number of columns in the matrix: ");
  int m = scanner.nextInt();
  int[][] matrix = new int[n][m];
  
  System.out.println();
  System.out.println("Enter the actual values in the matrix: ");

  for (int i = 0; i < n; i++) {
   for (int j = 0; j < m; j++) {          
    matrix[i][j] = scanner.nextInt();
   }
  }
  scanner.close();
  
  System.out.println();
  System.out.println("The number of cells in the largest region in the given matrix are: " + getBiggestRegion(matrix));
        
  }
}

