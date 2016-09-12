import java.util.Scanner;

public class TimeConversion {

 public static void main(String[] args) {  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the time in AM/PM format: ");
  String inputTime = input.next();
  String [] timeArray = inputTime.split(":");
  String hours = timeArray[0];
  String minutes = timeArray[1];
  String seconds = timeArray[2].substring(0, 2);
    
 if(timeArray[2].substring(2,4).equalsIgnoreCase("PM")) {
   if (Integer.parseInt(hours) < 12) {
    int tempHours = Integer.parseInt(hours);
    tempHours += 12;
    hours = Integer.toString(tempHours);
   }     
 }
    
 if(timeArray[2].substring(2,4).equalsIgnoreCase("AM")) {
   if (Integer.parseInt(hours) == 12) {
     hours = "00";
   }       
 }
 System.out.println();
 System.out.println("The time in 24-hour format is: " + hours + ":" + minutes + ":" + seconds);
 }
}