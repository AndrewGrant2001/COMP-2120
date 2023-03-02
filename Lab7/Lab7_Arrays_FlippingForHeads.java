package Lab7;

/******************************************************************************

Given the GVCoin class, complete the method flipForHeads() in the TossingCoins class that counts and returns the number of flips taken to achieve a desired number of heads. Method flipForHeads() has a GVCoin object and an integer representing the desired number of heads as parameters. Review the definition of "GVCoin.java" by clicking on the orange arrow.

Note: For testing purposes, a GVCoin object is created in the main() method using a pseudo-random number generator with a fixed seed value. The program uses a seed value of 15 during development, but when submitted, a different seed value will be used for each test case. Refer to the textbook section on Random numbers to learn more about pseudo-random numbers.

Ex: If the GVCoin object is created with a seed value of 15 and the desired number of heads is 100, then the method flipForHeads() returns 192 and the program outputs:

Total number of flips for 100 heads: 192

*******************************************************************************/
public class Lab7_Arrays_FlippingForHeads {
   
   public int flipForHeads(Lab7_Arrays_GVCoin coin, int goal) {
      /* Type your code here. */
      int headCount = 0;
      int flips =0;
      
      while (headCount < goal) {
         coin.flip();
         
         headCount = coin.numHeads();
         
         flips++;
         
      }
      return flips;
   }
   
   public static void main(String[] args) {
      Lab7_Arrays_FlippingForHeads game = new Lab7_Arrays_FlippingForHeads();
      Lab7_Arrays_GVCoin coin = new Lab7_Arrays_GVCoin(15); // Create a GVCoin object with seed value 15
      int numHeads = 100;   // Desire 100 heads
      int totalFlips;
      
      totalFlips = game.flipForHeads(coin, numHeads);
      System.out.println("Total number of flips for 100 heads: " + totalFlips);
   }
}
