package Lab10; /******************************************************************************

Given main() and the Instrument class, define a derived class, StringInstrument, for string instruments.

Ex. If the input is:

Drums
Zildjian
2015
2500
Guitar
Gibson
2002
1200
6
19
the output is:

Instrument Information: 
   Name: Drums
   Manufacturer: Zildjian
   Year built: 2015
   Cost: 2500
Instrument Information: 
   Name: Guitar
   Manufacturer: Gibson
   Year built: 2002
   Cost: 1200
   Number of strings: 6
   Number of frets: 19

*******************************************************************************/
import java.util.Scanner;

public class Lab10_Inheritance_InstrumentInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Lab10_Inheritance_Instrument myInstrument = new Lab10_Inheritance_Instrument();
      Lab10_Inheritance_StringInstrument myStringInstrument = new Lab10_Inheritance_StringInstrument();

      String instrumentName, manufacturerName, stringInstrumentName, stringManufacturer;
      int yearBuilt, cost, stringYearBuilt, stringCost, numStrings, numFrets;

      instrumentName = scnr.nextLine();
      manufacturerName = scnr.nextLine();
      yearBuilt = scnr.nextInt();
      scnr.nextLine();
      cost = scnr.nextInt();
      scnr.nextLine();
      stringInstrumentName = scnr.nextLine();
      stringManufacturer = scnr.nextLine();
      stringYearBuilt = scnr.nextInt();
      stringCost = scnr.nextInt();
      numStrings = scnr.nextInt();
      numFrets = scnr.nextInt();

      myInstrument.setName(instrumentName);
      myInstrument.setManufacturer(manufacturerName);
      myInstrument.setYearBuilt(yearBuilt);
      myInstrument.setCost(cost);
      myInstrument.printInfo();

      myStringInstrument.setName(stringInstrumentName);
      myStringInstrument.setManufacturer(stringManufacturer);
      myStringInstrument.setYearBuilt(stringYearBuilt);
      myStringInstrument.setCost(stringCost);
      myStringInstrument.setNumOfStrings(numStrings);
      myStringInstrument.setNumOfFrets(numFrets);
      myStringInstrument.printInfo();

      System.out.println("   Number of strings: " + myStringInstrument.getNumOfStrings());
      System.out.println("   Number of frets: " + myStringInstrument.getNumOfFrets());
   }
}
