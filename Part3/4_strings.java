class Strings {
  public static void main(String[] args) {
    // Basics of strings
    String name = "Arsenic";
    String greet = "Hello, ";
    String otherName = "Astrix";

    System.out.println(greet + name + "!"); // prints "Hello, Arsenic!"

    // [+] String Comparisons and "Equals" [+]
      
    /*
      - Strings can't be compared with the equals operator - "=="
      - There exists a seperate "equals"-command, which always append to the end of the sting
        that we want to compare.     
      - When comparing strings, you should make sure the string variable has some value assigned
        to it. Else "NullPointerException" error if thrown.
      - NullPointerException means that no value has been assigned to the variable, or that is
        empty(null) 
    */
    System.out.println(otherName.equals(name)); // prints false
    System.out.println(name.equals(name)); // prints true

    // Login method
    login("arsenic", "secrt"); // prints Invalid credentials

    // [+] Splitting a String [+]
    String text = "First second third fourth";
    String[] pieces = text.split(" "); // ["First", "second", "third", "fourth"]
    System.out.println(pieces[0]);
    System.out.println(pieces[1]);
    System.out.println(pieces[2]);
    System.out.println(pieces[3]);
  }

  public static void login(String username, String password) {
    String correctName = "arsenic";
    String correctPassword = "secret";

    if (username.equals(correctName) && password.equals(correctPassword)) {
      System.out.println("You have succesfully logged in!");
    } else {
      System.out.println("Invalid credentials!");
    }
  }
}