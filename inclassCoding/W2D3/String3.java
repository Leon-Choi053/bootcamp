public class String3 {
  public static void main(String[] args) {
    // method signature =method name +parameter type & quantity

    // trim(), remove leading space and trail space
    String str = "hello ";
    String str2 = "  hel   lo  ";
    System.out.println("str.trim()=" + str.trim());
    System.out.println("str2.trim()=" + str2.trim());

    // startWith(), check if the string start with the target string
    if (str.startsWith("hel")) {
      System.out.println("The string starts with hel");
    }
    // endsWith(), check if the string ends with the target string
    boolean endsWithSpace = str.endsWith(" ");
    if (endsWithSpace) {
      System.out.println("the string ends with space");
    }

    // indexOf(char) or (int)
    System.out.println("the index of o in str=" + str.indexOf('o'));
    // indexOf(String)
    System.out.println("the index of o in str=" + str.indexOf("ll"));
    System.out.println("the index of o in str=" + str.indexOf("lll"));
    System.out.println("the index of o in str=" + str.indexOf('o', 5));
    System.out.println("the index of ll in str, search from index 3= "
        + str.indexOf(("ll"), 3));
    // lastIndexOf(int), the last ocurrence of the char/string in the string
    String str3 = "hello";
    System.out.println("the index of o in str=" + str3.lastIndexOf('l'));
    System.out.println("the index of o in str=" + str3.lastIndexOf("ll"));
    System.out.println("the index of o in str=" + str3.lastIndexOf('l', 3));

    // replace
    String s = "Java is a programming Language";
    System.out.println(s.replace("Java", "Python"));

    // equals(), equalsIgnoreCase()
    if ("hello".equals(str3)) {
      System.out.println("str3=hello");
    }
    if ("Hello".equals(str3)) { // false, sensitive checking
      System.out.println("str3=Hello");
    }
    if ("hello".equalsIgnoreCase(str3)) { // true, non sensitive checking
      System.out.println("non case sensitive checking");
    }
    if ("HELLO".equals(str3.toUpperCase())) {
      System.out.println("Alternative");
    }

    // concat(String), append something
    String newString = str3.concat(" Java!"); // add operation
    System.out.println("New String= " + newString);
    str3 = str3.concat(" Java?");
    System.out.println("str3=" + str3);

    // compareTo
    String a = "apple";
    String f = "facebook";
    System.out.println(a.compareTo(f)); //-5, 97-102 , 'a'-'f'
  }
}
