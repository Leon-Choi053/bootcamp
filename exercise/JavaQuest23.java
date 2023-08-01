/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    int n = s.length();
    String a = s.substring(0, n / 2);
    String b = s.substring(n / 2);

    char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    int countA = countVowels(a, vowels);
    int countB = countVowels(b, vowels);

    return countA == countB;
  }

  private static int countVowels(String s, char[] vowels) {
    int count = 0;
    for (char c : s.toCharArray()) {
      for (char vowel : vowels) {
        if (c == vowel) {
          count++;
          break;
        }
      }
    }
    return count;
  }
}
