import java.util.Scanner;

// Problem link: https://codeforces.com/problemset/problem/71/A

public class TooLong {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < n; i++) {
      String word = scanner.nextLine();

      if (word.length() > 10) {
        String shortWord = word.substring(0,1) + word.substring(1, word.length() - 1).length() + word.substring(word.length()-1);
        System.out.println(shortWord);
      } else {
        System.out.println(word);
      }
    }

    scanner.close();
  }
}