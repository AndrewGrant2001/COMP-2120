package Lab10; /******************************************************************************

Given a base Plant class and a derived Flower class, complete main() to create an ArrayList called myGarden. The ArrayList should be able to store objects that belong to the Plant class or the Flower class. Create a method called printArrayList(), that uses the printInfo() methods defined in the respective classes and prints each element in myGarden. The program should read plants or flowers from input (ending with -1), add each Plant or Flower to the myGarden ArrayList, and output each element in myGarden using the printInfo() method.

Ex. If the input is:

plant Spirea 10 
flower Hydrangea 30 false lilac 
flower Rose 6 false white
plant Mint 4
-1
the output is:

Plant Information: 
   Plant name: Spirea
   Cost: 10

Plant Information: 
   Plant name: Hydrangea
   Cost: 30
   Annual: false
   Color of flowers: lilac

Plant Information: 
   Plant name: Rose
   Cost: 6
   Annual: false
   Color of flowers: white

Plant Information: 
   Plant name: Mint
   Cost: 4

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;

public class Lab10_Inheritance_PlantInformation {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects                                                       
   public static void printArrayList (ArrayList<Lab10_Inheritance_Plant> objList) {
      for (int i = 0; i < objList.size(); i++) {
         objList.get(i).printInfo();
         System.out.println();
      }
   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Lab10_Inheritance_Plant> myGarden = new ArrayList<Lab10_Inheritance_Plant>();
      // TODO: Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
      String plantName, plantCost, colorOfFlowers;
      boolean isAnnual;
      
      input = scnr.next();
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
         if (input.equalsIgnoreCase("plant")) {
               Lab10_Inheritance_Plant plant = new Lab10_Inheritance_Plant();
          
              plantName = scnr.next();
              
              plantCost = scnr.next();
             
              plant.setPlantName(plantName);
              plant.setPlantCost(plantCost);
              
              myGarden.add(plant);
            
         }
         else {
        
              Lab10_Inheritance_Flower flower = new Lab10_Inheritance_Flower();
              
              plantName = scnr.next();
              plantCost = scnr.next();
              isAnnual = scnr.nextBoolean();
              colorOfFlowers = scnr.next();
              
              
              flower.setPlantName(plantName);
              flower.setPlantCost(plantCost);
              flower.setPlantType(isAnnual);
              flower.setColorOfFlowers(colorOfFlowers);

              // missing code to add print result as an element 
              myGarden.add(flower);
         }
      
      
         input = scnr.next();
      }
      
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}

