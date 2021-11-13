public class InterfaceDemo {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.method1();

    MyAnotherClass anotherObj = new MyAnotherClass();
    anotherObj.method1();
  }
}


interface MyInterface1 {
  // Variables are by default public final static in an interface
  int i = 10;
  
  // Methods are by default public in an interface
  Number method1(); // returns Number;
  void method2(String id); // no return type
}

// Implementing an Interface
class MyClass implements MyInterface1 {
  public Integer method1() {
    System.out.println("in method1 " + i);
    return null;
  }

  public void method2(String id) {
    System.out.println("in method 2");
  }

  public void increment() {
    int x = i;
    // i++; we cannot incremenet the final value 
    x++;
  }
}

/*
 * Extending an interface
 * 
 */
interface B extends MyInterface1 {
  void method3();
}

// class implements all methods of MyInterface1 and B
class MyAnotherClass implements B {
  public Integer method1() {
    System.out.println("in method 1 " + i);
    return null;
  }

  public void method2(String Id) {
    System.out.println("in method 2");
  }

  public void method3() {
    System.out.println("in method 3");
  }
}

/*
 * Java nested interface Example
 * 
 */
class A {
  public interface TestInterface {
    void displayValue(String value);
  }
}

// class implementing the nested interface
class B1 implements A.TestInterface {
  public void displayValue(String value) {
    System.out.println("Value is " + value);
  }
}

class MyThirdClass {
  public static void main(String[] args) {
    A.TestInterface obj = new B1();
    obj.displayValue("yooo"); // Value is yooo

    // We cannot have an object of an Interface.
    A.TestInterface newInt;
    newInt = new B1();

    newInt.displayValue("working..");
  }
}