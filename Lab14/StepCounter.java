/*
14.10 LAB: Step counter - exceptions
A pedometer treats walking 2,000 steps as walking 1 mile. Write a stepsToMiles() method that takes the number of steps as an integer parameter and returns the miles walked as a double. The stepsToMiles() method throws an Exception object with the message "Exception: Negative step count entered." when the number of steps is negative. Complete the main() method that reads the number of steps from a user, calls the stepsToMiles() method, and outputs the returned value from the stepsToMiles() method. Use a try-catch block to catch any Exception object thrown by the stepsToMiles() method and output the exception message.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input of the program is:

5345
the output of the program is:

2.67
Ex: If the input of the program is:

-3850
the output of the program is:

Exception: Negative step count entered.
*/

import java.util.Scanner;

public class LabProgram {
   /* Define your method here */
   
   public static double stepsToMiles(int num) throws Exception {
      if (num < 0) {
         throw new Exception("Exception: Negative step count entered.");
      }
      
      return (num / 2000.0);
      
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      LabProgram lab = new LabProgram();
      
      int input;
      double answer;
      
      try {
         input = scnr.nextInt();
         answer = stepsToMiles(input);
         System.out.printf("%.2f\n", answer);
      }
      catch (Exception e) {
         System.out.println(e.getMessage());  
      }
      
      
      
      
      
   }
}
