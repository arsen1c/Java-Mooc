/*
    Link: https://java-programming.mooc.fi/part-1/5-calculating
    
    - Mathematical operations are performed from left to right with the 
      parentheses taken into account.
    - xpressions involving * and / are calculated before those involving + and -, 
      as is customary in elementary school mathematics.
    - The evaluation of an expression is always performed before it's assignment
        int calculate = 1 + 1;
*/

class Main {

  public static int secondsInADay(int sec) {
    return sec * 24 * 60 * 60;
  }

  public static void main(String[] args) {
    int first = 2;
    int second = 4;

    // sum of first and second variables
    int sum = first + second;
    System.out.println(sum); // prints 6 

    // with parentheses
    int calculationWithParentheses = (1+1) + 3 * (2+5); // () => * => +
    System.out.println(calculationWithParentheses); // prints 23

    // without parentheses
    int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
    System.out.println(calculationWithoutParentheses); // prints 13
  
    // seconds in a day
    int numberOfDays = 1;
    int seconds = secondsInADay(numberOfDays); // calling secondsInADay()
    System.out.println(seconds);
  }
}