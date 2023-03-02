package Lab2; /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Lab2_BasicObjects_DrivingCosts {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      
      double carMilesPerGallon, gasDollarPerGallon;
      
      carMilesPerGallon = scnr.nextDouble();
      gasDollarPerGallon = scnr.nextDouble();
      
      double result = (1.0 / carMilesPerGallon) * gasDollarPerGallon;
      
      System.out.printf("%.2f ", (result * 20.0));
      System.out.printf("%.2f ", (result * 75.0));
      System.out.printf("%.2f\n", (result * 500.0));
   }
}


