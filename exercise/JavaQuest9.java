/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    System.out.println(str.charAt(0));
    System.out.println(str.charAt(4));

    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    System.out.println(str.indexOf('t'));
    System.out.println(str.indexOf('e', 5));
    System.out.println(str.indexOf("LAB"));

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());

    // Use String replace() method
    // prints VenturenixLAB, Coding
    System.out.println(str.replace("Java", "Coding"));

    // int length()
    // prints 19
    System.out.println(str.length());

    // Use String substring(int start, int end)
    // prints "ren"
    System.out.println(str.substring(3, 6));

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    System.out.println(str.replace("e", "*").toUpperCase().replace(",", "").concat("!!!"));
  }
}