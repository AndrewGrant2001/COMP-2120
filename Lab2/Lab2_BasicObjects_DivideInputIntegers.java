package Lab2; /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Lab2_BasicObjects_DivideInputIntegers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int userNum, divNum, Result1, Result2, Result3; 
      
      userNum = scnr.nextInt();
      divNum = scnr.nextInt();
      
      Result1 = userNum / divNum; 
      Result2 = Result1 / divNum;
      Result3 = Result2 / divNum;
      
      System.out.println(Result1 + " " + Result2 + " " + Result3);
      
      
      
   }
}

