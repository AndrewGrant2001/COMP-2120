package Lab10; /******************************************************************************

Given main(), define a Course base class with methods to set and get the courseNumber and courseTitle. Also define a derived class OfferedCourse with methods to set and get instructorName, term, and classTime.

Ex. If the input is:

ECE287
Digital Systems Design
ECE387
Embedded Systems Design
Mark Patterson
Fall 2018
WF: 2-3:30 pm
the output is:

Course Information: 
   Course Number: ECE287
   Course Title: Digital Systems Design
Course Information: 
   Course Number: ECE387
   Course Title: Embedded Systems Design
   Instructor Name: Mark Patterson
   Term: Fall 2018
   Class Time: WF: 2-3:30 pm

*******************************************************************************/
import java.util.Scanner;

public class Lab10_Inheritance_CourseInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Lab10_Inheritance_Course myCourse = new Lab10_Inheritance_Course();
      Lab10_Inheritance_OfferedCourse myOfferedCourse = new Lab10_Inheritance_OfferedCourse();

      String courseNumber, courseTitle;
      String oCourseNumber, oCourseTitle, instructorName, term, classTime;

      courseNumber = scnr.nextLine();
      courseTitle = scnr.nextLine();

      oCourseNumber =  scnr.nextLine();
      oCourseTitle =  scnr.nextLine();
      instructorName = scnr.nextLine();
      term = scnr.nextLine();
      classTime = scnr.nextLine();

      myCourse.setCourseNumber(courseNumber);
      myCourse.setCourseTitle(courseTitle);
      myCourse.printInfo();

      myOfferedCourse.setCourseNumber(oCourseNumber);
      myOfferedCourse.setCourseTitle(oCourseTitle);
      myOfferedCourse.setInstructorName(instructorName);
      myOfferedCourse.setTerm(term);
      myOfferedCourse.setClassTime(classTime);
      myOfferedCourse.printInfo();

      System.out.println("   Instructor Name: " + myOfferedCourse.getInstructorName());
      System.out.println("   Term: " + myOfferedCourse.getTerm());
      System.out.println("   Class Time: " + myOfferedCourse.getClassTime());
   }
}

