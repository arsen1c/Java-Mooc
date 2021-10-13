/*
  Assignment: 
    - Create the following three classes:

      Class A. Class should have no object variables nor should you specify a constructor for it. 
        It only has the method public void a(), which prints a string "A".
      Class B. Class should have no object variables nor should you specify a constructor for it. 
        It only has the method public void b(), which prints a string "B".
      Class C. Class should have no object variables nor should you specify a constructor for it. 
        It only has the method public void c(), which prints a string "C".

    - Modify the classes so that class B inherits class A, and class C inherits class B. In other words, 
      class A will be a superclass for class B, and class B will be a superclass for class C.
*/

class Practice {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();

    a.a();
    b.b();
    c.c();
    c.a();
    c.b();
  }
}