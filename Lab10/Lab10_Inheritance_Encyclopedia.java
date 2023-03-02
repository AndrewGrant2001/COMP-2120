package Lab10;

public class Lab10_Inheritance_Encyclopedia extends Lab10_Inheritance_Book {
   // TODO: Declare private fields: edition, numVolumes
   protected String edition;
   protected int numVolumes;
   
   // TODO: Define mutator methods - 
   //       setEdition(), setNumVolumes()
   public void setEdition (String input) {
      edition = input;  
   }
   public void setNumVolumes(int in) {
      numVolumes = in;  
   }
  
   // TODO: Define accessor methods -
   //       getEdition(), getNumVolumes()
   public String getEdition() {
      return edition;  
   }
   public int getNumVolumes() {
      return numVolumes;
   }
   
   // TODO: Define a printInfo() method that overrides 
   //       the printInfo in Book class 
   @Override
   public void printInfo(){
      System.out.println("Book Information: ");
      System.out.println("   Book Title: " + title);
      System.out.println("   Author: " + author);
      System.out.println("   Publisher: " + publisher);
      System.out.println("   Publication Date: " + publicationDate);
      System.out.println("   Edition: " + edition);
      System.out.println("   Number of Volumes: " + numVolumes);
   }
   
   
}