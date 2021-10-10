import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // personTest();
    // itemsTest();
    // personalInfo();
    televisionProblem();
  }

  public static void personTest() {
    /*
      Output format:
        Grace Hopper, age 85 years
    */
    Scanner scanner = new Scanner(System.in);

    // a list meant for storing Person type object
    ArrayList<Person> persons = new ArrayList<>();

    // a new Person object
    Person arsenic = new Person("Arsenic", 20);

    // add Person object "arsenic" to the List
    persons.add(arsenic);

    // person object can also be created "in the same sentence" that they are added to the list
    persons.add(new Person("Matthew", 30));
    persons.add(new Person("Matrin", 25));

    // setting new age using "setAge" setter
    arsenic.setAge(20);

    // print all the person objects in the persons list
    for (Person person: persons) {
      System.out.println(person); // same as "person.toString()";
    }

    // [+] adding user-inputted objects to a list [+]

    while(true) {
      // get name from the user
      System.out.println("Enter a name, emtpy will stop: ");
      String name = scanner.nextLine();
      if (name.isEmpty()) {
        break;
      }

      // get age from the user
      System.out.println("Enter the age of " + name + ": ");
      int age = Integer.valueOf(scanner.nextLine());


      // add to the list a new person
      // whose name is the previous user input
      persons.add(new Person(name, age));
    }

    // Print the number of the entered persons, and their individual information
    System.out.println();
    System.out.println("Persons in total: " + persons.size());
    System.out.println("Persons: ");

    for (Person person: persons) {
        System.out.println(person);
    }

    scanner.close();
  }

  public static void personalInfo() {
    /*
      Output Format:
        Jean Bartik
        Betty Holberton
    */

    Scanner scanner = new Scanner(System.in);
    ArrayList<PersonalInformationCollection> persons = new ArrayList<PersonalInformationCollection>();

    // get new user from the input
    while(true) {
      System.out.println("Enter person details, e.g: Vec, 29 : ");
      String details = scanner.nextLine();
      if (details.isEmpty()) {
        break;
      }

      String[] parts = details.split(","); // Converts input -> ["Vec", "29"];
      String name = parts[0];
      String lastName = parts[1];
      int id = Integer.valueOf(parts[2]);

      persons.add(new PersonalInformationCollection(name, lastName, id));
    }

    for (PersonalInformationCollection person: persons) {
      System.out.println(person);
    }
    scanner.close();
  }

  public static void itemsTest() {
    /*
      Output format:
        Hammer (created at: 06.07.2018 12:34:56)
        Collar (created at: 06.07.2018 12:34:57)
    */
    Scanner scanner = new Scanner(System.in);
    ArrayList<Items> items = new ArrayList<Items>();

    while(true) {
      System.out.println("Add a new item: ");
      String item = scanner.nextLine();
      if (item.isEmpty()) {
        break;
      }

      items.add(new Items(item));
      
    }

    System.out.println("Name: ");
    for (Items item: items) {
      System.out.println(item);
    }

    scanner.close();
  }

  // Television Problem
  public static void televisionProblem() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<TelevisionProgram> programs = new ArrayList<TelevisionProgram>();

    while(true) {
      System.out.println("Enter show details, e.g: Ted, 139");
      String details = scanner.nextLine();

      if (details.isEmpty()) {
        break;
      }

      String[] parts = details.split(", ");
      String program = parts[0];
      int duration = Integer.valueOf(parts[1]);

      programs.add(new TelevisionProgram(program, duration));
    }

    // Get the duration limit
    System.out.print("Enter duration limit: ");
    int durationLimit = Integer.valueOf(scanner.nextLine());

    for (TelevisionProgram program: programs) {
      if (program.getDuration() <= durationLimit) {
        System.out.println(program);
      }
    }

    scanner.close();
  }
}