// Link: https://java-programming.mooc.fi/part-5/3-primitive-and-reference-variables

class Main {
  public static void main(String[] args) {
    // primitive "int" variable "value". the number 10 is store as its value.
    int value = 10;
    System.out.println(value); // prints 10

    // we create a reference variable called "luke"
    // a reference to an object is returned by the constructor of the "Name" class when we call it.
    // this reference is stored as the value of the variable.
    Name luke = new Name("Luke");
    System.out.println(luke); // Name@4aa298b7

    /*
      - When we call "System.out.println()", it prints the value of the variable.
      - The value of a primitive variable is concerete, whereas the value of the reference variable is a
        reference.
      
      - When we attempt to print the value of a rerefence variable, the output contains the type of the variable
        and an identifier created for it by Java.
      - Output: Name@4aa298b7 -> Type@Identifier


      [+] Primitive Variables [+]
        - Java has 8 primitive variables.
          + boolean (true or false)
          + byte - 8bits, between -128 and 127
          + char - 16bits
          + shot - 16bits, between -32768 and 32767
          + int - 32bits, between -2^31 and 2*31 - 1
          + long - 64-bits, between -2^63 and 2^63 - 1
          + float - 32-bits
          + double - 64-bits  
      
      - Declaring primitive variable causes the computer to reserver some memory where the value assigned
        to the variable can be stored.
      - The size of the storage container reserved depends on type of the primitve.
    */
  }

  public static void primitveTypes() {
    int first = 10;
    int second = first;
    int third = second;

    /*
      - int first = 10 -> reserves a location called "first" and assign value 10
      - int second = first -> reserves a location called "second" and copies into the value of "first"
      - int third = second -> reserves a location called "third" and copies the value of "second"
    */

    System.out.println(first + " " + second + " " + third); // 10 10 10
    second = 5; // assigns the value 5 to the variable "second"
    System.out.println(first + " " + second + " " + third); // 10 5 10
  }
}