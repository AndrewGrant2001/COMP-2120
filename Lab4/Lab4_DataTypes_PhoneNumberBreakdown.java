package Lab4; /******************************************************************************

Given a long integer representing a 10-digit phone number, output the area code, prefix, and line number using the format (800) 555-1212.

Ex: If the input is:

8005551212
the output is:

(800) 555-1212
Hint: Use % to get the desired rightmost digits. Ex: The rightmost 2 digits of 572 is gotten by 572 % 100, which is 72.

Hint: Use / to shift right by the desired amount. Ex: Shifting 572 right by 2 digits is done by 572 / 100, which yields 5. (Recall integer division discards the fraction).

For simplicity, assume any part starts with a non-zero digit. So 0119998888 is not allowed.

*******************************************************************************/
import java.util.Scanner;

public class Lab4_DataTypes_PhoneNumberBreakdown {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      long phoneNumber;
      // Add more variables as needed
      long start, mid, end, temp;
      
      phoneNumber = scnr.nextLong();
      
      /* Type your code here. */
      end = phoneNumber % 10000;
      phoneNumber = phoneNumber / 10000;
      
      mid = phoneNumber % 1000;
      phoneNumber = phoneNumber / 1000;
      
      start = phoneNumber; 
      
      System.out.println("(" + start + ") " + mid + "-" + end); 
      
   }
}


