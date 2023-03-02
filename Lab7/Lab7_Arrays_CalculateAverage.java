package Lab7;

/******************************************************************************

Complete the calcAverage() method that has an integer array parameter and returns the average value of the elements in the array as a double.

Ex: If the input array is:

1 2 3 4 5
then the returned average will be:

3.0

*******************************************************************************/

public class Lab7_Arrays_CalculateAverage {
   
   // calcAverage() takes in an int array and returns the average value of elements in the array as a double.
   public double calcAverage(int[] nums) {
      /* Type your code here. */ 
      double avg;
      int total = 0;
      
      for(int i = 0; i < nums.length; i++) {
         total = total + nums[i];
      }
      
      avg = (double)total / nums.length;
      return avg;
   }
   
   public static void main(String[] args) {
      Lab7_Arrays_CalculateAverage numObject = new Lab7_Arrays_CalculateAverage();
      int [] nums = {1,2,3,4,5};
      System.out.println(numObject.calcAverage(nums)); 
   }
}

