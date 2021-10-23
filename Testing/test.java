import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    long start = System.nanoTime();
    System.out.println(findSmallest(new int[] {1,2,3,4}));
    long end = System.nanoTime();

    System.out.println("Total time take: " + (1.0 * (end - start) / 1000000));
  }

  public static int findSmallest(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    int smallest = arr[left];

    while(left < right) {
      if (arr[left] < smallest) {
        smallest = left;
      }

      if (arr[right] < smallest) {
        smallest = right;
      }

      left++;
      right--;

    }

    return smallest;
  }
}