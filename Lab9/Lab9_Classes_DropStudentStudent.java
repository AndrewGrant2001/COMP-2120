package Lab9;

import java.text.DecimalFormat;

// Class representing a student
public class Lab9_Classes_DropStudentStudent {

	private String first;  // first name
	private String last;   // last name
	private double gpa;    // grade point average

	// Student class constructor
	public Lab9_Classes_DropStudentStudent(String f, String l, double g) {
		first = f;  // first name
		last = l;   // last name
		gpa = g;    // grade point average
	}

	public double getGPA() {
		return gpa;
	}

	public String getLast() {
		return last;
	}

   // Returns a String representation of the Student object, with the GPA formatted to one decimal
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("#.0");
		return first + " " + last + " " + fmt.format(gpa);
	}
}