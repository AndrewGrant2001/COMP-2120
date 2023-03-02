package Lab3; /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Lab3_BasicMethodsClasses_DrivingCostMethod {
   
   public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
        return (dollarsPerGallon / milesPerGallon) * milesDriven;
    }

    public static void main (String[]args) {
        Scanner scnr = new Scanner(System.in);
        
        double num1 = scnr.nextDouble();
        double num2 = scnr.nextDouble();
        double yourValue;
        
        yourValue = drivingCost(num1, num2, 10);
        System.out.printf("%.2f ", yourValue);
        
        yourValue = drivingCost(num1, num2, 50);
        System.out.printf("%.2f ", yourValue);
        
        yourValue = drivingCost(num1, num2, 400);
        System.out.printf("%.2f\n", yourValue);
}
}

