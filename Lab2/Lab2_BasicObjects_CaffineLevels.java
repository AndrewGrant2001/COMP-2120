package Lab2; /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner; 

public class Lab2_BasicObjects_CaffineLevels {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75. 
      
      caffeineMg = scnr.nextDouble(); 
      
      
      System.out.printf("After 6 hours: %.2f mg\n", (caffeineMg / 2.0));
      System.out.printf("After 12 hours: %.2f mg\n", (caffeineMg / 2.0 / 2.0));
      System.out.printf("After 24 hours: %.2f mg\n", (caffeineMg / 2.0 / 2.0 / 2.0 / 2.0));
   }
}

