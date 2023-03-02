package Lab3;

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Lab3_BasicMethodsClasses_StudentClass {
   // TODO: Build LibrarySystem.Main class with private fields and methods listed above

   // TODO: Define two private member fields
   String name;
   double gpa;
   
   public Lab3_BasicMethodsClasses_StudentClass() {
      // TODO: Define default constructor
      this.name = "Louie";
      this.gpa = 1.0;
   }
    
   public void setName(String n) {
      // TODO: Assign parameter to instance field  
      name = n;
   }
   
   // TODO: Add three more methods
   public String getName() {
      return name; 
   }
   
   public void setGPA(double grade) {
      gpa = grade;
   }
   
   public double getGPA() {
      return gpa; 
   }
   
   public static void main(String[] args) {
      Lab3_BasicMethodsClasses_StudentClass Main = new Lab3_BasicMethodsClasses_StudentClass();
      System.out.println(Main.getName() + "/" + Main.getGPA());
      
      Main.setName("Felix");
      Main.setGPA(3.7);
      System.out.println(Main.getName() + "/" + Main.getGPA());
   }
}

