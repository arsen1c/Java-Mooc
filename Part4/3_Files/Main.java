import java.nio.file.Paths;
import java.util.ArrayList;
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

      - To check for empty lines, do: "line.isEmpty()"
    */

    // Run methods

    // readingFile();
    // linesInFile();
    // checkName();
    numbersFromAFile();
  }

  public static void readingFile() {
    // create a scanner for reading the file
    try (Scanner scanner = new Scanner(Paths.get("./files/file.txt"))) {
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

  public static void linesInFile() {
    ArrayList<String> lines = new ArrayList<String>();

    // Scanner for reading the file
    try(Scanner scanner = new Scanner(Paths.get("./files/file.txt"))) {
      while(scanner.hasNextLine()) {
        lines.add(scanner.nextLine());
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
    
    System.out.println("Total lines: " + lines.size());
  }

  // check if a name exists in a file 
  public static void checkName() {
    ArrayList<String> list = new ArrayList<String>();
    Scanner reader = new Scanner(System.in);
    System.out.println("Search for: ");
    String nameToCheck = reader.nextLine();
    reader.close();

    try(Scanner scanner = new Scanner(Paths.get("./files/names.txt"))) {
      while(scanner.hasNextLine()) {
        list.add(scanner.nextLine());
      }
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }

    if (list.contains(nameToCheck)) {
      System.out.println("The name is on the list");
    } else {
      System.out.println("Not found");
    }
  }

  /*
    [+] Numbers from a file
    - Write a program that prompts the user for a filename, as well as the upper
      and lower bounds for the accepted range of numbers.

    Sample output:

      File?         numbers-1.txt
      Lower bound?  15
      Upper bound?  20
      Numbers:      2
  */
  public static void numbersFromAFile() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to search: ");
    int number = Integer.valueOf(scanner.nextLine());

    ArrayList<Integer> numberList = new ArrayList<Integer>();

    try(Scanner reader = new Scanner(Paths.get("./files/numbers.txt"))) {
      while(reader.hasNextLine()) {
        numberList.add(Integer.valueOf(reader.nextLine()));
      }
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println(numberList.contains(number));

    scanner.close();
  }
}