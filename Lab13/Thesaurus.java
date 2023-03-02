/*
13.10 LAB: Thesaurus
Given a set of text files containing synonyms for different words, complete the main program to output the synonyms for a specific word. Each text file contains synonyms for the word specified in the file’s name, and each row within the file lists the word’s synonyms that begin with the same letter, separated by a space. The program reads a word and a letter from the user and opens the text file associated with the input word. The program then stores the contents of the text file into a two-dimensional array predefined in the program. Finally the program searches the array and outputs all the synonyms that begin with the input letter, one synonym per line, or a message if no synonyms that begin with the input letter are found.

Hints: Use ASCII values to map the row index of the array to the first letter of a word when storing the synonyms into the array. Ex: Index 0 to an 'a', index 25 to a 'z'. Assume all letters are in lowercase.

Ex: If the input of the program is:

educate c
the program opens the file educate.txt, which contains:

brainwash brief
civilize coach cultivate
develop discipline drill
edify enlighten exercise explain
foster
improve indoctrinate inform instruct
mature
nurture
rear
school
train tutor
then the program outputs:

civilize
coach
cultivate
Ex: If the input of the program is:

educate a
then the program outputs:

No synonyms for educate begin with a.
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      int NUM_CHARACTERS = 26;      // Maximum number of letters
      int MAX_WORDS = 10;           // Maximum number of synonyms per starting letter

      String[][] synonyms = new String[NUM_CHARACTERS][MAX_WORDS];  // Declare 2D array for all synonyms
      String[] words = new String[MAX_WORDS]; // The words of each input line
   

      /* Type your code here. */
      String fileName;
      char letter;
      int letterVal = 0;
      fileName = scnr.next();
      letter = (scnr.next().charAt(0));
      
      if(letter == 'a')
            letterVal = 0;
         if(letter == 'b')
            letterVal = 1;
         if(letter == 'c')
            letterVal = 2;
         if(letter == 'd')
            letterVal = 3;
         if(letter == 'e')
            letterVal = 4;
         if(letter == 'f')
            letterVal = 5;
         if(letter == 'g')
            letterVal = 6;
         if(letter == 'h')
            letterVal = 7;
         if(letter == 'i')
            letterVal = 8;
         if(letter == 'j')
            letterVal = 9;
         if(letter == 'k')
            letterVal = 10;
         if(letter == 'l')
            letterVal = 11;
         if(letter == 'm')
            letterVal = 12;
         if(letter == 'n')
            letterVal = 13;
         if(letter == 'o')
            letterVal = 14;
         if(letter == 'p')
            letterVal = 15;
         if(letter == 'q')
            letterVal = 16;
         if(letter == 'r')
            letterVal = 17;
         if(letter == 's')
            letterVal = 18;
         if(letter == 't')
            letterVal = 19;
         if(letter == 'u')
            letterVal = 20;
         if(letter == 'v')
            letterVal = 21;
         if(letter == 'w')
            letterVal = 22;
         if(letter == 'x')
            letterVal = 23;
         if(letter == 'y')
            letterVal = 24;
         if(letter == 'z')
            letterVal = 25;
      
      /* Type your code here. */
      FileInputStream fileByteStream = new FileInputStream(fileName + ".txt");
      
      String word;
      int charNum = 0;
      
      for (int i = 0; i < 20; i++) {
         synonyms[i][0] = "NULL";
      }
      
      
      Scanner inFS = new Scanner(fileByteStream);
      
      while (inFS.hasNext()) {
         word = inFS.nextLine();
 
         if(word.charAt(0) == 'a')
            charNum = 0;
         if(word.charAt(0) == 'b')
            charNum = 1;
         if(word.charAt(0) == 'c')
            charNum = 2;
         if(word.charAt(0) == 'd')
            charNum = 3;
         if(word.charAt(0) == 'e')
            charNum = 4;
         if(word.charAt(0) == 'f')
            charNum = 5;
         if(word.charAt(0) == 'g')
            charNum = 6;
         if(word.charAt(0) == 'h')
            charNum = 7;
         if(word.charAt(0) == 'i')
            charNum = 8;
         if(word.charAt(0) == 'j')
            charNum = 9;
         if(word.charAt(0) == 'k')
            charNum = 10;
         if(word.charAt(0) == 'l')
            charNum = 11;
         if(word.charAt(0) == 'm')
            charNum = 12;
         if(word.charAt(0) == 'n')
            charNum = 13;
         if(word.charAt(0) == 'o')
            charNum = 14;
         if(word.charAt(0) == 'p')
            charNum = 15;
         if(word.charAt(0) == 'q')
            charNum = 16;
         if(word.charAt(0) == 'r')
            charNum = 17;
         if(word.charAt(0) == 's')
            charNum = 18;
         if(word.charAt(0) == 't')
            charNum = 19;
         if(word.charAt(0) == 'u')
            charNum = 20;
         if(word.charAt(0) == 'v')
            charNum = 21;
         if(word.charAt(0) == 'w')
            charNum = 22;
         if(word.charAt(0) == 'x')
            charNum = 23;
         if(word.charAt(0) == 'y')
            charNum = 24;
         if(word.charAt(0) == 'z')
            charNum = 25;
         
         
         synonyms[charNum][0] = word;
      }
      
      if (synonyms[letterVal][0].equals("NULL")) {
         System.out.println("No synonyms for " + fileName + " begin with " + letter + ".");
      }
      else {
         synonyms[letterVal][0] = synonyms[letterVal][0].replace(" ", "\n");
         System.out.println(synonyms[letterVal][0]);
      }

      
      fileByteStream.close(); 
      
      
   }
}
