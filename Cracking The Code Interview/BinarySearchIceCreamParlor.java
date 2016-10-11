import java.io.*;
import java.util.*;

class IceCream implements Comparable{
  int cost;
  int index;

 public IceCream(int cost, int index) {
   this.cost = cost;
   this.index = index;  
 }
   
 @Override
 public int compareTo(Object o) {
  IceCream iceCream = (IceCream)o;
  return this.cost - iceCream.cost;
 }

 @Override
 public boolean equals(Object o) {
  IceCream iceCream = (IceCream)o; 
  return this.cost == iceCream.cost;
 }       
}

public class BinarySearchIceCreamParlor {
	 
 public static int binarySearch(int first, int last, IceCream[] array, int search) {
  while(first <= last) {
   int middle = first + (last-first)/2;
   if(array[middle].cost < search) {
     first = middle + 1;  
   } else if (array[middle].cost > search) {
     last = middle - 1;
   } else {
     return array[middle].index;
   }
  }
 return -1;
 }

 public static void main(String[] args) { 
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of trips to the ice cream parlor: ");
  int t = input.nextInt();
 
  for(int i = 0; i < t; i++) {
   System.out.println();
   System.out.print("Enter the number of dollars they pooled together for ice cream: ");	  
   int m = input.nextInt();
   System.out.println();
   System.out.print("Enter the number of flavors of ice cream: ");	  
   int n = input.nextInt();  
   IceCream[] array = new IceCream[n];
   
   System.out.println();
   System.out.print("Enter the cost of each respective flavor: ");	   
    
  for (int j = 0; j < n; j++) {
    array[j] = new IceCream(input.nextInt(), j + 1);
  }
    
   Arrays.sort(array);
        
   for(int k = 0; k < n - 1 ; k++) {
      
    int search = m - array[k].cost;
      
    if(search >= array[k].cost) {
      int index = binarySearch( k + 1, n - 1, array, search);  
     
      if(index != -1) {
       System.out.println(); 
       System.out.println(Math.min(array[k].index, index) + " " + Math.max(array[k].index, index));
       break;
      }
    }
   } 
  }
 }
}
