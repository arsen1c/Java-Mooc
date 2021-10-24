import java.util.Scanner;

public class WaterMelon {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    int weight = scanner.nextInt();
    scanner.close();

    System.out.println(weight <= 2 || weight % 2 != 0 ? "NO" : "YES");
  
  }
}