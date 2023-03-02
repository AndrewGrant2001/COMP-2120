/*
13.11 LAB: Movie show time display
Write a program that reads movie data from a csv (comma separated values) file and output the data in a formatted table. The program first reads the name of the CSV file from the user. The program then reads the csv file and outputs the contents according to the following requirements:

Each row contains the title, rating, and all showtimes of a unique movie.
A space is placed before and after each vertical separator (|) in each row.
Column 1 displays the movie titles and is left justified with a minimum of 44 characters.
If the movie title has more than 44 characters, output the first 44 characters only.
Column 2 displays the movie ratings and is right justified with a minimum of 5 characters.
Column 3 displays all the showtimes of the same movie, separated by a space.
Each row of the csv file contains the showtime, title, and rating of a movie. Assume data of the same movie are grouped in consecutive rows.

Ex: If the input of the program is:

movies.csv
and the contents of movies.csv are:

16:40,Wonders of the World,G
20:00,Wonders of the World,G
19:00,Journey to Space ,PG-13
12:45,Buffalo Bill And The Indians or Sitting Bull's History Lesson,PG
15:00,Buffalo Bill And The Indians or Sitting Bull's History Lesson,PG
19:30,Buffalo Bill And The Indians or Sitting Bull's History Lesson,PG
10:00,Adventure of Lewis and Clark,PG-13
14:30,Adventure of Lewis and Clark,PG-13
19:00,Halloween,R
the output of the program is:

Wonders of the World                         |     G | 16:40 20:00
Journey to Space                             | PG-13 | 19:00
Buffalo Bill And The Indians or Sitting Bull |    PG | 12:45 15:00 19:30
Adventure of Lewis and Clark                 | PG-13 | 10:00 14:30
Halloween                                    |     R | 19:00
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class MovieTime {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      /* Type your code here. */
      String[] Name1 = new String[50];
      String[] Name2 = new String[50];
      String[] Name3 = new String[50];
   
  
      String fileName = scnr.next();
      
      /* Type your code here. */
      FileInputStream fileByteStream = new FileInputStream(fileName);
      Scanner inFS = new Scanner(fileByteStream);
      
      inFS.useDelimiter("\t");
      
      int i = 0;
      
      for (i = 0; i < 50; i++) {
         Name2[i] = "EMPTY";
      }
      
      i =0;
         
      while (inFS.hasNext()) {
         inFS.useDelimiter(",");
         Name1[i] = inFS.next();
         Name2[i] = inFS.next();
         inFS.useDelimiter("\n");
         Name3[i] = inFS.nextLine();
         i++;
         if (i > 49)
            break;
      }
      
      String time = "";
            
      for (i = 0; i < 50; i++) {
         if (!Name2[i].equals("EMPTY")) {
            Name3[i] = Name3[i].replace(",", "");
            System.out.printf("%-44.44s | %5s | %s", Name2[i], Name3[i], Name1[i]);  
            for (int j = 0; j < 50; j++) { 
               if (Name2[i].equals(Name2[j]) && j != i) {
                    System.out.print(" " + Name1[j]);
                    Name2[j] = "EMPTY";
               }
            }
            System.out.println();
      }
      }
      
      
       fileByteStream.close();
      
   }
}
