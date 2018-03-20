import java.util.Scanner;

 public class AngryProfessor {

    public static void main(String[] args) {  
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of cases: ");
      int numberOfCases = input.nextInt(); 
      for(int i=0;i<numberOfCases;i++) {  
        System.out.println();	
        System.out.print("Enter the number of students and the cancellation threshold: ");	  
        int numberOfStudents = input.nextInt();
        int[] values = new int[numberOfStudents];  
        int cancellationThreshold = input.nextInt();
        int count = 0;
        System.out.println();	
        System.out.print("Enter the arrival time for each student: ");	     
        for(int j=0;j<numberOfStudents;j++) {
          values[j]=input.nextInt(); 
          if(values[j] <= 0) {
	    count++;
	  }  
        }
        if(count >= cancellationThreshold) {
	  System.out.println();	  
	  System.out.println("NO");  
        }   
        else {
	  System.out.println();	
	  System.out.println("YES");    
        }  
      }
    }
 }    
