/*
13.8 LAB: Course Grade
Write a program that reads the student information from a tab separated values (tsv) file. The program then creates a text file that records the course grades of the students. Each row of the tsv file contains the Last Name, First Name, Midterm1 score, Midterm2 score, and the Final score of a student. A sample of the student information is provided in StudentInfo.tsv. Assume the number of students is at least 1 and at most 20. Assume also the last names and first names do not contain whitespaces.

The program performs the following tasks:

Read the file name of the tsv file from the user.
Open the tsv file and read the student information.
Compute the average exam score of each student.
Assign a letter grade to each student based on the average exam score in the following scale:
A: 90 =< x
B: 80 =< x < 90
C: 70 =< x < 80
D: 60 =< x < 70
F: x < 60
Compute the average of each exam.
Output the last names, first names, exam scores, and letter grades of the students into a text file named report.txt. Output one student per row and separate the values with a tab character.
Output the average of each exam, with two digits after the decimal point, at the end of report.txt. Hint: Use the precision sub-specifier to format the output.
Ex: If the input of the program is:

StudentInfo.tsv
and the contents of StudentInfo.tsv are:

Barrett    Edan    70  45  59
Bradshaw    Reagan  96  97  88
Charlton    Caius   73  94  80
Mayo    Tyrese  88  61  36
Stern    Brenda  90  86  45
the file report.txt should contain:

Barrett    Edan    70  45  59  F
Bradshaw    Reagan  96  97  88  A
Charlton    Caius   73  94  80  B
Mayo    Tyrese  88  61  36  D
Stern    Brenda  90  86  45  C

Averages: Midterm1 83.40, Midterm2 76.60, Final 61.60
*/


import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      /* TODO: Declare any necessary variables here. */
      String fileName;
      int x = 0;
      int[] mid1 = new int[20];
      int[] mid2 = new int[20];
      int[] finalExam = new int[20];
      String[] first = new String[20];
      String[] last = new String[20];
      char[] letterGrade = new char[20];
      double avg;
      
      
      for (int i = 0; i < 20; i++) {
         first[i] = "N";
         last[i] = "N";
         mid1[i] = -1;
         mid2[i] = -1;
         finalExam[i] = -1;
      }
      
      /* TODO: Read a file name from the user and read the tsv file here. */
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object

      fileName = scnr.next();

      // Try to open file
      fileByteStream = new FileInputStream(fileName);
      inFS = new Scanner(fileByteStream);
      
      while (inFS.hasNext()) {
         first[x] = inFS.next();
         last[x] = inFS.next();
         mid1[x] = inFS.nextInt();
         mid2[x] = inFS.nextInt();
         finalExam[x] = inFS.nextInt();
         
         x++;
      }
      
      double[] average = new double[3]; 
      average[0] = 0;
         average[1] = 0; 
         average[2] = 0;
      
      for (int i = 0; i < 20; i++) {
         if (first[i].equals("N")) {
            break;
         }
         
         avg = (mid1[i] + mid2[i] + finalExam[i]) / 3.0;
         
         if (90 <= avg)
            letterGrade[i] = 'A';
         else if (80 <= avg && avg < 90)
             letterGrade[i] = 'B';
         else if (70 <= avg && avg < 80)
          letterGrade[i] = 'C';
         else if (60 <= avg && avg < 70)
             letterGrade[i] = 'D';
         else 
             letterGrade[i] = 'F';
         
      }   
      
      for (int i = 0; i < 20; i++) {
         if (first[i].equals("N")) {
            average[0] = average[0] / (double)i;
            average[1] = average[1] / (double)i;
            average[2] = average[2] / (double)i;
            break;  
         }
         average[0] += mid1[i];
         average[1] += mid2[i];
         average[2] += finalExam[i];
      }
   
      
      /* TODO: Compute student grades and exam averages, then output results to a text file here. */
      FileOutputStream fileStream = null;
     PrintWriter outFS = null;

     // Try to open file
     fileStream = new FileOutputStream("report.txt");
     outFS = new PrintWriter(fileStream);
      
      for (int i = 0; i < 20; i++) {
         if (first[i].equals("N")) {
            outFS.printf("\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", average[0] , average[1] ,average[2]);
            break;  
         }
         outFS.println(first[i] + "\t" + last[i] + "\t" + mid1[i] + "\t" + mid2[i] + "\t" + finalExam[i] + "\t" + letterGrade[i]);
      }
      outFS.close();
      fileByteStream.close();
   }
}