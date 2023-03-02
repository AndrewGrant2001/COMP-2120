/*
12.7 LAB: Grocery shopping list (LinkedList)
Given a ListItem class, complete main() using the built-in LinkedList type to create a linked list called shoppingList. The program should read items from input (ending with -1), adding each item to shoppingList, and output each item in shoppingList using the printNodeData() method.

Ex. If the input is:

milk
bread
eggs
waffles
cereal
-1
the output is:

milk
bread
eggs
waffles
cereal
*/

import java.util.Scanner;
import java.util.LinkedList;

public class ShoppingList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // TODO: Declare a LinkedList called shoppingList of type ListItem
      LinkedList<String> shoppingList = new LinkedList<String>();

      String item;
      
      // TODO: Scan inputs (items) and add them to the shoppingList LinkedList
      //       Read inputs until a -1 is input
      item = scnr.nextLine(); 
      while (!item.equals("-1")) {
         shoppingList.add(item);        
         item = scnr.nextLine(); 
      }
      
      for (int i = 0; i < shoppingList.size(); i++) {
          ListItem shoppingList112 = new ListItem(shoppingList.get(i));
          shoppingList112.printNodeData();
      }
      

   }
}