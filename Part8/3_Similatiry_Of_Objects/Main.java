import java.util.ArrayList;

/*
  - The "equals method" checks by default whether the object given as a paremeter has the
    same reference as the object it is being compared to.
  - The default behaviour checks whether the two objects are the same.
  - If the reference is the same, the method return "true" or "false" otherwise.

*/


class Main {
  public static void main(String[] args) {
    similarityCheck();
    similarityUsingArrayList();
  }

  public static void similarityCheck() {
    Book bookObject = new Book("Book object", 2000, "..."); // bookObject
    Book anotherBookObject = bookObject;

    // System.out.println(bookObject);

    if (bookObject.equals(anotherBookObject)) {
      System.out.println("The books are the same"); // gets printed
    } else {
      System.out.println("The books aren't the same");
    }

    // we now create an object with the same content that's nonetheless its own object
    anotherBookObject = new Book("Book object", 2000, "...");

    if (bookObject.equals(anotherBookObject)) {
      /*
        - Whenever we create a new object, a new Reference is created in the Heap area.
        - The .equals() method checks if the reference is the same. So, the following code will result false:
            String str1 = new String("Yo");
            String str2 = new String("Yo");

            str1.equals(str2); // prints false
        - The above code results false because the REFERENCE is different.
      */
      System.out.println("The books are the same");
    } else {
      System.out.println("The books aren't the same"); // gets printed
    }
  }

  public static void similarityUsingArrayList() {
    /*
      - ArrayLIst also uses the "equals" method in its internal implementation.
      - If we don't define the "equals" method in our objects(Object types and !primitive), the "contains" method of
        the ArrayList does not work properly.

      - If you remember, Java automatically converts the Primitive type datatype to 
        Reference type data by performing AutoUnboxing in an ArrayList.
    */
    ArrayList<Book> books = new ArrayList<>();
    Book bookObj = new Book("Book Object", 2000, "...");
    books.add(bookObj);

    if (books.contains(bookObj)) {
      System.out.println("Book Object was found.");
    }

    bookObj = new Book("Book Object", 2000, "...");

    if (!books.contains(bookObj)) {
      System.out.println("Book Object was not found.");
    }

    /*
      - The reliance on default methods such as "equals" is actually the reason why Java
        demands that variables added to ArrayList and HashMaps are of reference type.

      - Each reference type variable comes with default methods, such as equals, which
        means that you don't need to change the internal implementation of the ArrayList
        class when adding variables of different types.
    */
  }
}