package Lab7;

/******************************************************************************

Write the inOrder() method, which has an array of integers as a parameter, and returns true if the numbers are sorted (in order from low to high) or false otherwise. The program outputs "In order" if the array is sorted, or "Not in order" if the array is not sorted.

Ex: If the array passed to the inOrder() method is [5, 6, 7, 8, 3], then the method returns false and the program outputs:

Not in order
Ex: If the array passed to the inOrder() method is [5, 6, 7, 8 , 10], then the method returns true and the program outputs:

In order

*******************************************************************************/
public class Lab7_Arrays_CheckIfArraySorted {
   
   public boolean inOrder(int [] nums) {
      /* Type your code here. */
      boolean var1 = true;
      
      for (int i = 1; i < nums.length; i++) {
         if (nums[i] < nums[i-1])
            var1 = false;
      }
      
      return var1;
   }
   
   public static void main(String[] args) {
      Lab7_Arrays_CheckIfArraySorted s = new Lab7_Arrays_CheckIfArraySorted();
      
      // Test out-of-order example.
      int [] nums1 = {5, 6, 7, 8, 3};
      
      if(s.inOrder(nums1)){
         System.out.println("In order");
      }else{
         System.out.println("Not in order");
      }
      
      // Test in-order example.
      int [] nums2 = {5, 6, 7, 8, 10};
      
      if(s.inOrder(nums2)){
         System.out.println("In order");
      }else{
         System.out.println("Not in order");
      }
   }
}


