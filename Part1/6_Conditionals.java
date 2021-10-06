class Conditionals {
  public static void fizzBuzz(int number) {
    for(int x = 1; x <= number; x++) {
      if (x % 3 == 0 && x % 5 == 0) {
        System.out.println("fizzBuzz");
      } 

      if (x % 3 == 0) {
        System.out.println("fizz");
      } else if (x % 5 == 0) {
        System.out.println("buzz");
      } else {
        System.out.println(x);
      }
    }
  }

  public static void main(String[] args) {
    // System.out.println("Args: " + args);
    
    // Fizz buzz
    fizzBuzz(10);
  }
}