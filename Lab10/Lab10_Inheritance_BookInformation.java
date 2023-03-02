package Lab10; /******************************************************************************

Given main() and a base Book class, define a derived class called Encyclopedia. Within the derived Encyclopedia class, define a printInfo() method that overrides the Book class' printInfo() method by printing not only the title, author, publisher, and publication date, but also the edition and number of volumes.

Ex. If the input is:

The Hobbit
J. R. R. Tolkien
George Allen & Unwin
21 September 1937
The Illustrated Encyclopedia of the Universe
James W. Guthrie
Watson-Guptill
2001
2nd
1
the output is:

Book Information: 
   Book Title: The Hobbit
   Author: J. R. R. Tolkien
   Publisher: George Allen & Unwin
   Publication Date: 21 September 1937
Book Information: 
   Book Title: The Illustrated Encyclopedia of the Universe
   Author: James W. Guthrie
   Publisher: Watson-Guptill
   Publication Date: 2001
   Edition: 2nd
   Number of Volumes: 1

*******************************************************************************/
import java.util.Scanner;

public class Lab10_Inheritance_BookInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Lab10_Inheritance_Book myBook = new Lab10_Inheritance_Book();
      Lab10_Inheritance_Encyclopedia myEncyclopedia = new Lab10_Inheritance_Encyclopedia();

      String title, author, publisher, publicationDate;
      String eTitle, eAuthor, ePublisher, ePublicationDate, edition;
      int numVolumes;

      title = scnr.nextLine();
      author = scnr.nextLine();
      publisher = scnr.nextLine();
      publicationDate = scnr.nextLine();

      eTitle = scnr.nextLine();
      eAuthor = scnr.nextLine();
      ePublisher = scnr.nextLine();
      ePublicationDate = scnr.nextLine();
      edition = scnr.nextLine();
      numVolumes = scnr.nextInt();

      myBook.setTitle(title);
      myBook.setAuthor(author);
      myBook.setPublisher(publisher);
      myBook.setPublicationDate(publicationDate);
      myBook.printInfo();

      myEncyclopedia.setTitle(eTitle);
      myEncyclopedia.setAuthor(eAuthor);
      myEncyclopedia.setPublisher(ePublisher);
      myEncyclopedia.setPublicationDate(ePublicationDate);
      myEncyclopedia.setEdition(edition);
      myEncyclopedia.setNumVolumes(numVolumes);
      myEncyclopedia.printInfo();

    }
}
