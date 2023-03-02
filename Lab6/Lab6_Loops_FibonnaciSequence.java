package Lab6; /******************************************************************************

The Fibonacci sequence begins with 0 and then 1 follows. All subsequent values are the sum of the previous two, for example: 0, 1, 1, 2, 3, 5, 8, 13. Complete the fibonacci() method, which has an index, n, as parameter and returns the nth value in the sequence. Any negative index values should return -1.

Ex: If the input is:

7
the output is:

fibonacci(7) is 13
Note: Use a for loop and DO NOT use recursion.

*******************************************************************************/
import java.util.Scanner;

public class Lab6_Loops_FibonnaciSequence {
   
   public int fibonacci(int n) {
      int num1 = 1, num2 = 1, total = 0;
      
   if (n == 1)
      return 1; 
   else if (n == 2)
      return 1;
   else if (n > 2) {
      
      for(int i = 3; i <= n; i++) {
         total = num1 + num2;
         num1 = num2;
         num2 = total;
      }
      return total;
   }
   else if (n == 0)
      return 0;
   else 
      return -1;
}
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Lab6_Loops_FibonnaciSequence program = new Lab6_Loops_FibonnaciSequence();
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + program.fibonacci(startNum));
   }
}

