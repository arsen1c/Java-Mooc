public class Product {
  private String name;
  private String location;
  private int weight;

  public Product(String name) {
    this(name, "Shelf");
  }

  public Product(String name, String location) {
    this.name = name;
    this.location = location;
    this.weight = 1;
  }

  public Product(String name, int weight) {
    this(name);
    this.weight = weight;
  }

  public String toString() {
    return name + " (" + this.weight + " kg) can be found from the " + this.location;
  }
}