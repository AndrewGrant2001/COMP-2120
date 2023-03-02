package Lab9; /******************************************************************************

Complete the swap() method in SwapNumbers.java to exchange the values of the num field of two Number objects, num1 and num2.

Hint: Refer to the given Number class to see the definitions of num field and other methods available.

Ex: If num1 is 19 and num2 is 178, calling swap(num1, num2) will swap the values so that num1 becomes 178 and num2 becomes 19.

*******************************************************************************/
import java.util.Scanner;

public class Lab9_Classes_SwapTwoNumbers {
   
   public void swap(Lab9_Classes_Number num1, Lab9_Classes_Number num2) {
      /* Your code goes here */
      int temp; 
      
      temp = num1.getNum();
      num1.setNum(num2.getNum());
      num2.setNum(temp);
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Lab9_Classes_SwapTwoNumbers program = new Lab9_Classes_SwapTwoNumbers();
      int int1;
      int int2;
      
      int1 = scnr.nextInt();
      int2 = scnr.nextInt();
      
      Lab9_Classes_Number num1 = new Lab9_Classes_Number(int1);
      Lab9_Classes_Number num2 = new Lab9_Classes_Number(int2);
      
      program.swap(num1, num2);
      System.out.println("num1 = " + num1.getNum() + ", num2 = " + num2.getNum());
   }
}
