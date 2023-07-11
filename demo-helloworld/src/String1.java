public class String1 {
  public static void main(String[] args) {
    String str =
        "I am crazy and I am about to said and you are really stuidbut";
    str = str + ".";
    System.out.println(str); // output: I am crazy and I am about to said.

    // method
    int i = str.length();
    System.out.println("i=" + i);

    System.out.println("Hello".length());

    String str0 = "abc";
    String str1 = "abc";
    String str2 = "abcd";
    boolean areTheyEqual = str1.equals(str0); // ture
    boolean areTheyEqual2 = str1.equals(str2); // false
    boolean a4 = str0.equals(str1 + "d"); // false
    System.out.println(a4);

    // chatAt(2), find the char at index 2 of the string
    String str4 = "Helloworld!";
    // index 0 of the str4 -> 'h'
    // index 4 of the str4 -> 'o'
    System.out.println(str4.charAt(2));
    System.out.println(str4.charAt(20));
  }
}
