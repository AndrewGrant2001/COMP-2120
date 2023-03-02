package Lab5;

/******************************************************************************

Write a method checkCharacter() which has 2 parameters: A String, and a specified index (an int). Method checkCharacter() checks the character at the specified index of the String parameter, and returns a String based on the type of character at that location indicating if the character is a letter, digit, whitespace, or unknown character.

Ex: The method calls below with the given arguments will return the following Strings:

checkCharacter("happy birthday", 2) returns "Character 'p' is a letter"
checkCharacter("happy birthday", 5) returns "Character ' ' is a white space"
checkCharacter("happy birthday 2 you", 15) returns "Character '2' is a digit"
checkCharacter("happy birthday!", 14) returns "Character '!' is unknown"

Your program must define the method:
public String checkCharacter(String word, int index)

*******************************************************************************/

public class Lab5_Branches_FunWithCharacters {

   /* Type your code here */
   public String checkCharacter(String word, int index) {
      char character = word.charAt(index); 
      
      if (Character.isLetter(character)) {
         return "Character '" + character + "' is a letter";
      }
      if (Character.isWhitespace(character)) {
         return "Character '" + character + "' is a white space";
      }
      if (Character.isDigit(character)) {
         return "Character '" + character + "' is a digit";
      }
         
      return "Character '" + character + "' is unknown";
   }
   
   public static void main(String[] args) {
      
      Lab5_Branches_FunWithCharacters labObject = new Lab5_Branches_FunWithCharacters();
      String word = "happy birthday"; // Set string
      int index = 2; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
      
      index = 5; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
      
      word = "happy birthday 2 you"; 
      index = 15; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
      
      word = "happy birthday!"; 
      index = 14; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
   }
}


