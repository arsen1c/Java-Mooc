class Main {

  public static void main(String[] args) {
    /*
      - Objects are created from the class through constructors by using the
        "new" keyword.

    */

    Rectangle first = new Rectangle(40, 80);
    Rectangle rectangle = new Rectangle(10, 10);

    System.out.println(first);
    System.out.println(rectangle);

    first.narrow();
    System.out.println(first);
    System.out.println(first.surfaceArea());

    /*
        Output:
          (40, 80)
          (10, 10)
          (39, 80)
          3120

    */
  }

}