import java.util.ArrayList;
import java.util.HashMap;

class Main{ 
  public static void main(String[] args) {
    hashMapLookup();
    // arrayListLookup();
    listLookupTime();
  }

  public static void hashMapLookup() {
    // Book objects
    Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
    Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "...");

    // hashmap that uses the Book name as the key (String type object) and the
    // book we created as the value.
    HashMap<String, Book> directory = new HashMap<>();

    directory.put(senseAndSensibility.getName(), senseAndSensibility);
    directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

    long start = System.nanoTime();

    System.out.println(directory.get("Send and Sensibility"));
    // System.out.println(book); // returns null
   
    System.out.println();

    System.out.println(directory.get("Pride and Prejudice"));
    // System.out.println(book); // prints book
  
    long end = System.nanoTime();
    double durationInMilliseconds = 1.0 * (end-start) / 1000000;

    System.out.println("hashmap search took " + durationInMilliseconds + " milliseconds");
  }



  public static void arrayListLookup() {
    ArrayList<Book> books = new ArrayList<>();
    
    // Book objects
    Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
    Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "...");


    // adding items to the books list
    books.add(senseAndSensibility);
    books.add(prideAndPrejudice);

    System.out.println(get(books, "Sense and Sensibility"));
  }




  // method to get the book 
  public static Book get(ArrayList<Book> books, String name) {
    for (Book book: books) {
      if (book.getName().equals(name)) {
        return book;
      }
    }

    return null;
  } 

  public static void listLookupTime() {
    ArrayList<Book> books = new ArrayList<>();

    // adding ten million books to the list
    Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
    Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "...");

    // adding items to the books list
    books.add(senseAndSensibility);
    books.add(prideAndPrejudice);

    long start = System.nanoTime();

    System.out.println(get(books, "Sense and Sensibility"));

    System.out.println();

    System.out.println(get(books, "Sense and Sensibility"));

    long end = System.nanoTime();

    double durationInMilliseconds = 1.0 * (end-start) / 1000000;

    System.out.println("ArrayList book search took " + durationInMilliseconds + " milliseconds");
  }
}