/*
13.9 LAB: Parsing food data
Given a text file containing the availability of food items, write a program that reads the information from the text file and outputs the available food items. The program first reads the name of the text file from the user. The program then reads the text file, stores the information into four separate arrays, and outputs the available food items in the following format: name (category) -- description

Assume the text file contains the category, name, description, and availability of at least one food item, separated by a tab character.

Ex: If the input of the program is:

food.txt
and the contents of food.txt are:

Sandwiches    Ham sandwich    Classic ham sandwich    Available
Sandwiches    Chicken salad sandwich  Chicken salad sandwich  Not available
Sandwiches    Cheeseburger    Classic cheeseburger    Not available
Salads    Caesar salad    Chunks of romaine heart lettuce dressed with lemon juice    Available
Salads    Asian salad Mixed greens with ginger dressing, sprinkled with sesame    Not available
Drinks    Water   16oz bottled water  Available
Drinks    Coca-Cola   16oz Coca-Cola  Not available
Mexican food    Chicken tacos   Grilled chicken breast in freshly made tortillas    Not available
Mexican food    Beef tacos  Ground beef in freshly made tortillas   Available
Vegetarian    Avocado sandwich    Sliced avocado with fruity spread   Not available
the output of the program is:

Ham sandwich (Sandwiches) -- Classic ham sandwich
Caesar salad (Salads) -- Chunks of romaine heart lettuce dressed with lemon juice
Water (Drinks) -- 16oz bottled water
Beef tacos (Mexican food) -- Ground beef in freshly made tortillas
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;

public class FoodParser {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      String[] Name1 = new String[50];
      String[] Name2 = new String[50];
      String[] Name3 = new String[50];
      String[] Name4 = new String[50];
      
  
      String fileName = scnr.next();
      
      /* Type your code here. */
      FileInputStream fileByteStream = new FileInputStream(fileName);
      Scanner inFS = new Scanner(fileByteStream);
      
      inFS.useDelimiter("\t");
      
      int i = 0;
      
      for (int j = 0; j < 50; j++) {
         Name4[j] = "NULL";
      }
      
      while (inFS.hasNext()) {
         inFS.useDelimiter("\t");
         Name1[i] = inFS.next();
         Name2[i] = inFS.next();
         Name3[i] = inFS.next();
         inFS.useDelimiter("\n");
         Name4[i] = inFS.nextLine();
         i++;
         if (i > 49)
            break;
      }
      
      //name (category) -- description
      for (int j = 0; j < 50; j++) {
         if (Name4[j].equals("\tAvailable")){
            System.out.println(Name2[j] + " (" + Name1[j] + ") -- " + Name3[j]);  
         }
      }
      fileByteStream.close();
      
   }
}
