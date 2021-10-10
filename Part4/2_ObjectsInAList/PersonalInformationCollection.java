public class PersonalInformationCollection {
  private String name;
  private String lastName;
  private int id;

  public PersonalInformationCollection(String name, String lastName, int id) {
    this.name = name;
    this.lastName = lastName;
    this.id = id;
  }

  public String toString() {
    return name + " " + lastName;
  }
} 