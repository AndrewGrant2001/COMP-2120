/*
Complete main() to read dates from input, one date per line. Each date's format must be as follows: March 1, 1990. Any date not following that format is incorrect and should be ignored. Use the substring() method to parse the string and extract the date. The input ends with -1 on a line alone. Output each correct date as: 3/1/1990.

Ex: If the input is:

March 1, 1990
April 2 1995
7/15/20
December 13, 2003
-1
then the output is:

3/1/1990
12/13/2003

*/

import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // TODO: Read dates from input, parse the dates to find the ones
      //       in the correct format, and output in m/d/yyyy format
      String input;
      int start, end = 0;
      String month, day, year;
      int monthNum;
      
      while (true) {
         input = scnr.nextLine();
         if (input.equals("-1") == true) {
            break;
         }
         start = input.indexOf(",");
         
         if(start == -1) {
            continue;
         }
         
         month = input.substring(0, start).split(" ")[0];
         day = input.substring(0, start).split(" ")[1];
         year = input.substring(start + 2);
         
         monthNum = getMonthAsInt(month);
         
         System.out.println(monthNum + "/" + day + "/" + year);
         
         
         
      }
        
   }
}
