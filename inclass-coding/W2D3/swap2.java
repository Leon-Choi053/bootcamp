import java.util.Arrays;

public class swap2 {
  public static void main(String[] args) {
    int[] nums = new int[] {8, 3, -10, 30, 100, -19};
    // Move the max num to the tail
    // {8,3,-10,30,-19,100}
    int swap = 0;
    for (int i = 0; i < nums.length; i++) {
       if (nums[i] > nums[swap]) {
         swap = i; // store the value
       }
    }
    // nums[nums.length - 1] = nums[nums.length - 1] + nums[swap];
    // nums[swap] = nums[nums.length - 1] - nums[swap];
    // nums[nums.length - 1] = nums[nums.length - 1] - nums[swap];
    int temp = nums[swap];
    nums[swap] = nums[nums.length - 1];
    nums[nums.length - 1] = temp;
    System.out.println(Arrays.toString(nums));

    // test average(int[])
    int[] testCase = new int[] {2, 3, 0};
    System.out.println(average(testCase));

  }

  public static double average(int[] arr) {
    // calculate the average of all numbers in arr.
    int sum = 0;
    for (int i = 0; i < arr.length; ++i) {
      sum += arr[i];
    }
    // return sum / arr.length; // 5 / 3 -> 1 -> 1.0
    return (double)sum / arr.length; // int / int
  }
}
