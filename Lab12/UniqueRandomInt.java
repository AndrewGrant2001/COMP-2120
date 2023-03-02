/*
12.11 LAB: Unique random integers (HashSet)
Given integer inputs howMany and maxNum, generate an array of howMany unique random integers from 0 to maxNum (exclusive).

The structure of the program is:

main() calls uniqueRandomInts() with arguments howMany and maxNum.
uniqueRandomInts() returns an array of howMany unique random integers.
The required output is already provided in main() and printNums().
Complete uniqueRandomInts(), which generates random integers until howMany unique integers have been collected in array nums.

Hint: If a generated number is new, add the number to the array nums and the set alreadySeen. If the number has been seen before, increment the static variable retries and generate another random integer.

Note: For testing purposes, a random number generator object is created with a fixed seed value (29) in uniqueRandomInts(). Refer to the textbook section on Random numbers to learn more about pseudo-random numbers.

Ex: When the input is:

5 8
the output is

5 0 1 7 3   [3 retries]
*/

import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;

public class UniqueRandomInt {

   // Print the numbers in array separated by a space
   public static void printNums(int[] nums) {
      for (int i = 0; i < nums.length; ++i) {
         System.out.printf("%d ", nums[i]);
      }
   }

   // Used in uniqueRandomInt(), printed in main()
   public static int retries;

   // Generate howMany unique random ints from 0 to maxNum using randGen
   public static int[] uniqueRandomInts(int howMany, int maxNum) {
      int i = 0;
      int nextRand;
      retries = 0;                                  // Initialize static variable
      Random randGen = new Random(29);              // Random number generator with seed 29

      int[] nums = new int[howMany];
      HashSet<Integer> alreadySeen = new HashSet<Integer>();

      /* Type your code here. */
      while (i < howMany) {
         nextRand = randGen.nextInt(maxNum);
         if(alreadySeen.contains(nextRand)) {
            retries++;   
         }
         else {
              alreadySeen.add(nextRand);
              nums[i] = nextRand;
              i++;
         }
         
      }
      

      return nums;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int howMany = scnr.nextInt();
      int maxNum = scnr.nextInt();
 
      int[] uniqueInts = uniqueRandomInts(howMany, maxNum);
      printNums(uniqueInts);
      System.out.printf("  [%d retries]\n", retries); // Print static variable here
   }
}
