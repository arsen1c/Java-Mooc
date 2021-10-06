class Assignments {
  public static void main(String[] args) {
    // printSpaces(10);  
    // printSpaces(12);  
    printTriange(4);
  }

  public static void printTriange (int number) {
    for (int x = 1; x <= number; x++) {
      printSpaces(x);
    }
  }

  public static void printSpaces(int number) {
    for (int x = 0; x < number; x++) {
      System.out.print("*");
    }
    System.out.println("");
  }

}