package Lab5; /******************************************************************************

Golf scores record the number of strokes used to get the ball in the hole. The expected number of strokes varies from hole to hole and is called par (i.e. 3, 4, or 5). Each score's name is based on the actual strokes taken compared to par:

"Eagle": number of strokes is two less than par
"Birdie": number of strokes is one less than par
"Par": number of strokes equals par
"Bogey": number of strokes is one more than par
Given main() and two input integers that represent par and the number of strokes used, write a method, golfScore(), that returns the appropriate score name (a String). Return "Error" if par is not 3, 4, or 5.

Ex: If the program input is:

4 3
the method golfScore() returns and then the program outputs:

Birdie
Note: Your program must define the method:
public String golfScore(int par, int strokes)

*******************************************************************************/
import java.util.Scanner;

public class Lab5_Branches_GolfScores {
   
   /* Type your code here */
   public String golfScore(int par, int strokes) { 
      int coursePar = par;
      int playerStrokes = strokes;
      int diff = playerStrokes - coursePar;
      
      if (coursePar != 3 && coursePar != 4 && coursePar != 5) {
         return "Error"; }
      else if (diff == -2) {
         return "Eagle"; }
      else if (diff == -1) {
         return "Birdie"; }
      else if (diff == 0) {
         return "Par"; }
      else if (diff == 1) {
         return "Bogey"; }
      
      return "Error";
      
   }
   
   public static void main(String[] args) {
      Lab5_Branches_GolfScores score = new Lab5_Branches_GolfScores();
      Scanner scnr = new Scanner(System.in);
      int par;
      int strokes;
      String name;
      
      par = scnr.nextInt();
      strokes = scnr.nextInt();
      
      name = score.golfScore(par, strokes);
      
      System.out.println(name);
   }
}


