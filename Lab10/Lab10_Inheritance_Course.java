package Lab10;

public class Lab10_Inheritance_Course {
   // TODO: Declare private fields - courseNumber, courseTitle
   protected String courseNumber;
   protected String courseTitle;

   // TODO: Define mutator methods - 
   //       setCourseNumber(), setCourseTitle()
   public void setCourseNumber(String input) {
      courseNumber = input;  
   }
   public void setCourseTitle(String input) {
      courseTitle = input;  
   }

   // TODO: Define accessor methods - 
   //       getCourseNumber(), getCourseTitle()
   public String getCourseNumber() {
      return courseNumber;  
   }
   public String getCourseTitle() {
      return courseTitle;  
   }

   // TODO: Define printInfo()
   public void printInfo() {
      System.out.println("Course Information: " + "\n" + "   Course Number: " + courseNumber + "\n" + "   Course Title: " +  courseTitle);
   }
}
