public class PolymorphismDemo {
  public static void main(String[] args) {
    Shape shape;
    Square square = new Square(5.0);
    Circle circle = new Circle(5.0);

    // Test

    // Shape dynamically bound to the Square object referenced by square
    shape = square;
    // area method of square called
    shape.area();

    // shape dynamically bound to the Circle object referenced by circle
    shape = circle;
    // area method of circle called
    shape.area();

    // Another way
    Shape square1 = new Square(10.0);
    square1.area();

    OverloadingExample obj = new OverloadingExample();
    obj.mainMethod();
  }
}

// Run time polymorphism example
class Shape {
  // Protected: Subclass will have access to this variable
  protected double length;
  Shape(double length) {
    this.length = length;
  }

  // kind of like an interface
  void area() {
  }
}


// Child class
class Square extends Shape {
  // Constructor to initialize length
  Square(double side) {
    super(side); // calling the super class constructor
    // this will also set the "length" variable to "side" value.
    // this.length = side
  }

  // Overriding the are() method
  void area() {
    System.out.println("In area method of square");
    System.out.println("Area of square - " + length * length);
  }
}

// Child class
class Circle extends Shape {
  // constructor to initialize length
  Circle(double radius) {
    super(radius); // calling the super class constructor
  } 

  // Overriding the area method
  void area() {
    System.out.println("In area method of circle");
    System.out.println("Area of circle - " + 22/7*length*length);
  }
}

class OverloadingExample {
  // overloaded method
  void overloadedMethod(int i) {
    System.out.println("In overloaded Method with int parameter - " + i);
  }

  // overloaded Method
  void overloadedMethod(int i, String s) {
    System.out.println("In overloaded Method with int and string parameters - " + i + " " + s);
  }

  void mainMethod() {
    OverloadingExample obj = new OverloadingExample();
    obj.overloadedMethod(5);
    obj.overloadedMethod(5, "Test");
  }
}