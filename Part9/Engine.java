public class Engine extends Part {
  /*
    - This class definition "public class Engine extends Part" indicated that class
      "Engine" inherits the functionality of the class "Part".

    - Super keyword: calls the constructor of "Part" class.
    - Object variables defined in the superclass are initiated with their initial values.

    - "super" is kind of similar to "this".
    - "this" is used to call a constructor of this class, while "super" is used to call a constructor
      of the superclass.

    - If a constructor uses the constructor of the superclass by calling super in it, the "super" call
      must be on the first line of the constructor.


    [+] Access modifiers private, protected and public [+]
    - If a method or variable has the access modifier "private", it is visible only to the internal
      methods of that class. Subclass will not see it and they have no direct means to access it.
    - So, from the Engine class there is no way to directly access the variables
      identifier, manufacturer and description, which are defined in the superclass "Part".

    - A subclass sees everything that is defined with the "public" modifier in the superclass

    - If we want to define some variables or methods that are visible to the subclass but invisible
      to everything else, we can use the access modifier "protected" to achieve this.
  */ 

  private String engineType;

  public Engine(String engineType, String identifier, String manufacturer, String description) {
    // calling super();
    super(identifier, manufacturer, description);
    this.engineType = engineType;
  }

  public String getEngineType() {
    return this.engineType;
  }

  // Overriding the about method from the Part class
  public void about () {
    System.out.println("I am an Engine!");
  }
}