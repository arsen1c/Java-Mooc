import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // a list meant for storing Person type object
    ArrayList<Person> persons = new ArrayList<>();

    // a new Person object
    Person arsenic = new Person("Arsenic");

    // add Person object "arsenic" to the List
    persons.add(arsenic);

    // person object can also be created "in the same sentence" that they are added to the list
    persons.add(new Person("Matthew"));
    persons.add(new Person("Matrin"));

    // calling toString method
    // String about = arsenic.toString();
    // System.out.println(about);

    // setting new age using "setAge" setter
    arsenic.setAge(20);
    // String newabout = arsenic.toString();
    // System.out.println(newabout);

    // print all the person objects in the persons list
    for (Person person: persons) {
      System.out.println(person);
    }

    System.out.println(persons.get(1));
  }
}