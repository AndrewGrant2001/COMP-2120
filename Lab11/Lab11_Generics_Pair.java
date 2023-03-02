package Lab11;

public class Lab11_Generics_Pair<TheType extends Comparable<TheType>> {
   private TheType firstVal;
   private TheType secondVal;

   /* Type the code for The constructor here. */
   public Lab11_Generics_Pair(TheType aVal, TheType bVal) {
      firstVal = aVal;
      secondVal = bVal;
   }


   public String toString() {
      return "[" + firstVal + ", " + secondVal + "]";
   }

   // Implement Comparable's expected compareTo()
   public int compareTo(Lab11_Generics_Pair<TheType> otherPair) {
      /* Type your code here. */
      int comparisonVal;         // Outcome of comparison
      
      // Compare based on department number first
      comparisonVal = firstVal.compareTo(otherPair.firstVal);
      
      // If in same organization, use name
      if (comparisonVal == 0) {
         comparisonVal = secondVal.compareTo(otherPair.secondVal);
      }
      
      return comparisonVal;
   }

   // Return '<', '=', or '>' according to the ordering of this pair and otherPair
   public char comparisonSymbol(Lab11_Generics_Pair<TheType> otherPair) {
      /* Type your code here. */
      /* Type your code here. */
      int comparisonVal;         // Outcome of comparison
      
      // Compare based on department number first
      comparisonVal = firstVal.compareTo(otherPair.firstVal);
      
      // If in same organization, use name
      if (comparisonVal == 0) {
         comparisonVal = secondVal.compareTo(otherPair.secondVal);
      }
      
      if (comparisonVal == 0) 
         return '=';
      else if (comparisonVal > 0)
         return '>';
      else
         return '<';
      
   }

}
