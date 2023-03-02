package Lab9; /******************************************************************************

Students make the Dean's list if their GPA is 3.5 or higher. Complete the Course class by implementing the getDeansList() method, which returns an ArrayList of students with a GPA of 3.5 or higher.

Given classes:

Class Course represents a course, which contains an ArrayList of Student objects as a course roster. (Type your code in here.)
Class Student represents a classroom student, which has three fields: first name, last name, and GPA. (Hint: getGPA() returns a student's GPA.)
Ex: If the following students and their GPA values are added to a course:

Henry Nguyen with 3.5 GPA
Brenda Stern with 2.0 GPA
Lynda Robison with 3.2 GPA
Sonya King with 3.9 GPA

then the getDeansList() method returns an ArrayList of 2 students and the program output is:

Dean's list:
Henry Nguyen (GPA: 3.5)
Sonya King (GPA: 3.9)
*******************************************************************************/
import java.util.ArrayList;

public class Lab9_Classes_DeansList {

	private ArrayList<Lab9_Classes_DeansListStudent> roster; // Collection of Student objects

	public Lab9_Classes_DeansList() {
		roster = new ArrayList<Lab9_Classes_DeansListStudent>();
	}
   
   // Return an ArrayList of all Students with a GPA of at least 3.5
	public ArrayList<Lab9_Classes_DeansListStudent> getDeansList() {
	   /* Type your code here */
	   ArrayList<Lab9_Classes_DeansListStudent> DeansList = new ArrayList<Lab9_Classes_DeansListStudent>();
	   double gpaCheck;
	   
	   
	   for (int i = 0; i < roster.size(); ++i) {
         gpaCheck = roster.get(i).getGPA();
         if (gpaCheck >= 3.5) {
            DeansList.add(roster.get(i));
         }
      }
	   return DeansList;
	}

	public void addStudent(Lab9_Classes_DeansListStudent s) {
		roster.add(s);
	}
	
	// main
   public static void main(String args[]) {
      Lab9_Classes_DeansList course = new Lab9_Classes_DeansList();
      ArrayList<Lab9_Classes_DeansListStudent> deanList = new ArrayList<Lab9_Classes_DeansListStudent>();
      String first;  // first name
      String last;   // last name
      double gpa;    // grade point average
      
      first = "Henry";
      last = "Nguyen";
      gpa = 3.5;
      course.addStudent(new Lab9_Classes_DeansListStudent(first, last, gpa));  // Add 1st student
      
      first = "Brenda";
      last = "Stern";
      gpa = 2.0;
      course.addStudent(new Lab9_Classes_DeansListStudent(first, last, gpa));  // Add 2nd student
      
      first = "Lynda";
      last = "Robison";
      gpa = 3.2;
      course.addStudent(new Lab9_Classes_DeansListStudent(first, last, gpa));  // Add 3rd student
      
      first = "Sonya";
      last = "King";
      gpa = 3.9;
      course.addStudent(new Lab9_Classes_DeansListStudent(first, last, gpa));  // Add 4th student

      deanList = course.getDeansList();
		System.out.println("Dean's list:");
		for (Lab9_Classes_DeansListStudent student: deanList) {
			System.out.println(student);     // Expect: ArrayList with Henry and Sonya
		}
   }    
}