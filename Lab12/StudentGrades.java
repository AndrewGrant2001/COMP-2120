/*
Given a HashMap pre-filled with student names as keys and grades as values, complete main() by reading in the name of a student, outputting their original grade, and then reading in and outputting their new grade.

Ex: If the input is:

Quincy Wraight
73.1
the output is:

Quincy Wraight's original grade: 65.4
Quincy Wraight's new grade: 73.1
*/


import java.util.Scanner;
import java.util.HashMap;

public class StudentGrades {
       
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      String studentName;
      double studentGrade;
      
      HashMap<String, Double> studentGrades = new HashMap<String, Double>();
      
      // Students's grades (pre-entered)
      studentGrades.put("Harry Rawlins", 84.3);
      studentGrades.put("Stephanie Kong", 91.0);
      studentGrades.put("Shailen Tennyson", 78.6);
      studentGrades.put("Quincy Wraight", 65.4);
      studentGrades.put("Janine Antinori", 98.2);
      
      // TODO: Read in new grade for a student, output initial 
      //       grade, replace with new grade in HashMap,
      //       output new grade
      studentName = scnr.nextLine();
      
      System.out.println(studentName + "'s original grade: " + studentGrades.get(studentName));
      
      studentGrade = scnr.nextDouble();
      
      studentGrades.put(studentName, studentGrade);
      
      System.out.println(studentName + "'s new grade: " + studentGrades.get(studentName));
      
      
      
      
   }
}
