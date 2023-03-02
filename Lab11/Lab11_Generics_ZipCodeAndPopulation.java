package Lab11; /******************************************************************************

Define a class StatePair with two generic types (Type1 and Type2), a constructor, mutators, accessors, and a printInfo() method. Three ArrayLists have been pre-filled with StatePair data in main():

ArrayList<StatePair<Integer, String>> zipCodeState: Contains ZIP code/state abbreviation pairs
ArrayList<StatePair<String, String>> abbrevState: Contains state abbreviation/state name pairs
ArrayList<StatePair<String, Integer>> statePopulation: Contains state name/population pairs
Complete main() to use an input ZIP code to retrieve the correct state abbreviation from the ArrayList zipCodeState. Then use the state abbreviation to retrieve the state name from the ArrayList abbrevState. Lastly, use the state name to retrieve the correct state name/population pair from the ArrayList statePopulation and output the pair.

Ex: If the input is:

21044
the output is:

Maryland: 6079602

*******************************************************************************/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Lab11_Generics_ZipCodeAndPopulation {

   public static ArrayList<Lab11_Generics_StatePair<Integer, String>> fillArray1(ArrayList<Lab11_Generics_StatePair<Integer, String>> statePairs,
                                                                                 Scanner inFS) {
      Lab11_Generics_StatePair<Integer, String> pair;
      int intValue;
      String stringValue;

      while (inFS.hasNextLine()) {
         intValue = inFS.nextInt();
         stringValue = inFS.next();
         pair = new Lab11_Generics_StatePair<Integer, String>(intValue, stringValue);
         statePairs.add(pair);
      }    
      return statePairs;
   }
   
   public static ArrayList<Lab11_Generics_StatePair<String, String>> fillArray2(ArrayList<Lab11_Generics_StatePair<String, String>> statePairs,
                                                                                Scanner inFS) {
      Lab11_Generics_StatePair<String, String> pair;
      String stringValue1;
      String stringValue2;

      while (inFS.hasNextLine()) {
         stringValue1 = inFS.next();
         inFS.nextLine();
         stringValue2 = inFS.nextLine();
         pair = new Lab11_Generics_StatePair<String, String>(stringValue1, stringValue2);
         statePairs.add(pair);
      }
      return statePairs;
   }
   
   public static ArrayList<Lab11_Generics_StatePair<String, Integer>> fillArray3(ArrayList<Lab11_Generics_StatePair<String, Integer>> statePairs,
                                                                                 Scanner inFS) {
      Lab11_Generics_StatePair<String, Integer> pair;
      String stringValue;
      int intValue;

      while (inFS.hasNextLine()) {
         stringValue = inFS.nextLine();
         intValue = inFS.nextInt();
         inFS.nextLine();
         pair = new Lab11_Generics_StatePair<String, Integer>(stringValue, intValue);
         statePairs.add(pair);
      } 
      return statePairs;
   }
   
   
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      int myZipCode;
      int i;
      
      // ZIP code - state abbrev. pairs
      ArrayList<Lab11_Generics_StatePair<Integer, String>> zipCodeState = new ArrayList<Lab11_Generics_StatePair<Integer, String>>();
      
      // state abbrev. - state name pairs
      ArrayList<Lab11_Generics_StatePair<String, String>> abbrevState = new ArrayList<Lab11_Generics_StatePair<String, String>>();
      
      // state name - population pairs
      ArrayList<Lab11_Generics_StatePair<String, Integer>> statePopulation = new ArrayList<Lab11_Generics_StatePair<String, Integer>>();
      
      // Fill the three ArrayLists
      
      // Try to open zip_code_state.txt file
      fileByteStream = new FileInputStream("zip_code_state.txt");
      inFS = new Scanner(fileByteStream);
      zipCodeState = fillArray1(zipCodeState, inFS);
      fileByteStream.close(); // close() may throw IOException if fails
      
      // Try to open abbreviation_state.txt file
      fileByteStream = new FileInputStream("abbreviation_state.txt");
      inFS = new Scanner(fileByteStream);
      abbrevState = fillArray2(abbrevState, inFS);
      fileByteStream.close();
      
      // Try to open state_population.txt file
      fileByteStream = new FileInputStream("state_population.txt");
      inFS = new Scanner(fileByteStream);
      statePopulation = fillArray3(statePopulation, inFS);
      fileByteStream.close();
      
      // Read in ZIP code from user
      myZipCode = scnr.nextInt();
      String abbrev = "--";
      String name = "--";
        
      //StatePair zipCodeStateT = new StatePair(zipCodeState);
      //StatePair abbrevState = new StatePair(abbrevState);
      //StatePair statePopulationT = new StatePair(statePopulation);
        
      for (i = 0; i < zipCodeState.size(); ++i) {
         // TODO: Using ZIP code, find state abbreviation
         if (zipCodeState.get(i).value1().equals(myZipCode)) {
               abbrev = zipCodeState.get(i).value2();
               break;
         }
      }
      
      for (i = 0; i < abbrevState.size(); ++i) {
         // TODO: Using state abbreviation, find state name
         if (abbrevState.get(i).value1().equals(abbrev)) {
               name = abbrevState.get(i).value2();
               break;
         }
      }
      
      for (i = 0; i < statePopulation.size(); ++i) {
         // TODO: Using state name, find population. Print pair info.
         if (statePopulation.get(i).value1().equals(name)) {
               statePopulation.get(i).printInfo();
               break;
         }
      }
   }
}
