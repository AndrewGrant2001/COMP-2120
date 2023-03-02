package Lab6; /******************************************************************************

Complete a program that creates an object of the Count class, takes three integers as input: low, high, and x, and then calls the countMultiples() method. The countMultiples() method then returns the number of multiples of x between low and high inclusively.

Ex: If the input is:

1 10 2
countMutiples() returns and the program output is:

5
Hint: Use the % operator to determine if a number is a multiple of x. Use a for loop to test each number between low and high.

Note: Your program must define the method:
public int countMultiples(int low, int high, int x)

*******************************************************************************/
import java.util.Scanner;

public class Lab6_Loops_CountMultiples {
   
   public int countMultiples(int low, int high, int x) {
       int check, count = 0;
       
       /* Type your code here. */
       for (int i = low; i <= high; i++) {
         check = i % x;
          
         if (check == 0)
            count++;
          
       }
      return count;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      /* Type your code here. */
      int num1 = scnr.nextInt();
      int num2 = scnr.nextInt();
      int num3 = scnr.nextInt();

      Lab6_Loops_CountMultiples test = new Lab6_Loops_CountMultiples();
   
      int value = test.countMultiples(num1, num2, num3);

      System.out.println(value);
   }
}


