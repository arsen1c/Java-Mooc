import java.util.Scanner;

public class NumberOfLines {
  public static void numOfLines() {
    Scanner scanner = new Scanner(System.in);
    int counter = 0;

    System.out.println("Enter lines. \"end\" to stop: ");
    while(true) {
      String line = scanner.nextLine();

      if(line.equals("end")) {
        break;
      }

      counter++;
    }

    System.out.println("Total lines: " + counter);
    scanner.close();
  }
}