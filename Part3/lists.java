// import the list to make it available to the program
import java.util.ArrayList;

/*
  Link: https://java-programming.mooc.fi/part-3/2-lists

  - Programming languages offer tools to assist in storing a large
    quantity of values.
  - The "ArrayList" is used for storing many values that are of the same type.
  - ArrayList offers various methods like:
      - adding values to the list
      - removing values from the list
      - retrieval of a value from a specific place in the list
  
  - Creating new ArrayList
    $ ArrayList<Type> list = new ArrayList<>();
    - "Type" is the type of values to be stored in the list. eg. String.
    - And the type of "list" variable is "ArrayList" of type String.

  - ArrayLists contains a reference to the location that contains the values relating 
    to that variable. Meaning they are "Reference-type"

*/

class Lists {
  public static void main(String[] args) {
    // Creating a new list of type Integer
    ArrayList<Integer> list = new ArrayList<>(); // a new list is created with "new" keyword
    
    list.add(1);
    list.add(10);
    list.add(1);
    list.add(1);

    System.out.print(list.get(1)); // prints 10


    System.out.print(list.get(100)); // Error
    /*
      NOTE: Retreiving info from a 'Non-existent' place will throw IndexOutOfBoundsException
      
      The above statement will throw this error:

        Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 2, Size: 2
        at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        at java.util.ArrayList.get(ArrayList.java:429)
        at Example.main(Example.java:(line))
        Java Result: 1

      - The error message provided hints of the internal implementation of an ArrayLIst object.
      - It lists all the methods that were called leading up to the error.
      - First, the program called the "main" metod, whereupon ArrayLists "get" method was called.
      - Subsequently, the "get" method of the ArrayList called the "rangeCheck" method, in 
        which the error occurred. 

    */
  }
}