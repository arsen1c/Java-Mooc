import java.util.ArrayList;

/*
  INTERFACES

  - We can use interfaces to define behaviour that's required from a class i.e it's methods.
  - They are defined the same way that regular Java classes, but "public interface..."
    is used instead of "public class" at the beginning of the class.

  - Interfaces define behaviour through method names and their returned values.
  - However, they dont' always include the actual implemetations of the methods. 

  Example:
    public interface Readable {
      String read();
    }

  - the interface declares a read method, which returns a String-type object.

  - The classes that implement the interface decide how the methods defined in the interface
    are implemented.
  - A class implements the interface by adding the keyword implements after the class name
    followed by the name of the interface being implemented.
*/

// A class called " TextMessage" 

class Main {
  public static void main(String[] args) {
    invokeTextMessage();
    invokeEbook();
  }

  public static void invokeTextMessage() {
      TextMessage message = new TextMessage("arsenic", "hello world!");
      System.out.println(message.read());

      ArrayList<TextMessage> textMessages = new ArrayList<>();
      textMessages.add(new TextMessage("private number", "I hid the body"));
  }

  public static void invokeEbook() {
    ArrayList<String> pages = new ArrayList<>();
    pages.add("Split your method into short, readable entities.");
    pages.add("Separate the user-interface logic from the application logic.");
    pages.add("Always program a small part initially that solves a part of the problem.");
    pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");


    Ebook book = new Ebook("Tips for programming", pages);

    int page = 0;
    // .pages() returns the total number of pages.
    while(page < book.pages()) {
      System.out.println(book.read());
      page++;
    }
  }
}