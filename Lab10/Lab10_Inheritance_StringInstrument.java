package Lab10;

// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class Lab10_Inheritance_StringInstrument extends Lab10_Inheritance_Instrument {
   // TODO: Declare private fields: numStrings, numFrets
   protected int numStrings;
   protected int numFrets;
   
   // TODO: Define mutator methods - 
   //      setNumOfStrings(), setNumOfFrets()
   public void setNumOfStrings(int input) {
      numStrings = input;
   }

   public void setNumOfFrets(int input) {
      numFrets = input;
   }

   // TODO: Define accessor methods -
   //      getNumOfStrings(), getNumOfFrets()
   public int getNumOfStrings() {
      return numStrings;
   }
   
   public int getNumOfFrets() {
      return numFrets;
   }

}

