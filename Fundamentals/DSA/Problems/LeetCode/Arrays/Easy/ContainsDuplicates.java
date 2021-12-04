/* 
  Link: https://leetcode.com/problems/contains-duplicate/

  Given an integer array nums, return true if any value appears at least twice in the array, 
  and return false if every element is distinct.


  Example 1:
    Input: nums = [1,2,3,1]
    Output: true
  
  Example 2:
    Input: nums = [1,2,3,4]
    Output: false
  
  Example 3:
    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true

    */
import java.util.*;

public class ContainsDuplicates {
  public static boolean solution(int[] nums) {
    // new set of type Integer
    Set<Integer> set = new HashSet<>();
    // AutoBox the int type values to Integer and add to the set
    for (Integer val: nums) set.add(val);
    // check if size of the set is equal to length of original array
    return !(set.size() == nums.length);
  }
  public static void main(String[] args) {
    int[] nums = {1,2,3,1};
    System.out.println(solution(nums)); // prints true
  }
}
