import java.util.Scanner;

/*
   - Input is always read asa  String.
   - For reading input we use "Scanner" tool.
   - Scanner can be imported from "java.util.Scanne;"
   - The tool itself is created with 
      Scanner scanner = new Scanner(System.in);
    - More precisely, INPUT is read with the "scanner" tools "nextLine()"
    - scanner.nextLine() is left waiting for the user to write sthg.

  Fundamentals of Strings:
    - String is a shorthand for "string of chanracters"
*/

class HelloWorldClass {
  // Class method
  public static void main(String[] args) {
    // reader
    Scanner scanner = new Scanner(System.in);
    // Print "Write a message: "
    System.out.println("Write a message: ");
    // Read the string written by the use, and assign it
    // to program memory "String message = (string)"
    String message = scanner.nextLine();

    // Print the message written by the user
    System.out.println(message);

    // print the product
    int result = 2 * Integer.valueOf(scanner.nextLine());
    System.out.println(result);

    scanner.close();

  } 
}