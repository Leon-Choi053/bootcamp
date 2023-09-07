/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 */
public class JavaQuest45 {
  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c"));
    System.out.println(backspaceCompare("ab##", "c#d#"));
    System.out.println(backspaceCompare("a#c", "b"));

  }

  public static boolean backspaceCompare(String s, String t) {
    return buildFinalString(s).equals(buildFinalString(t));
  }

  private static String buildFinalString(String str) {
    StringBuilder sb = new StringBuilder();

    for (char c : str.toCharArray()) {
      if (c != '#') {
        sb.append(c);
      } else if (sb.length() > 0) {
        sb.deleteCharAt(sb.length() - 1);
      }
    }

    return sb.toString();
  }
}
