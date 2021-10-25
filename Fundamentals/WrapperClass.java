import java.util.ArrayList;

class WrapperClass {
  public static void main(String[] args) {
    /*
      AutoBoxing: Converting primitive to Object
      Unboxing:   Converting object to primitive
    */
    int i = 5; // Primitive Data type variable

    // Declaring integer using Integer class 
    // Integer ii = new Integer(6); // (Boxing) Deprecated
    Integer ii = 5;                 // AutoBoxing
    Integer jj = i;                 // AutoBoxing

    // intValue -> call on Integer, returns int
    int j = jj.intValue();          // Unboxing
    int k = jj;                     // AutoUnboxing

    // Where to use Wrapper class Integer
    ArrayList<Integer> values = new ArrayList<Integer>();
    values.add(4);
    values.add(5);

    // ArrayList will perform AutoUnboxing for all the int value passed

    // Creating Wrapper Objects
    Integer myInt = 5;      // Integer Object
    Double myDouble = 5.99; // Double Object
    Character myChar = 'A'; // Character Object 

    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
  
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}