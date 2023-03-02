package Lab5; /******************************************************************************

Write a method, countEvens(), that has four integer parameters, and returns the count of parameters where the value is an even number (i.e. evenly divisible by 2).

Ex: If the four parameters are:

1 22 11 40
the method countEvens() returns:

2
Hint: Use the modulo operator % to determine if each number is even or odd.

Your program must define the method:
public int countEvens(int num1, int num2, int num3, int num4)

*******************************************************************************/
import java.util.Scanner;

public class Lab5_Branches_CountEvens {
   
   /* Type your code here */
   public int countEvens(int num1, int num2, int num3, int num4) {
      int count = 0;
      
      if (num1 % 2 == 0) {
         count++;
      }
      if (num2 % 2 == 0) {
         count++;
      }
      if (num3 % 2 == 0) {
         count++;
      }
      if (num4 % 2 == 0) {
         count++;
      }     
      
      
      return count;  
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Lab5_Branches_CountEvens labObject = new Lab5_Branches_CountEvens();
      
      int num1;
      int num2;
      int num3;
      int num4;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      
		int result = labObject.countEvens(num1, num2, num3, num4);
		System.out.println("Total evens: " + result);
   }
}


