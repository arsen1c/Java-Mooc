import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
   int[] arr = {19, 2, 1, 10, 0};
   System.out.println("Before:" + Arrays.toString(arr));
   
   quickSort(arr, 0, arr.length-1);
   
   System.out.println("After:" + Arrays.toString(arr));
  }

  static int partition(int arr[], int begin, int end) {
    // Last element as PIVOT
    int pivot = arr[end];
    int i = begin - 1;

    for (int j = begin; j < end; j++) {
      // if current element is less than pivot element
      if (arr[j] <= pivot) {
        i++;

        // swap current element and pivot
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = temp;

    return i + 1;
  }

  static void quickSort(int arr[], int begin, int end) {
    if (begin <= end) {
      int pi = partition(arr, begin, end);
      
      quickSort(arr, begin, pi - 1);
      quickSort(arr, pi + 1, end);
    }
  }
}