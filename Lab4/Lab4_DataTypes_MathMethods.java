package Lab4; /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Lab4_DataTypes_MathMethods {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      /* Type your code here. */
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
      
      System.out.print(Math.pow(x,z) + " ");
      System.out.print(Math.pow(x , Math.pow(y, z)) + " ");
      System.out.print(Math.abs(y) + " ");
      System.out.println(Math.sqrt(Math.pow(x * y, z)));
      
   }
}


