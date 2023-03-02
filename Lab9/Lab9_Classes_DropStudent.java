package Lab9; /******************************************************************************

Complete the Course class by implementing the dropStudent() method, which removes a student (by last name) from the course roster. If the student is not found in the course roster, no student should be dropped.

Given classes:

Class Course represents a course, which contains an ArrayList of Student objects as a course roster. (Type your code in here.)
Class Student represents a classroom student, which has three private fields: first name, last name, and GPA. (Hint: getLast() returns the last name field.)
Ex: If the following students and their GPA values are added to a course:

Henry Nguyen with 3.5 GPA
Brenda Stern with 2.0 GPA
Lynda Robison with 3.2 GPA
Sonya King with 3.9 GPA

then dropStudent(last), where last is "Stern", removes a student and the program output is:

Course size: 4 students
Course size after drop: 3 students

*******************************************************************************/
import java.util.ArrayList;

public class Lab9_Classes_DropStudent {
	private ArrayList<Lab9_Classes_DropStudentStudent> roster; // Collection of Student objects

	public Lab9_Classes_DropStudent() {
		roster = new ArrayList<Lab9_Classes_DropStudentStudent>();
	}

	// Drops a student from course by removing student from course roster 
	public void dropStudent(String last) {
		String lName;
		
		for(int i = 0; i < roster.size(); ++i) {
         lName = roster.get(i).getLast();
         if (lName == last) {
            roster.remove(i);
         }
      }
	}

   public void addStudent(Lab9_Classes_DropStudentStudent s) {
      roster.add(s);
   }
 
   public int countStudents() {
      return roster.size();
   }
   
   // main
   public static void main(String args[]) {
      Lab9_Classes_DropStudent course = new Lab9_Classes_DropStudent();
      String first;  // first name
      String last;   // last name
      double gpa;    // grade point average
      int beforeCount;
      
      first = "Henry";
      last = "Nguyen";
      gpa = 3.5;
      course.addStudent(new Lab9_Classes_DropStudentStudent(first, last, gpa));  // Add 1st student
      
      first = "Brenda";
      last = "Stern";
      gpa = 2.0;
      course.addStudent(new Lab9_Classes_DropStudentStudent(first, last, gpa));  // Add 2nd student
      
      first = "Lynda";
      last = "Robison";
      gpa = 3.2;
      course.addStudent(new Lab9_Classes_DropStudentStudent(first, last, gpa));  // Add 3rd student
      
      first = "Sonya";
      last = "King";
      gpa = 3.9;
      course.addStudent(new Lab9_Classes_DropStudentStudent(first, last, gpa));  // Add 4th student
      
      beforeCount = course.countStudents();  // Number of students before dropping any students
      last = "Stern";
      course.dropStudent(last); // Should drop Brenda Stern
      
      System.out.println("Course size: " + beforeCount + " students");     // Should output 4
		System.out.println("Course size after drop: " + course.countStudents() + " students");     // Should output 3
   }    
}
