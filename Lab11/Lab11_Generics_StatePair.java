package Lab11;

public class Lab11_Generics_StatePair<Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>> {
   private Type1 value1;
   private Type2 value2;
   
   // TODO: Define a constructor, mutators, and accessors 
   //       for StatePair
   Lab11_Generics_StatePair(Type1 i1, Type2 i2) {
      value1 = i1;
      value2 = i2;
   }
   
   public Type1 value1() {
      return value1;
   }
   
   public Type2 value2() {
      return value2;
   }
   // TODO: Define printInfo() method
   public void printInfo() {
      System.out.println(value1 + ": " + value2);  
   }
   
   
}