package Lab6; /******************************************************************************

6.17 LAB: What is the dice total? (EO)
Given a GVDie object and an integer that represents the number of rolls as parameters complete method rollSpecificTimes() in LibrarySystem.Main class. The method rollSpecificTimes() should calculate and return the running sum of rolling the die the given number of times. Review the definition of "GVDie.java" by clicking on the orange arrow.

Note: For testing purposes, a GVDie object is created in the main() method using a pseudo-random number generator with a fixed seed value. The program uses a seed value of 15 during development, but when submitted, a different seed value will be used for each test case. Refer to the textbook section on Random numbers to learn more about pseudo-random numbers.

Ex: If the GVDie objects are created with a seed value of 15 and the input of the program is:

100
the output is:

100 rolls return a total of 334.

*******************************************************************************/
import java.util.Scanner;

public class Lab6_Loops_WhatIsDiceTotal {
   public int rollSpecificTimes(Lab6_Loops_GVDie die, int rolls){
      int total = 0, num = 0;
      
      
      /* Type your code here. */    
      for (int i = 1; i <= rolls; i++) {
         die.roll();
         num = die.getValue();
         
         total += num;  
      }
      
      return total;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Lab6_Loops_WhatIsDiceTotal game = new Lab6_Loops_WhatIsDiceTotal();
      Lab6_Loops_GVDie die = new Lab6_Loops_GVDie();   // Create a GVDie object
      die.setSeed(15);   // Set the GVDie object with seed value 15
      int rolls;
      int total;
      int repeats;
      
      rolls = scnr.nextInt();
      repeats = 100;
      total = game.rollSpecificTimes(die, repeats);   // Call rollSpecificTimes() and return the total.
      System.out.println(rolls + " rolls return a total of " + total + ".");
   }
}

