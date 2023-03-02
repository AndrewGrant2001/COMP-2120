package Lab7; /******************************************************************************

Complete the findMax() method that returns the largest value in array nums.

Ex: If array nums contains:

2 4 6 8 10 7 5 3
the findMax() method returns:

10
Note: During development, array nums is filled with 10 pseudo-random integers in main() using the fillRandomly() method with a seed value of 7. When submitted, different seed values will be used to generate arrays of different size for the test cases. Refer to the textbook section on Random numbers to learn more about pseudo-random numbers.

*******************************************************************************/
import java.util.*;
public class Lab7_Arrays_FindMaxInArray {
   private int[] nums;
   
   public int findMax() {
      int max = nums[0];
      
      for(int i = 0; i < nums.length; i++) {
         if (max < nums[i])
            max = nums[i];
      }
      
      return max;
   }
   
   public void setNums(int[] nums) {
      this.nums = nums;
   }
   
   public int[] getNums() {
      return nums;
   }
   
   // Fill array nums with pseudo-random integers (0-999) with a seed value
   public void fillRandomly(int seed, int size) {
      Random rand = new Random(seed);
      nums = new int[size];
      for(int i=0; i<nums.length; i++) {
         nums[i] = rand.nextInt(1000);
      }   
   }
   
   public static void main(String[] args) {
      Lab7_Arrays_FindMaxInArray numObject = new Lab7_Arrays_FindMaxInArray();
      int [] nums = {2, 4, 6, 8, 10, 7, 5, 3};
      numObject.setNums(nums);
      System.out.println(Arrays.toString(numObject.getNums()));  // Prints content of array
      System.out.println(numObject.findMax()); // findMax() should return 10
      
      numObject.fillRandomly(7, 10); // Fill nums with 10 pseudo-random nmubers using seed value 7
      System.out.println(Arrays.toString(numObject.getNums()));   // Prints content of array: [236, 164, 485, 44, 380, 254, 968, 649, 850, 534]
      System.out.println(numObject.findMax()); // findMax() should return 968
   }
}

