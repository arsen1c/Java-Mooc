public class Person {
  private String name;
  private Integer age;
  private int weight;
  private int height;

  // Constructor Method
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.height = 0;
    this.weight = 0;
  }

  public void growOld() {
    this.age++;
  }

  // getters
  public String getName() {
    return this.name;
  }

  public int getAge(){
    return this.age;
  }


  // Setters
  public void setAge(int newAge) {
    this.age = newAge;
  }

  public void setHeight(int newHeight) {
    this.height = newHeight;
  }

  public void setWeight(int newWeight) {
    this.weight = newWeight;
  }

  public double bodyMassIndex() {
    double heightDivByHundred = this.height / 100.0;
    return this.weight / (heightDivByHundred * heightDivByHundred);
  }

  @Override
  public String toString() {
    return this.name + " age " + this.age + " years";
  }

}