class Main {
  public static void main(String[] args) {
    // Part and Engine classes
    Part part = new Part("abc", "Audi", "Hybrid");
    Engine engine = new Engine("combustion", "hz", "volkswagen", "VW Golf");

    System.out.println(engine.getIdentifier());
    System.out.println(engine.getEngineType());
    
    part.about(); // I am a part
    engine.about(); // I am an engine

    // Superclass and Subclass
    SuperClass sup = new SuperClass();
    SubClass sub = new SubClass();

    System.out.println(sup); // Example
    System.out.println(sub); // SubClass \n And let's add my own...

  }
}