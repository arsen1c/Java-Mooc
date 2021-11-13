import java.util.Scanner;

/* 
  The problem is to read 100 numbers, get the average of these numbers, and find
the number of the items greater than the average. To be flexible for handling any number of
inputs, we will let the user enter the number of inputs, rather than fixing it to 100
*/

public class AnalyzeNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of its: ");
    int n = input.nextInt();
    double[] numbers = new double[n];
    double sum = 0;
  
    System.out.println("Enter the numbers: ");
    for (int i = 0; i < n; i++) {
      numbers[i] = input.nextDouble();
      sum += numbers[i];
    }

    input.close();

    double average = sum / 2;

    int count = 0; // the number of elements above average
    for (int i = 0; i < n; i++) {
      if (numbers[i] > average) count++;
    }
    
    System.out.println("Average is " + average);
    System.out.println("Numbers of elements above the average is: " + count);
  }  
}
