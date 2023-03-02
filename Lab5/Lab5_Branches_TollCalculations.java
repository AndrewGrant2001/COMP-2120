package Lab5;

/******************************************************************************

Toll roads have different fees based on the time of day and on weekends. Write a method calcToll() that has three parameters: the current hour of time (int), whether the time is morning (boolean), and whether the day is a weekend (boolean). The method returns the correct toll fee (double), based on the chart below.

Weekday Tolls

Before 7:00 am ($1.15)
7:00 am to 9:59 am ($2.95)
10:00 am to 2:59 pm ($1.90)
3:00 pm to 7:59 pm ($3.95)
Starting 8:00 pm ($1.40)
Weekend Tolls

Before 7:00 am ($1.05)
7:00 am to 7:59 pm ($2.15)
Starting 8:00 pm ($1.10)
Ex: The method calls below, with the given arguments, will return the following toll fees:

calcToll(7, true, false) returns 2.95
calcToll(1, false, false) returns 1.90
calcToll(3, false, true) returns 2.15
calcToll(5, true, true) returns 1.05

*******************************************************************************/
public class Lab5_Branches_TollCalculations {
   
   public double calcToll(int hour, boolean isMorning, boolean isWeekend) {
      if(!isWeekend) {
         if(isMorning) {
            if (hour < 7) 
               return 1.15;
            else if (hour < 10)
               return 2.95;
            else
               return 1.90;
         }
         else {
            if (hour < 3)
               return 1.90;
            else if (hour < 8) 
               return 3.95;
            else
               return 1.40;
         }        
      }
      else {
         if(isMorning) {
            if (hour < 7)
               return 1.05;
            else
               return 2.15;
         }
         else {
            if (hour < 8)
               return 2.15;
            else
               return 1.10;
         }          
      }         
   }
   
  public static void main(String[] args) {
       Lab5_Branches_TollCalculations tollObj = new Lab5_Branches_TollCalculations();
       
       // Test the three samples from the specification.
       System.out.println(tollObj.calcToll(7, true, false));
       System.out.println(tollObj.calcToll(1, false, false));
       System.out.println(tollObj.calcToll(3, true, true));
   }
}

