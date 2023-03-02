package Lab6; /******************************************************************************
Write a method, findMax(), that repeatedly reads in integers until a negative integer is read and keeps track of the largest integer that has been read. findMax() then returns the largest number entered.

Ex: If the input is:

2 77 17 4 -1
the findMax() returns and the program output is:

77
Assume a user will enter at least one non-zero integer.

Note: Your program must define the method:
public int findMax()

*******************************************************************************/
import java.util.Scanner;

public class Lab6_Loops_FindLargestNumber {
   
   public int findMax() {
      Scanner scnr = new Scanner(System.in);
      int max = 0, userNum = 0;
      
      while (userNum >= 0) {
         
         userNum = scnr.nextInt();
         
         if (max < userNum) 
            max = userNum;
      
      }
      
      return max;
      
   }
   
   public static void main(String[] args) {
      Lab6_Loops_FindLargestNumber test = new Lab6_Loops_FindLargestNumber();
      System.out.println(test.findMax());
   }
}


