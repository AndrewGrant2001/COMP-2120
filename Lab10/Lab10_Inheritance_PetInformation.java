package Lab10;

/******************************************************************************

The base class Pet has protected fields petName, and petAge. The derived class Dog extends the Pet class and includes a private field for dogBreed. Complete main() to:

create a generic pet and print information using printInfo().
create a Dog pet, use printInfo() to print information, and add a statement to print the dog's breed using the getBreed() method.
Ex. If the input is:

Dobby
2
Kreacher
3
German Schnauzer
the output is:

Pet Information: 
   Name: Dobby
   Age: 2
Pet Information: 
   Name: Kreacher
   Age: 3
   Breed: German Schnauzer

*******************************************************************************/
public class Lab10_Inheritance_PetInformation extends Lab10_Inheritance_Pet {
   private String breed;

   public void setBreed(String userBreed) {
      breed = userBreed;
   }

   public String getBreed() {
      return breed;
   }
}
