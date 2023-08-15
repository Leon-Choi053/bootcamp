  /*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Example 2:
Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 5000
0 <= nums[i] <= 5000 */

public class JavaQuest33 {
  public static void main(String[] args) {
    System.out.println(sortArrayByParity(new int[] { 0 }));
    System.out.println(sortArrayByParity(new int[] { 1, 2, 3, 4 }));// output [4,2,1,3] or [2,4,3,1]
    System.out.println(sortArrayByParity(new int[] { 111, 2, 309, 4 }));// output [4,2,309,111] or [2,4,111,309]
    System.out.println(sortArrayByParity(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 100 }));
    // output
    // [100,2,8,4,6,7,5,9,3,1]
    // or [2,4,6,8,100,1,3,5,7,9]

  }

  public static int[] sortArrayByParity(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
  
    while (left < right) {
      if (nums[left] % 2 != 0 && nums[right] % 2 == 0) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
      }
  
      if (nums[left] % 2 == 0) {
        left++;
      }
  
      if (nums[right] % 2 != 0) {
        right--;
      }
    }
  
    return nums;
  }
}
