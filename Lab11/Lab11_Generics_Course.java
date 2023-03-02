package Lab11;

/* Type your code here for class Course. */
public class Lab11_Generics_Course implements Comparable<Lab11_Generics_Course>{
   protected String department;
   protected Integer number;

   //Course has a constructor and member methods:

   Lab11_Generics_Course(String dept, int num) {// - set department to parameter dept and number to parameter num
      department = dept;
      number = num;
   }
   
   @Override
   public int compareTo(Lab11_Generics_Course otherCourse){ // - to enable sorting of Course objects, return -1, 0, or 1 according to the comparisons of the private members between Course and otherCourse. Precedence of comparisons: department (lowest first), then number (lowest first)
      int comparisonVal;         // Outcome of comparison
      
      // Compare based on department number first
      comparisonVal = department.compareTo(otherCourse.department);
      
      // If in same organization, use name
      if (comparisonVal == 0) {
         comparisonVal = number.compareTo(otherCourse.number);
      }
      
      return comparisonVal;
   }
   
   public String toString() {// - return a string representation of a course in the format "department number"
      return department + " " + number;
   }
   
   
   
   
   
}