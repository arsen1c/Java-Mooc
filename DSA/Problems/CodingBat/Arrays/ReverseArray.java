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
  protected int arrayLength;
  protected int[] arr = new int[arrayLength];
  
  public ReverseArray(int[] arr, int n) {
    this.arr = arr;
    this.arrayLength = n;
  }

  public int[] reverse() {
    int[] reversedArray = new int[this.arrayLength];

    for (int x = 0; x < this.arrayLength; x++) {
      reversedArray[this.arrayLength-x-1] = this.arr[x];
    }

    return reversedArray;
  }

  public String toString() {
    return Arrays.toString(this.arr);
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3};
    int n = arr.length;
    ReverseArray array = new ReverseArray(arr, n);

    System.out.println("Before reverse: " + array);
    int[] reversed = array.reverse();
    System.out.println("After reverse: " + Arrays.toString(reversed));
  }
}