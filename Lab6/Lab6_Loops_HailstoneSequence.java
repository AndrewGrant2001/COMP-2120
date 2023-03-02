package Lab6; /******************************************************************************

Given a positive integer num, the following rules will always create a sequence that ends with 1, called the hailstone sequence:

If num is even, divide it by 2
If num is odd, multiply it by 3 and add 1 (i.e. 3*num +1)
Continue until num is 1
Write a method, hailstone(), that takes in a positive integer as a parameter and prints the hailstone sequence starting with that integer. Format the output so that ten integers, each separated by a tab character (\t), are printed per line. Assume the input to the program is always positive.

The output format can be achieved as follows:
System.out.print(num + "\t");

Ex: If the program input is:

25
the output of method hailstone() is:

25   76   38   19   58   29   88   44   22   11 
34   17   52   26   13   40   20   10   5    16 
8    4    2    1
Note: Your program must define the method:
public int hailstone(int num)

*******************************************************************************/
import java.util.Scanner;

public class Lab6_Loops_HailstoneSequence {

   /* Type your code here. */
   public void hailstone (int number) {
      
      if (number != 1)
            System.out.print(number + "\t");
         else
            System.out.println(number);

      int numCount = 1;
      
      while (number != 1) {
         numCount++;
         
         if(number % 2 == 0)
            number = number / 2;
         else
            number = 3 * number + 1;
         
         if (number != 1)
            System.out.print(number + "\t");
         else
            System.out.println(number);
         
         if(numCount % 10 == 0 && number != 1)
            System.out.println("");
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Lab6_Loops_HailstoneSequence labObject = new Lab6_Loops_HailstoneSequence();
      int num;
      
      num = scnr.nextInt();
      labObject.hailstone(num); // Call hailstone() to print out the hailstone sequence.
   }
}

