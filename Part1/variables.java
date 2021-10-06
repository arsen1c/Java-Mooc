/*

  - A variable can be thought of as a container in which information
  of a given type can be store.
  - Example of different variable types are:
      - String
      - int
      - float
      - double
      - boolean
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String text= "contains text";
    int wholeNumber = 12;
    double floatingPoint = 3.141592653;
    boolean trueOrFalse = true;

    System.out.println("Text variable: " + text);
    System.out.println("Integer variable: " + wholeNumber);
    System.out.println("Floating-point variable: " + floatingPoint);
    System.out.println("Boolean: " + trueOrFalse);

    Scanner sc = new Scanner(System.in);

    // [+] Reading different variable types [+]

    // Reading Integer
    String myStringNumber = sc.nextLine(); // reading a string
    int value = Integer.valueOf(myStringNumber); // converts str -> int
    System.out.println(value);

    // Reading a Double
    String myStringDouble = sc.nextLine(); 
    double doubleValue = Double.valueOf(myStringDouble); // convert str -> double
    System.out.println(doubleValue);

    // Reading a Boolean
    String myBoolString = sc.nextLine();
    boolean trueOrFalseVal = Boolean.valueOf(myBoolString);
    System.out.println(trueOrFalseVal);

    sc.close();
  }
}