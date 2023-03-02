package Lab8; /******************************************************************************

Define a method named coinFlip that takes a Random object and returns "Heads" or "Tails" according to a random value 1 or 0. Assume the value 1 represents "Heads" and 0 represents "Tails". Then, write a main program that reads the desired number of coin flips as an input, calls method coinFlip() repeatedly according to the number of coin flips, and outputs the results. Assume the input is a value greater than 0.

Ex: If the random object is created with a seed value of 2 and the input is:

3
the output is:

Heads
Tails
Heads
Note: For testing purposes, a Random object is created in the main() method using a pseudo-random number generator with a fixed seed value. The program uses a seed value of 2 during development, but when submitted, a different seed value may be used for each test case.

The program must define and call the following method:
public static String coinFlip(Random rand)

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Lab8_Methods_FlippingACoin {
   
   /* Define your method here */
   public static String coinFlip(Random rand) {
       int number = rand.nextInt(2);
       
       if (number == 0)
         return "Tails";
      else if (number == 1)
         return "Heads";
      return "Failed";
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Seed used in develop mode
      // Add more variables as needed
      int input = 0;
      /* Type your code here. */
      input = scnr.nextInt();
      
      for (int i = 0; i < input; i++) {
         System.out.println(coinFlip(rand));         
      }
         
      
   }
}


