class Main {
  public static void main(String[] args) {
    Person arsenic = new Person("Arsenic");
    String about = arsenic.toString();
    System.out.println(about);

    // setting new age
    arsenic.setAge(20);
    String newabout = arsenic.toString();
    System.out.print(newabout);
  }
}