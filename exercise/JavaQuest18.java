/*
 * 
 * Question : Given an array of strings words, return the first palindromic(對稱) string in the array. If there is no such string, return an empty string "". A string is palindromic if it reads the same
 * forward and backward. words[i] consists only of lowercase English letters.
 */
public class JavaQuest18 {
  public static void main(String[] args) {
    String[] testCase1 = new String[] {"abc", "car", "ada", "racecar", "cool"};
    String[] testCase2 = new String[] {"notapalindrome", "racecar"};
    String[] testCase3 = new String[] {"ADABCCBADA", "car", "ada", "racecar"};
    String[] testCase4 = new String[] {"abc"};

    System.out.println(firstPalindrome(testCase1)); // Output : "ada"
    System.out.println(firstPalindrome(testCase2)); // Output : "racecar"
    System.out.println(firstPalindrome(testCase3)); // Output : "ADABCCBADA"
    System.out.println(firstPalindrome(testCase4)); // Output : "No Palindrome word in String Array."

  }

  private static boolean isPalindrome(String s) {
    // Check if a String is Palindrome
    int i = 0, j = s.length() - 1;
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public static String firstPalindrome(String[] words) {
    for (String word : words) {
      if (isPalindrome(word)) {
        return word;
      }
    }
    return "No Palindrome word in String Array.";
  }

}
