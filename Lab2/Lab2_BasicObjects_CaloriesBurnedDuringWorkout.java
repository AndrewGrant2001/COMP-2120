package Lab2; /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Lab2_BasicObjects_CaloriesBurnedDuringWorkout {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      
      double age, weight, heartRate, time;
      
      age = scnr.nextDouble();
      weight = scnr.nextDouble();
      heartRate = scnr.nextDouble();
      time = scnr.nextDouble();
      
      double calories = ( (age * 0.2757) + (weight * 0.03295) + (heartRate * 1.0781) - 75.4991 ) * time / 8.368;
      
      System.out.printf("Calories: %.2f calories\n", calories);
      
   }
} 


