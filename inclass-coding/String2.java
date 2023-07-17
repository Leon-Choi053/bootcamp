public class String2 {
  public static void main(String[] args) {
    // length(), equals(), charAt()
    // isEmpty ->no wording no space is true
    String str = "Hello";
    System.out.println(str.isEmpty());
    String str2 = "";
    System.out.println(str2.isEmpty());
    String str3 = " ";
    System.out.println(str3.isEmpty());
    // isBlank() ->no wording no space & no wording but space is true
    System.out.println(str.isBlank());
    System.out.println(str2.isBlank());
    System.out.println(str3.isBlank());

    // toLowerCase(), toUpperCase()
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.toLowerCase().toUpperCase());
    if (str.toUpperCase().equals("HELLO")) {
      System.out.println("yes, it is HELLO");
    }

    // substring
    // (startIndex is normal)
    // (endIndex represents the position of (last character +1))
    // hello -> he
    System.out.println(str.substring(0, 2));
    System.out.println(str.substring(1));
    if (str.substring(3).equals("lo")) {
      System.out.println("yes, str.substring(3) = lo");
    }
    // substring(0, 1)
    // end index will -1 --> (0, 1(-1)) --> (0, 0) --> result = H

    // contains()
    String s = "lo";
    System.out.println(str.contains(s)); // true (hello contains lo)
    System.out.println(str.contains("ol")); // false (hello contains ol)
    if (str.contains("lo")) {
      System.out.println("str contains lo");
    }

    str = str.toUpperCase();
    System.out.println(str); // HELLO
    str += str.toLowerCase();
    System.out.println(str);

  }
}
