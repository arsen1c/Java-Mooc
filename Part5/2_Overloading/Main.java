import java.util.ArrayList;

// Link: https://java-programming.mooc.fi/part-5/2-method-and-constructor-overloading

class Main {
  public static void main(String[] args) {
    personClass();
    // productClass();
  }

  public static void personClass() {
    ArrayList<Person> persons = new ArrayList<Person>();

    persons.add(new Person("Arsenic", 20));
    persons.add(new Person("Eve"));
    persons.add(new Person(20));

    Person paul = new Person("Paul", 29);
    System.out.println(paul);

    

    for(Person person: persons) {
      System.out.println(person);
    }
  }

  public static void productClass() {
    ArrayList<Product> products = new ArrayList<Product>();

    products.add(new Product("Tape measure"));
    products.add(new Product("Plast", "home improvement ection"));
    products.add(new Product("Tyre", 5));

    for (Product product: products) {
      System.out.println(product);
    }
  }
}