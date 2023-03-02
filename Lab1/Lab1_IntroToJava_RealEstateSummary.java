package Lab1; /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner; 

public class Lab1_IntroToJava_RealEstateSummary {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int baseChar; 
      int headChar; 
      
      baseChar = scnr.nextInt(); 
      headChar = scnr.nextInt();
      
      System.out.println("     " + headChar);
      System.out.println("     " + headChar + headChar);
      System.out.println(baseChar + "" + baseChar + "" + baseChar + "" + baseChar + "" + baseChar + "" + headChar + "" + headChar + "" + headChar);
      System.out.println(baseChar + "" + baseChar + "" + baseChar + "" + baseChar + "" + baseChar + "" + headChar + "" + headChar + "" + headChar + "" + headChar);
      System.out.println(baseChar + "" + baseChar + "" + baseChar + "" + baseChar + "" + baseChar + "" + headChar + "" + headChar + "" + headChar);
      System.out.println("     " + headChar + headChar);
      System.out.println("     " + headChar);
   }
}


