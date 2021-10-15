public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    /*
      [+] Constructor Overloading [+]       

       - Our constructor sets the valaue of the instance variable "age" to 0.
       - We would also like to be able to create persons so that the constructor is provided
        both the age as well as the name a parameters
       - This is possible since a class may have multiple constructors.
  
        - The technique of having two (or more) constructors in a class is know as
          "Constructor Overloading".
        - A class can have multiple constructors that differ in the number and/or type of 
          thei parameters.

        - It's not, however, possible to have two construcotrs with the exact same parameters.
  
    */
    public Person(String name) {
        // this.name = name;
        // this.age = 0;
        // this.weight = 0;
        // this.height = 0;

        // Calling the 2nd constructor
        this(name, 0);
    }

    // overloading Person constructor
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
      this.weight = 0;
      this.height = 0;
    }

    /*
      - After doing the above, we cannot, for example, add

        public Person(String name, int weight) {} constructor

        since it would be impossible for java to differentiate between this and the one that
        has two parameters where int parameter is used for age.
    */

   
    public Person(int age) {
      this("Bella", age);
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    /*
        [+] Method Overloading [+]
         - Methods can be overloaded in the same way as constructors, i.e multiple versions of
          a give metho can be created. 
        - Once again, the parameters of the differnt versions must be different.

        - Lets make another version of the "growOlder" method that ages the person by
          the amount of years given to it a paremeter.
    */

    public void growOlder() {
        this.age++;
    }

    public void growOlder(int years) {
      this.age = this.age + years;
    }
    /*
        - Now A Perosn has two methods, both called "growOlder".
        - The one that gets executred depends on the number of parameters provided.
    */

    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    public String toString() {
        return this.name + " is " + this.age + " years old";
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
}