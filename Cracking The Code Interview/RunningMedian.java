import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {

 public static void addNumbers(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
  if(lowers.size() == 0 || number < lowers.peek()) {
    lowers.add(number);
  }
  else {
    highers.add(number);
  }	 
 }
 
 public static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
   PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
   PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers; 
   
   if(biggerHeap.size() - smallerHeap.size() >= 2) {
       smallerHeap.add(biggerHeap.poll());
   } 
 }
  
 public static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
   PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
   PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers; 
	   
   if(biggerHeap.size() == smallerHeap.size()) {
      return ((double)biggerHeap.peek() + smallerHeap.peek())/2;
   }
   
   else {
      return biggerHeap.peek();  
   }			 
 }
 
 private static class MedianComparator implements Comparator<Integer> {
  public int compare(Integer o1, Integer o2) {
     return o2 - o1;
  }
 }
 
 public static void getMedians(int[] array) {
  PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(10, new MedianComparator());
  PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
  double medians[] = new double[array.length];
   
  for(int i = 0; i < array.length; i++) {
    int number = array[i];
    addNumbers(number, lowers, highers);
    rebalance(lowers, highers);
    medians[i] = getMedian(lowers, highers);  
  }
  
  System.out.println();
  System.out.print("The running median of the array is: ");
  for(int i = 0; i < array.length; i++) {
     System.out.print(medians[i] + " ");   
  }
 } 
  
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter number of elements in the array: ");
  int numbers = input.nextInt();   
  int array[] = new int[numbers];
	    
  System.out.print("\n");
  System.out.print("Please enter the actual values in the array: ");
  for (int i = 0; i < numbers; i++) {
    array[i] = input.nextInt(); 
  }
  
  getMedians(array);
 }
}
