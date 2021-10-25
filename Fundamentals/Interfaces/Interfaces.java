interface Abc {
  void show();
}

// Implementation of Abc
class AbcImplement implements Abc {
  public void show() {
    System.out.println("in show!");
  }
}

// One more example of interface (anonymous class)
interface Xyz {
  void show();
}

/* 
    Market Interface -> without any methods
    SAM - Single abstract method -> functional interface
    NOrmal 
*/

interface interface3 {
  void show();
}

public class Interfaces {
  public static void main(String[] args) {
    Abc obj = new AbcImplement();

    obj.show();

    // Anonymous Class
    Xyz obj1 = new Xyz() {
      public void show() {
        System.out.println("in xyz show");
      }
    };

    obj1.show();

    // 3rd interface
    interface3 obj2 = () -> System.out.println("in interface 3 show");
    obj2.show();
  }
}
