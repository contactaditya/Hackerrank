import java.util.*;

public class DynamicArray {

 public static void main(String[] args) {  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of sequences and the number of queries: ");
  int numberOfSequences = input.nextInt();
  int numberOfQueries = input.nextInt();  
  ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();  
  for(int i=0; i<numberOfSequences;i++) {
	seqList.add(new ArrayList<Integer>()); 
  }
  int lastAns = 0;  
  	     
  for(int i =0; i<numberOfQueries; i++) {
   int typeOfQuery = input.nextInt();
   int x = input.nextInt();
   int y = input.nextInt();         
	 
	List<Integer> sequence = seqList.get((x^lastAns)%numberOfSequences);
	if(typeOfQuery==1) {
	  sequence.add(y);
	}
	else {
	 lastAns = sequence.get(y%(sequence.size()));
	 System.out.println(lastAns);
    }
   }
 }
}