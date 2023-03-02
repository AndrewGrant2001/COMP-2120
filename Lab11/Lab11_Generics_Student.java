package Lab11;

/* Type your code here for class Course. */
public class Lab11_Generics_Student implements Comparable<Lab11_Generics_Student>{
   protected String firstName;
   protected String lastName;
   protected Double GPA;

   //Course has a constructor and member methods:

   Lab11_Generics_Student(String first, String last, double gradeAverage) {// - set department to parameter dept and number to parameter num
      firstName = first;
      lastName = last;
      GPA = gradeAverage;
   }
   
   @Override
   public int compareTo(Lab11_Generics_Student otherStudent){ // - to enable sorting of Course objects, return -1, 0, or 1 according to the comparisons of the private members between Course and otherCourse. Precedence of comparisons: department (lowest first), then number (lowest first)
      int comparisonVal;         // Outcome of comparison
      
      // Compare based on department number first
      comparisonVal = GPA.compareTo(otherStudent.GPA) * -1;
      
      // If in same organization, use name
      if (comparisonVal == 0) {
         comparisonVal = lastName.compareTo(otherStudent.lastName);
      }
      if (comparisonVal == 0) {
         comparisonVal = firstName.compareTo(otherStudent.firstName);
      }
      
      return comparisonVal;
   }
   
   public String toString() {// - return a string representation of a student in the format "GPA lastName, firstName"
      return String.format("%.2f", GPA) + " " + lastName + ", " + firstName;
   }
}