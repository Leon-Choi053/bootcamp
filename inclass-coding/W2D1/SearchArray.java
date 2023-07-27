import java.util.Arrays;

public class SearchArray {
  public static void main(String[] args) {
    // search
    char target = 'm';
    char[] chars = new char[] {'a', 'c', 'p', 'm', 'm', 'g'};
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == target) {
        System.out.println("found " + target + " at address " + i);
      }
    }

    // toCharArray()
    String str = "I am a man.";
    char[] arr = str.toCharArray(); // length counted
    System.out.println(Arrays.toString(arr));

    // find max. value in the array
    int[] nums = new int[] {240, 800, -23, 6, 98};
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
        System.out.println("the maximum value is: " + max);
      }
    }

    int[] nums2 = new int[] {240, 800, -23, 6, 98};
    int min = 0;
    for (int i = 0; i < nums2.length; i++){
      if (nums2[i] < min){
        min = nums2[i];
    System.out.println("the maximum value is: " + min);
      }
    }

    int[] nums3 = new int[] {1, 2, 3, 4, 5};
    int min2 = 999999;
    for (int i = 0; i < nums3.length; i++){
      if (nums3[i] < min2){
        min2 = nums3[i];
    System.out.println("the maximum value is: " + min2);
      }
    }
  }
}
