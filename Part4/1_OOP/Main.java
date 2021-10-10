class OOP {
  public static void main(String[] args) {
    Person ada = new Person("arsenic");
    Person antti = new Person("Antti");

    int i = 0;
    while(i < 30) {
      ada.growOlder();
      i++;
    }

    antti.growOlder();

    System.out.println(antti); // same as System.out.prinln(antti.toString())
    System.out.println(ada); // same as System.out.prinln(ada.toString())
 
    /*
      - In principle, the System.out.println method requests the obejct's string representation
        and prints it.
      - The call to the "toString" method returning the string representation does not have to
        be written explicitly, Java adds it automatically.

      - When a programmer writes: System.out.prinln(antii);
        Java extends the cal at run time to the folow form:
          System.out.println(antti.toString());
        It calles the toString method of antti object and prnts the string returned by it.
    */
  }
}