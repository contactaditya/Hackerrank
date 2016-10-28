import java.util.Arrays;
import java.util.Scanner;

public class DPCoinChange {
 
 public static long makeChange(int[] coins, int money) {
  int n = coins.length;	  
		
  long[] table = new long[money + 1];  
	  
  Arrays.fill(table, 0);
  
  table[0] = 1;
	  	  
  // Pick all coins one by one and update the table[] values after the index greater than or equal to the value of the picked coin
		  
  for(int i = 0; i < n; i++) {	  
   for(int j = coins[i]; j <= money; j++) {	   
     table[j] += table[j-coins[i]];
   }
  } 
	  
  return table[money];       
 }
	
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of dollars and the number of different types of coins: ");
  int n = input.nextInt();
  int m = input.nextInt();
  int coins[] = new int[m];
  System.out.println();
  System.out.print("Enter the distinct integers where each integer dollar value of a coin available in an infinite amount: ");
  for(int i = 0; i < m; i++) {
    coins[i] = input.nextInt();
  }
  System.out.println();
  System.out.println("The number of ways we can make change for " + n + " dollars using an infinite supply of our " + m + " types of coin are: " + makeChange(coins, n));
  }
 }
