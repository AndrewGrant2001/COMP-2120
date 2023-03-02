package Lab4; /******************************************************************************

Mad Libs are activities that have a person provide various words, which are then used to complete a short story in unexpected (and hopefully funny) ways.

Complete the program to read the needed values from input, that the existing output statement(s) can use to output a short story.

Ex: If the input is:

Eric Chipotle 12 cars
the output is:

Eric went to Chipotle to buy 12 different types of cars.

*******************************************************************************/
import java.util.Scanner; 

public class Lab4_DataTypes_MadLib {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName;
      String genericLocation;
      int wholeNumber;
      String pluralNoun;
   
      /* Type your code here. */
      firstName = scnr.next();
      genericLocation = scnr.next();
      wholeNumber = scnr.nextInt();
      pluralNoun = scnr.next();
   
      System.out.println(firstName + " went to " + genericLocation + " to buy " + wholeNumber + " different types of " + pluralNoun + ".");
   }
}


