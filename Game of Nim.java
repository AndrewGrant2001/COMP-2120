/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*; 

public class Main {
    public static void menu(){
        System.out.print((char)27 + "[1;36m\t+---------------------------------------+\n\t| ");
		System.out.println((char)27 + "[1;31;4m\tWelcome to Game of Nim!\t\t" + (char)27 + "[0m"
		    + (char)27 + "[1;36m|");
		System.out.println((char)27 + "[1;36m\t|" + (char)27 +
		    "[1;31m\tProgrammer: Andrew Grant\t" + (char)27 + "[1;36m|");
		System.out.println((char)27 + "[1;36m\t+---------------------------------------+" 
		    + (char)27 + "[0m");
    }
    
	public static void main(String[] args) {
	    int playAgain = 1, total = 21, turn, take;
	    do {
	        menu();
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();
	        do {
	            take = rand.nextInt(3) + 1;
	            System.out.println("The computer took: " + take);
	            total -= take;
	            System.out.println("Remaining: " + total + "\n---------------------------------------");
	            System.out.println("Enter how many you'd wish to take: ");
	            take = sc.nextInt();
	            total -= take;
	            System.out.println("Remaining: " + total + "\n---------------------------------------");
	        }while(total >= 0);
        
            try {
                do {
                    System.out.println("Do you wish to play again: (1 to play Again, 0 to exit)");
                    playAgain = sc.nextInt();
                } while(playAgain != 1 && playAgain != 0);
            }
            catch (Exception e) {
                System.out.println("Error!");
            }
        } while(playAgain != 0);
	}
}




