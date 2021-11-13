/* 
  - There can be a class declared as abstract that provides implementation of all the methods in a class i.e. 
    no abstract method in the class but vice versa is not true, if there is any abstract method in a class 
    then the class must be declared abstract.

  - Abstract class in Java may have some methods with implementation and some methods as abstract.
  
  - Abstract classes can not be instantiated to create an object.

  - An object reference of an abstract class can be created.

  - If a class implements an interface and does not provide implementation for all the interface methods, 
    it must be declared abstract.
*/


public class AbstractDemo {
  public static void main(String[] args) {
    ShapeClass triangle = new Triangle(5, 6);

    ShapeClass shape;
    Rectangle rectangle = new Rectangle(5, 10);
    shape = rectangle;

    triangle.area();
    shape.area();
  }
}

abstract class ShapeClass {
  double length;
  double breadth;

  // Constructor
  ShapeClass(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  // common method
  public String getFigureType() {
    return " 2D figure.";
  }

  // abstract method
  abstract void area();
}

class Triangle extends ShapeClass {
  // Constructor to initialize length
  Triangle(double i, double j) {
    super(i, j); // calling the super class constructor
  }

  // (Overriding area method) abstract method implementation for triagnle class
  void area() {
    System.out.println("In area method of Triangle");
    System.out.println("Area of triangle - " + (length * breadth) / 2);
  }
}


class Rectangle extends ShapeClass {
  Rectangle(double i, double l) {
    super(i, l);
  }

  // (Overriding area method) abstract method implementation
  void area() {
    System.out.println("In area method of Rectangle");
    System.out.println("Area of Rectangle - " + length * breadth);
  }
}

/* 
  Abstract class in Java with Interface

  Note: if a class implements an interface, but does not implements all the methods of that 
  interface then that class must be declared as abstract.
*/

interface MyInterface {
  void method1();
  String method2(String id);
}

abstract class AbstractClasDemo implements MyInterface {
  /*
   * Without abstract key word in the clas declartion, we get an error saying
   * 
   * Error:
   *      The type AbstractClasDemo must implement the inherited abstract method
   *      MyInterface.method1()Java(67109264) 
   *      The type AbstractClasDemo must implement
   *      the inherited abstract method MyInterface.method2(String)Java(67109264)
   */
  void run() {
    System.out.println("Inside abstractclassdemo class");
  }
}