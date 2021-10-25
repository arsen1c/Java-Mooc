public class Part {
  private String identifier;
  private String manufacturer;
  private String description;

  // Default constructor
  public Part(String identifier, String manufacturer, String description) {
    this.identifier = identifier;
    this.manufacturer = manufacturer;
    this.description = description;
  }

  // Getters  
  public String getIdentifier() {
    return this.identifier;
  }

  public String getDescription() {
    return this.description;
  }

  public String getManufacturer() {
    return this.manufacturer;
  }

  public void about() {
    System.out.println("I am a part!");
  }
}