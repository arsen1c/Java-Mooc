public class Abstract {
  public static void main(String[] args) {
    // MaheshPhone obj = new MaheshPhone(); // Cannot instantiate abstract class

    // Dynamic method dispatch -> Polymorphism at runtime
    MaheshPhone obj = new SureshPhone();
    obj.call();
    obj.move();
    obj.dance();
    obj.cook();

    Iphone phoneObj = new Iphone();
    SamsungS4 phoneObj1 = new SamsungS4();
    show(phoneObj1);

    // Writer abstract class
    Writer pencil = new Pencil();
    pencil.write();
  }
  public static void show(Phone obj) {
    obj.showConfig();
  }
}

abstract class MaheshPhone { // Abstract class
  // implementin call method
  public void call() {
    System.out.println("calling...");
  }

  /*
   * Abstract methods
   * 
   * now the problem is mahesh doesnt know how to implement the below methods. so
   * we will make those methods as "abstract"
   * 
   * - note: the class which has abstract methods, should also have the keyword
   * abstract in front of it. - You cannot instantiate Abstract class like..
   * MyAbsClass obj = new MyAbsClass(); // throws Error
   */
  public abstract void move(); // abstract methods

  public abstract void dance();

  public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone { // Abstract calass
  public void move() {
    System.out.println("Moving...");
  }
}

class SureshPhone extends RameshPhone { // Concrete class
  public void dance() {
    System.out.println("Dancing...");
  }

  public void cook() {
    System.out.println("Cooking...");
  }
}

abstract class Phone {
  public abstract void showConfig();
}

class Iphone extends Phone {
  public void showConfig() {
    System.out.println("2Gb, IOS 9.3");
  }
}

class SamsungS4 extends Phone {
  public void showConfig() {
    System.out.println("2gb, Lolipop");
  }
}

// Assignment
abstract class Writer {
  public abstract void write();
}

class Pen extends Writer {
  public void write() {
    System.out.println("Wrote with pen");
  }
}

class Pencil extends Writer {
  public void write() {
    System.out.println("Wrote with pencil");
  }
}