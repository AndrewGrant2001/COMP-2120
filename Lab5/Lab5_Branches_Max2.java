package Lab5; /******************************************************************************

Write a method, findMax(), that takes in two integers and returns the largest value.

Ex: If the program input is:

4 2
the method findMax() returns:

4
Note: Your program must define the method:
public int findMax(int num1, int num2)

*******************************************************************************/
import java.util.Scanner;

public class Lab5_Branches_Max2 {
   
   /* Type your code here. */
   public int findMax(int num1, int num2) {
      int max = num1;  
      
      if (num2 > num1)
         max = num2;
   
      return max;
   }
   
   public static void main(String args[]) {
      Lab5_Branches_Max2 maxObject = new Lab5_Branches_Max2();
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int max;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      max = maxObject.findMax(num1, num2);
      System.out.println("Max: " + max);
   }
}


