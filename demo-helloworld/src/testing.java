import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class testing {
  // Given an array of integers nums and an integer target, return the index of
  // the two numbers such that they add up to target.

  // You may assume that each input would have exactly one solution OR no
  // solution, and you may not use the same element twice.

  // If no solution, return [-1, -1]

  // You can return the answer in any order.

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] answers = twoSum(new int[] {2, 7, 11, 15}, 9);
    int[] answers2 = twoSum(new int[] {3, 2, 4}, 6);
    int[] answers3 = twoSum(new int[] {3, 3}, 7);

    System.out.println(Arrays.toString(answers));
    System.out.println(Arrays.toString(answers2));
    System.out.println(Arrays.toString(answers3));
  }

  // Code a method here to return an array of two numbers that sum up to the
  // target
  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {-1, -1};
  }
}

