// Problem link: https://codingbat.com/prob/p112409


/*
  Statement:

  Given an array of ints length 3, return a new array with the elements in reverse order, 
  so {1, 2, 3} becomes {3, 2, 1}.


  reverse3([1, 2, 3]) → [3, 2, 1]
  reverse3([5, 11, 9]) → [9, 11, 5]
  reverse3([7, 0, 0]) → [0, 0, 7]
*/

import java.util.Arrays;  

public class ReverseArray {
  public static int[] reverse(int[] arr, int n) {
    // temporary array of same length
    int[] reversedArray = new int[n];

    for (int x = 0; x < n; x++) {
      // fill the temp array from the end with the current item of the main array
      reversedArray[n-x-1] = arr[x];
    }

    return reversedArray;
  }

  public static void main(String[] args) {
    int[] nums = {1,2,3};
    int n = nums.length;

    // ReverseArray array = new ReverseArray(nums, n);

    System.out.println("Before reverse: " + Arrays.toString(nums));
    int[] reversed = reverse(nums, n);
    System.out.println("After reverse: " + Arrays.toString(reversed));
  }
}