package Lab9; /******************************************************************************

Write a toString() method for the Number class, which returns a String representation of a Number object. The String should be in the format "The value is yourNum", where yourNum is the value of the integer instance field from the Number class

Ex: If the input is:

723
then the output is:

The value is 723

*******************************************************************************/
import java.util.Scanner;

public class Lab9_Classes_toStringMethod {
   private int num;
   
   public Lab9_Classes_toStringMethod(int n) {
      num = n;
   }

   public String toString() {
      /* Type your code here */
      return "The value is " + Integer.toString(num);
   }
   
   public int getNum() {
      return num;
   }
   
   public void setNum(int n) {
      num = n;
   }

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int inputNum = scnr.nextInt();
      Lab9_Classes_toStringMethod yourNum = new Lab9_Classes_toStringMethod(inputNum);
      System.out.print(yourNum);
   }
}

