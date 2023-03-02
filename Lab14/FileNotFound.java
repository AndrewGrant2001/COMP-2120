/*
14.11 LAB: Student info not found
Given a main program that searches for the ID or the name of a student from a text file, complete the findID() and the findName() methods that return the corresponding information of a student. Then, insert a try/catch statement in main() to catch any exceptions thrown by findID() or findName(), and output the exception message. Each line in the text file contains the name and the ID of a student, separated by a space.

Method findID() takes two parameters, a student's name and a Scanner object containing the text file's contents. Method findID() returns the ID associated with the student's name if the name is in the file, otherwise the method throws an Exception object with the message "Student ID not found for studentName", where studentName is the name of the student.

Method findName() takes two parameters, a student's ID and a Scanner object containing the text file's contents. Method findName() returns the name associated with the student's ID if the ID is in the file, otherwise the method throws an Exception object with the message "Student name not found for studentID", where studentID is the ID of the student.

The main program takes three inputs from a user: the name of a text file (String), a user choice of finding the ID or the name of a student (int), and the ID or the name of a student (String). If the user choice is 0, findID() is invoked with the student's name as one of the arguments. If the user choice is 1, findName() is invoked with the student's ID as one of the arguments. The main program finally outputs the result of the search or a message if an exception is caught.

Ex: If the input of the program is:

roster.txt 0 Reagan
and the contents of roster.txt are:

Reagan rebradshaw835
Ryley rbarber894
Peyton pstott885
Tyrese tmayo945
Caius ccharlton329
the output of the program is:

rebradshaw835
Ex: If the input of the program is:

roster.txt 0 Mcauley
the program outputs an exception message:

Student ID not found for Mcauley
Ex: If the input of the program is:

roster.txt 1 rebradshaw835
the output of the program is:

Reagan
Ex: If the input of the program is:

roster.txt 1 mpreston272
the program outputs an exception message:

Student name not found for mpreston272
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   
   public static String findID(String studentName, Scanner infoScnr) throws Exception {
      String studentN;
      String studentID = "null";
      
      /* Type your code here. */
      while (infoScnr.hasNext()) {
         studentN = infoScnr.next();
         studentID = infoScnr.next();
         if(studentN.equals(studentName)) {
            return studentID;
         }
         else {
              studentID = "null";
         }
      }
            
      if (studentID.equals("null")) {
         throw new Exception("Student ID not found for " + studentName);
      }
      else {
         return studentID;
      }
   }
   
   public static String findName(String studentID, Scanner infoScnr) throws Exception {
      
      /* Type your code here. */
      String studentN = "null";
      String studentI = "null";
      
      /* Type your code here. */
      while (infoScnr.hasNext()) {
         studentN = infoScnr.next();
         studentI = infoScnr.next();
         if(studentI.equals(studentID)) {
            return studentN;
         }
         else {
            studentN = "null";
         }
      }
            
      if (studentN.equals("null")) {
         throw new Exception("Student name not found for " + studentID);
      }
      else {
         return studentN;
      }
   }
   
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String studentName;
      String studentID;
      String studentInfoFileName;
      FileInputStream studentInfoStream = null;
      Scanner studentInfoScanner = null;
      
      // Read the text file name from user
      studentInfoFileName = scnr.next();

      // Open the text file
      studentInfoStream = new FileInputStream(studentInfoFileName);
      studentInfoScanner = new Scanner(studentInfoStream);
      
      // Read search option from user. 0: findID(), 1: findName()
      int userChoice = scnr.nextInt();

      // FIXME: findID() and findName() may throw an Exception.
      //        Insert a try/catch statement to catch the exception and output the exception message.
      try {
      if (userChoice == 0) {
         studentName = scnr.next();
         studentID = findID(studentName, studentInfoScanner);
         System.out.println(studentID);
      }
      else {
         studentID = scnr.next();
         studentName = findName(studentID, studentInfoScanner);
         System.out.println(studentName);
      }
      }
      catch (Exception e){
         System.out.println(e.getMessage());  
      }
      studentInfoStream.close();
   }
}
