public class JavaQuest14 {
  // Given an integer x, return true if x is a palindrome (迴文), and false otherwise.
  // Palindrome: it is same text, no matter you read it from left to right, or from right to left

  // Case 1: 13431
  // true

  // Case 2: -123
  // false

  // Case 3: 1
  // true

  // Case 4: 22
  // true

  // Case 5: 1231
  // false

  // Do not change anything in main method
  public static void main(String[] args) {
    boolean res = palindrome(13431); // true
    System.out.println(res);
    boolean res2 = palindrome(-121); // false
    System.out.println(res2);
    boolean res3 = palindrome(1); // true
    System.out.println(res3);
    boolean res4 = palindrome(22); // true
    System.out.println(res4);
    boolean res5 = palindrome(1231); // false
    System.out.println(res5);
  }

  public static boolean palindrome(int x) {
    if (x < 0) {
        return false;
    }
    String s = String.valueOf(x);
    int left = 0, right = s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

}
