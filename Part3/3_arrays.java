// Link: https://java-programming.mooc.fi/part-3/3-arrays

import java.util.Scanner;

/*
    [+] Indices and the structure of the memory
    - The reference of the array object is actually information about the location of the data.
    - By statin array[0] we're referring to the first element of the array.
    - The statement array[0] can alsobe read as "Go to the beginneg of the array and more forward 0 times"

    - The size of an int variable in Java is 32 bits.
    - One bit is reserved for the sign, so the largest possible number to present in int is
      2**31 - 1
    - When we create an int array of 4 elements, 4 * 32 bits of memory is allocated.
    - When you access array[2], 32bits are read starting from beginning of the array + 2*32 bits
*/

class Arrays {
  public static void main(String[] args) {
    // Creating an Array
    int[] numbers = new int[5]; // typeOfElems[]. 3 is the size of Array
  
    // Array to hold 5 strings
    String[] strings = new String[5];

    // assigning and accessing elements
    numbers[0] = 2;
    numbers[1] = 7;
    numbers[2] = 12;
    numbers[3] = 7;
    numbers[4] = 1;

    System.out.println(numbers[0]); // prints 2
    System.out.println(numbers[1]); // prints 7


    /*
      - If the index is pointing outside the Array i.e the element doesn't exists
        we get an "ArrayIndexOutOfBoundsException" error.
      - This error tells that the Array doesn't contain the given index.
    */


    // System.out.println("Which index should we acces? [0-4] "); // prints 7
    // Scanner scanner = new Scanner(System.in);

    // int index = Integer.valueOf(scanner.nextLine());
    // System.out.print("Element at index " + index + " is " + numbers[index]);
    
    // scanner.close();

    swap();
    userInputArray();

    // Sum of all the elements in the array
    System.out.println("Sum of elements in array: " + sumOfArray(numbers)); // prints 29

    // print stars
    printStars();
  }

  public static void swap() {
    int[] numbers = new int[5];
    numbers[0] = 42;
    numbers[1] = 13;
    numbers[2] = 12;
    numbers[3] = 7;
    numbers[4] = 1;

    // check length of an array
    System.out.println("Size of the array is: " + numbers.length); // 5
    
    // Swap element at index 0 and 1
    System.out.println("Element at index 0 before: " + numbers[0]); // 42
    System.out.println("Element at index 1 before: " + numbers[1]); // 13
    
    int temporary = numbers[0];
    numbers[0] = numbers[1];
    numbers[1] = temporary;

    System.out.println("Element at index 0 before: " + numbers[0]); // 13
    System.out.println("Element at index 1 before: " + numbers[1]); // 42
  }

  public static void userInputArray() {
    Scanner reader = new Scanner(System.in);
    System.out.println("How many numbers?");

    // get the size of the array from the user
    int howMany = Integer.valueOf(reader.nextLine());
   
    // declaring the array 
    int[] numbers = new int[howMany];

    System.out.println("Enter the numbers:");
    int index = 0;

    // take input at each iteration and push that value in the array
    while(index < numbers.length) {
      numbers[index] = Integer.valueOf(reader.nextLine());
      index++;
    }
    reader.close();

    // Print all the numbers in the array
    listElements(numbers);
  }

  // Prints all the elements in the array
  public static void listElements(int[] myArr) {
    System.out.println("The elements of the array are:");
    int index = 0;
    while(index < myArr.length) {
      System.out.print(myArr[index] + ", "); // format: x, y, z
      index++;
    }

    System.out.println("");
  }

  // Sum of Array
  public static int sumOfArray(int[] arr) {
    int sum = 0, index = 0;

    while(index < arr.length) {
      sum += arr[index];
      index++;
    }

    return sum;
  }

  // print in stars
  public static void printStars() {
    int[] array = {5, 1, 3, 4, 2};

    /*
        Desired output:
          *****
          *
          ***
          ****
          **
    */
    int index = 0;

    while(index < array.length) {
      for (int x = 0; x < array[index]; x++) {
        System.out.print('*');
      }
      System.out.println("");
      index++;
    }
  }
}