import java.util.Arrays;

public class maxEnd3 {
  public static int[] maxEnd(int[] nums) {
    int i, max;

    if (nums[0] > nums[nums.length - 1]) {
      max = nums[0];
    } else {
      max = nums[nums.length-1];
    }

    for (i=0; i < nums.length; i++) {
      nums[i] = max;
    }

    return nums;
  }
  public static void main(String[] args) {
    int[] solution = maxEnd(new int[] {1,2,3});

    System.out.println(Arrays.toString(solution));
  }  
}
