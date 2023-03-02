package Lab3; /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Lab3_BasicMethodsClasses_KilosToPounds {
   
   public static double kiloToPounds(double kilos) {
      // This statement intentionally has an error. 
      return (kilos * 2.204);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double kilos;
      double pounds;
      
      kilos = scnr.nextDouble();
      
      pounds = kiloToPounds(kilos);
      System.out.println(pounds + " lbs");
   }
}
