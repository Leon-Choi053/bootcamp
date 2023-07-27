/*
 * Question : Given two strings s and goal, return true if and only if s can become goal after N shifts on s.
 * 
 * Definition of a shift: Moving the leftmost character of s to the rightmost position.
 * 
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * 
 * Assume the input need to be lowercase English letters.
 */
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab")); // true
    System.out.println(rotateString("abcde", "abced")); // false
    System.out.println(rotateString("abcde", "eabcd")); // true
    System.out.println(rotateString("abcde", "abcde")); // true
  }

  public static boolean rotateString(String s, String goal) {
    int n = s.length();
    if (n != goal.length()) {
      return false;
    }
    if (n == 0) {
      return true;
    }
    int i = 0;
    while (i < n) {
      // Check if s and goal are equal after rotating s
      if (s.equals(goal)) {
        return true;
      }
      // Rotate s by moving the leftmost character to the rightmost position
      s = s.substring(1) + s.charAt(0);
      i++;
    }
    return false;
  }
}
