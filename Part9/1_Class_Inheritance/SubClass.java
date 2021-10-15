public class SubClass extends SuperClass {
  public SubClass() {
    // automatically calls the 2nd Constructor of the SuperClass class.
    super("Subclass");
  }

  /*
    [+] Calling a superclass method [+]
    - We can call the methods defined in the superclass by prefixing the call with "super",
      just as you can call the methods defined in this class by prefixing the call
      with "this".

    - When overriding the "toString" method, you can call the superclass's definition
      of that method in the following manner:
  */
  @Override
  public String toString() {
    return super.toString() + "\n And let's add my own message to it!";
  }
}