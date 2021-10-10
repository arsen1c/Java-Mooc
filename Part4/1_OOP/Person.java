// Public key in front of a class means, this class can be used in other files
public class Person {
  /*
    - instance variables created with keyword "private" means those variables
      are hidden inside the object. Known as Encapsulation
    - If the programmer does not define a constructor for a class, Java
      automatically creates a default one for it.
    - A default constructor is a constructor that doean't do anything apart from
      creating the object.

    - If a constructor has been defined for a class, no default constructor exits.
 
    [+] Objects and Static modifier
    - The "Static" modifier indicates that the method in question does not belong to an 
      object and thus cannot be used to access any variable that belong to objects.
    - Our methods will not include the "static" keyword if they're used to process
      information about objects created from a given class.
  */

  // vars defined inside a class are called
  // instance variables or object fields or object attributes
  private String name; 
  private int age;

  // Constructor: name is same as class name
  public Person(String initialName) {
    this.age = 0;
    this.name = initialName;
  }

  // Method for an object: written beneath constructor

  // [Not preferable] Print persons details
  public void printPerson() {
    System.out.println(this.name + ", age " + this.age + " years");
  }

  public void growOlder() {
    this.age = this.age + 1;
  }

  public boolean isOfLegalAge() {
    if (this.age < 18) {
      return false;
    }

    return true;
  }

  /*
    - We have declared a method called "printPerson".
    - It is considered as a poor practice to do so.
    - A preferred way is to define a method for the object that "returns" a 
      "string representation" of the object.

    - What does that mean?
    -> The printPerson method just prints the values of the Object created.
      Which kind of shows the Instance variables. We should use "toString()" instead
      of this.
  */
  // This method will always run whenever an Object is created with this Class. 
  public String toString() {
    return this.name + ", age " + this.age + " years";
  }

}
