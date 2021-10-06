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
    - When defining the type of values that a list can include, the first letter 
      of the element type has to be Capitalized
    - The list that includes int-type variable has to be defined in the form
      "ArrayList<Integer>". The reason for this has to do with how the
      ArrayList is implemented.
    - ArrayLists are "reference-type" variable.
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


    // System.out.print(list.get(100)); // Error
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
    System.out.println("");
    loopList();
  }

  // Method to find the smallest element in the ArrayList
  public static int smallestInList(ArrayList<Integer> myList) {
    if (myList.size() == 0) return -1;
    
    int smallest = myList.get(0); // assuming the 1st element as the smallest

    for(int number: myList) {
      if(number < smallest) {
        smallest = number;
      }
    }
    
    System.out.println("Smallest: " + myList.indexOf(smallest));
    return smallest;
  }

  // Method to find the sum of all the elements in the ArrayList
  public static int sumOfList(ArrayList<Integer> myList) {
    int sum = 0;

    for (int number: myList) {
      sum += number;
    }

    return  sum;
  }

  // Method to find the Avarage of a list
  public static int averageOfList(ArrayList<Integer> myList) {
    int average = sumOfList(myList) / myList.size();
    return average;
  }

  // Method to print all the number that are samller than the 
  // 2nd param threshold
  public static void printSmallerThan(ArrayList<Integer> numbers, int threshhold) {
    // kind of like for (let num of numbers) in JS
    for (int number: numbers) {
      if (number < threshhold) {
        System.out.println(number);
      }
    }
  }

  public static void printInRange(ArrayList<Integer>myList, int start, int end) {
    for (int number: myList) {
      if (number >= start && number <= end) {
        System.out.println("Range " + start + "-" + end + ": " + number);
      }
    }
  }

  public static void loopList() {
    // ArrayList teachers of type string.
    ArrayList<String> teachers = new ArrayList<String>();

    teachers.add("Simon");
    teachers.add("Samel");
    teachers.add("Anna");

    // System.out.println(teachers);

    // Loop through the ArrayList [For Loop]
      // for (int x = 0; x < teachers.size(); x++) {
      //   System.out.println(teachers.get(x));
      // }

    // Loop through the ArrayList using While loop
    int index = 0;
      // while(index < teachers.size()) {
      //   System.out.println(teachers.get(index));
      //   index++;
      // }

    // Last element in the list
    System.out.println("Last element is: " + teachers.get(teachers.size()-1));
  
    // ArrayList list of type Interger
    ArrayList<Integer> list = new ArrayList<Integer>();

    // adding elements in the list
    list.add(11);
    list.add(22);
    list.add(3); // index 2
    list.add(24);
    
    // Smallest element in the List
    int smallestElement = smallestInList(list);
    System.out.println("Smallest element in list is: " + smallestElement); // prints 3
    
    // Sum of all the elments in the list
    int sum = sumOfList(list);
    System.out.println("Sum of all elements in list is: " + sum); // prints 60

    // Average of all the elments in the list
    int average = averageOfList(list);
    System.out.println("Average of all elements in list is: " + average);

    System.out.print("Numbers that are smaller than 10 are: "); 
    printSmallerThan(list, 10);

    /* 
      Removing an element from the ArrayList 
      - NOTE: You cannot remove a number value by giving an INT type
        parameter to the remove method.
      - To remove an integer type value that has the same value as the parameter
        you can convert the parameter to Integer type;
        This is achieved by the "valueOf" method of the integer class.
    */
    list.remove(2); // index as argument -> renoves element at idx 3
    System.out.println(list); // [11, 22, 24]
    list.remove(Integer.valueOf(11)); // Removes element 11
    System.out.println(list); // [22, 24]

    // print numbers in range
    printInRange(list, 0, 22); // prints 22
    
    // [+] On copying the list to a method parameter
    sampleListExample();
  }

  /* 
    [+] On Copying the List to a method parameter
  
    - When a list (or any reference-type variable) is copied for a methods
      use, the method receives the value of the list variable, i.e. a reference
      in such a case the method receives a reference to the real value of a reference-type
      variable.
    - The method is able to modify the value of the original reference type variable, such as a list
    - The list that the method receives as a parameter is the same list that is
      used in the program that calls the method.
  */
  public static void removeFirst(ArrayList<Integer> numbers) {
    // edge case
    if (numbers.size() == 0) return;
    
    numbers.remove(0);
  }

  public static void sampleListExample() {
    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    
    System.out.println(myList); // prints [1,2,3,4]

    removeFirst(myList); // removes 1st element from the list

    System.out.println(myList); // prints [2,3,4]
  }

}