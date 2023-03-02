package Lab11; /******************************************************************************

Complete Pair.java by defining the following constructor and methods:

public Pair(TheType aVal, TheType bVal)
Initialize the public fields firstVal to aVal and secondVal to bVal
String toString()
Return a string representation of the pair in the format "[firstVal, secondVal]"
int compareTo(Pair otherPair)
Return -1, 0, or 1 according to whether the Pair is less than, equal to, or greater than otherPair
Precedence of comparisons: firstVal, then secondVal
char comparisonSymbol(Pair otherPair)
Return a character: '<', '=', or '>' representing the result returned by compareTo()
Complete LabProgram.java:

Define readIntegerPair(), readDoublePair(), and readWordPair()
Take a scanner object as a parameter and return a Pair object of a specific data type
Read two values, separated by a space, from input and create a Pair object with the input values in the same order
Complete the output section of main().
For each data type, output the two Pair objects separated by the character returned by comparisonSymbol()
Note: main() calls each read method twice to create two Pair objects of the corresponding type.

Ex: If the input for 2 Pair objects of Integer is:

4 6 3 5
the first Pair object contains [4, 6], and the second Pair object contains [3, 5].

Ex: If the input of the program is:

4 6 3 5
4.3 2.1 4.3 2.1
one two three four
the output is:

[4, 6] > [3, 5]
[4.3, 2.1] = [4.3, 2.1]
[one, two] < [three, four]

*******************************************************************************/
import java.util.Scanner;

public class Lab11_Generics_Pairs {
   public static Lab11_Generics_Pair<Integer> readIntegerPair(Scanner scnr) {
      /* Type your code here. */
      
      Lab11_Generics_Pair<Integer> input = new Lab11_Generics_Pair<Integer>(scnr.nextInt(), scnr.nextInt());
      return input;      
   }

   public static Lab11_Generics_Pair<Double> readDoublePair(Scanner scnr) {
      /* Type your code here. */
      Lab11_Generics_Pair<Double> input = new Lab11_Generics_Pair<Double>(scnr.nextDouble(), scnr.nextDouble());
      return input;
   }

   public static Lab11_Generics_Pair<String> readWordPair(Scanner scnr) {
      /* Type your code here. */
      /* Type your code here. */
      Lab11_Generics_Pair<String> input = new Lab11_Generics_Pair<String>(scnr.next(), scnr.next());
      return input;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Lab11_Generics_Pair<Integer> integerPair1 = readIntegerPair(scnr);
      Lab11_Generics_Pair<Integer> integerPair2 = readIntegerPair(scnr);

      Lab11_Generics_Pair<Double> doublePair1 = readDoublePair(scnr);
      Lab11_Generics_Pair<Double> doublePair2 = readDoublePair(scnr);

      Lab11_Generics_Pair<String> wordPair1 = readWordPair(scnr);
      Lab11_Generics_Pair<String> wordPair2 = readWordPair(scnr);

      /* Type the code for output here. */
      System.out.println(integerPair1.toString() + " " + integerPair1.comparisonSymbol(integerPair2) +  " " + integerPair2.toString());
       System.out.println(doublePair1.toString() + " " + doublePair1.comparisonSymbol(doublePair2) +  " " + doublePair2.toString());
       System.out.println(wordPair1.toString() + " " + wordPair1.comparisonSymbol(wordPair2) +  " " + wordPair2.toString());
      
      

}
}
