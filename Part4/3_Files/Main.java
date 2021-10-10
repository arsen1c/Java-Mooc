import java.nio.file.Paths;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // NumberOfLines.numOfLines();


    /*
      [+] Reading From a File [+]
      - Reading a file is done using the Scanner-class.
      - When we want to read a file using the Scanner-class, we give the path
        for the file we want to reas a parameter to the constructor of the class.
      - Path to the file can be acquired using "Path.get(filenam.extension)"

      - When the Scanner object that reads the file has been created, the file 
        can be read using the while-loop.
      - The reading proceeds until all the lines of the file have been read. i.e
        the scanner finds no more lines to read.

      - Reading a file may result in an error, and it's for this readon that the
        process requires seperate blocks - one for the "try" and another to "catch"
        potential errors.
    */
    readingFile();
  }

  public static void readingFile() {
    // create a scanner for reading the file
    try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
      // we read the file until all the lines have been read
      while(scanner.hasNextLine()) {
        // we read one line
        String row = scanner.nextLine();
        // we print the line that we read
        System.out.println(row);
      }
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }
}