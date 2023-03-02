package Lab3; /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Lab3_BasicMethodsClasses_TrackLapsToMiles {
   
   public static double lapsToMiles(double userLaps) {
	    double CONVERTER = 0.25;
	    return CONVERTER * userLaps;
	}
	
	
	public static void main(String[] args) {
		Lab3_BasicMethodsClasses_TrackLapsToMiles track = new Lab3_BasicMethodsClasses_TrackLapsToMiles();
		Scanner scnr = new Scanner(System.in);
		
		double input = scnr.nextDouble();
		
		double yourValue = lapsToMiles(input);
		
		System.out.printf("%.2f\n", yourValue);
	}
}


