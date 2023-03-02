package Lab7;

import java.util.*;

public class Lab7_Arrays_GVCoin {
    
   // true for heads, false for tails
   private boolean isHeads;
   private int flips, heads;
   private Random r;

   public Lab7_Arrays_GVCoin() {
     r = new Random();
     heads = 0;
     flips = 0;
     isHeads = true;     
   }

   public void flip() {
     isHeads = r.nextBoolean();  // Flip the coin by randomly choosing true / false
     flips++;  // Increment flip count
     if(isHeads){
         heads++; // Increment heads count if current flip results in heads
     }
   }
    
   public boolean isHeads() {
     return isHeads; // Return true if coin is currently heads
   }    

   public String toString() {
     String str;
     str = "Flips: " + flips + " Heads: " + heads + " isHeads: " + isHeads;
     return str;  // Return String representation of important values
   }    
   
   public int numFlips() {
     return flips;   // Return number of total flips
   }
    
   public int numHeads() {
     return heads;   // Return number of total heads   
   }
    

   public int numTails() {
     return flips - heads; // Return number of total tails   
   }

   public void setToHeads(boolean h) {
     isHeads = h; 
   }

   public Lab7_Arrays_GVCoin(int seed) {  // Create the coin with a random seed
     this();
     r = new Random(seed);
   }    
}