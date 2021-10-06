/*
  Link: https://java-programming.mooc.fi/part-2/4-methods

  - As a method is called "the values of its parameters are copied".
  - The main method and the method to be called can use variables
    with the same name
  - NOTE: Changing the value of the variables inside the method does not affect
    the value of the variable in the main method that has the same name. 
    "printNumbers" <- check this
 
  - Method parameter are distinct from the variables (or params) of other
    methods, even if they had the same name.

  [+] Methods Can Return Values
  - The keyword "void" means that the method reutnrs nothing
  - If we want the method to return a value, the "void" keyword must
    be replace with the type of the return variable.
  - When execution inside a method reaches the command "reaturn", the
    execution of that method ends and the value is reaturned to the 
    calling method.
*/

class CustomMethods {
  public static void main(String[] args) {
    greet(2); // prints "Greeting!" 2 times
    printFromUntil(2, 6); // prints from 2 -> 6
    divisibleByThreeInRange(2, 10); // prints numbers divisible by 3
  
    // [+] Parameter Values Are Copied in a Method Call [+]
    int min = 5;
    int max = 10;
    // prints from min -> max
    printNumbers(min, max); // the min/max value will only change inside the method


    // [+} Methods Can Return Values [+]
    int returnedNumber = alwaysReturnsTen(); // set "return" value from alwaysReturnsTen method
    System.out.println("Value returned is: " + returnedNumber); // prints 10

    division(2,0); // prints "infinite"

    multiplicationTable(2);
  }

  // [+] Custom Methods [+]

  public static void greet(int numOfTimes) {
    int i = 0;

    while(i < numOfTimes) {
      System.out.println("Greeting!");
      i++;
    }
  }

  public static void printFromUntil(int start, int end) {
    int i = start; // note: we can skip this and directly modify "start"

    while(i <= end) {
      System.out.println(i);
      i++;
    }
  }

  // prints numbers divisible by 3 between "start" to "end"
  public static void divisibleByThreeInRange(int start, int end) {
    int i = start;

    while(i <= end) {
      if (i % 3 == 0) {
        System.out.println(i);
      }
      i++;
    }
  }

  // [+] Parameter Values Are Copied in a Method Call [+]
  public static void printNumbers(int min, int max) {
    while(min < max) {
      System.out.println(min);
      min++;
    }
  }

  // [+] Methods Can Return Values [+]
  public static int alwaysReturnsTen() {
    return 10;
  }

  public static void division(int numerator, int denominator) {
    if (denominator == 0) {
      System.out.println("Infinite");
      return;
    }

    System.out.println("" + numerator + " / " + denominator + " = " + (1.0 * numerator / denominator));
  }

  // [+] Method Calling Another Method [+]
  public static void multiplicationTable(int max) {
    int number = 1;

    while(number <= max) {
      printMultiplicationTableRow(number, max);
      number++;
    }
  }

  public static void printMultiplicationTableRow(int number, int coefficient) {
    int printable = number;

    while(printable <= number * coefficient) {
      System.out.print(" " + printable);
      printable += number;
    }

    System.out.println("");
  }
}
