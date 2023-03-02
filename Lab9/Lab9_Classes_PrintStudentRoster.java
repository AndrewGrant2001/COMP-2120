package Lab9; /******************************************************************************

Complete the Course class by implementing the printRoster() method, which outputs a list of all students enrolled in a course and also the total number of students in the course.

Given classes:

Class Course represents a course, which contains an ArrayList of Student objects as a course roster. (Type your code in here)
Class Student represents a classroom student, which has three fields: first name, last name, and GPA. (Hint: toString() returns a String representation of the Student object.)
Ex: If the following students and their GPA values are added to a course:

Henry Cabot with 3.5 GPA
Brenda Stern with 2.0 GPA
Jane Flynn with 3.9 GPA
Lynda Robison with 3.2 GPA

then the program output is:

Henry Cabot (GPA: 3.5)
Brenda Stern (GPA: 2.0)
Jane Flynn (GPA: 3.9)
Lynda Robison (GPA: 3.2)
Students: 4

*******************************************************************************/
import java.util.ArrayList;

// Class representing a student
public class Lab9_Classes_PrintStudentRoster {
	private ArrayList<Lab9_Classes_StudentRosterStudent> roster; // Collection of Student objects

	public Lab9_Classes_PrintStudentRoster() {
		roster = new ArrayList<Lab9_Classes_StudentRosterStudent>();
	}

   // Output each student in the course roster, and then the total size of the course
	public void printRoster() {
		/* Type your code here */	
		int i;
      for (i = 0; i < roster.size(); ++i) {
         System.out.println(roster.get(i).toString());
      }
	
		System.out.println("Students: " + roster.size());
	}

	public void addStudent(Lab9_Classes_StudentRosterStudent s) {
		roster.add(s);
	}
    
   // main
   public static void main(String args[]) {
      Lab9_Classes_PrintStudentRoster course = new Lab9_Classes_PrintStudentRoster();
      String first;  // first name
      String last;   // last name
      double gpa;    // grade point average
      
      first = "Henry";
      last = "Cabot";
      gpa = 3.5;
      course.addStudent(new Lab9_Classes_StudentRosterStudent(first, last, gpa));  // Add 1st student
      
      first = "Brenda";
      last = "Stern";
      gpa = 2.0;
      course.addStudent(new Lab9_Classes_StudentRosterStudent(first, last, gpa));  // Add 2nd student
      
      first = "Jane";
      last = "Flynn";
      gpa = 3.9;
      course.addStudent(new Lab9_Classes_StudentRosterStudent(first, last, gpa));  // Add 3rd student
      
      first = "Lynda";
      last = "Robison";
      gpa = 3.2;
      course.addStudent(new Lab9_Classes_StudentRosterStudent(first, last, gpa));  // Add 4th student

      course.printRoster();
   }    
}
