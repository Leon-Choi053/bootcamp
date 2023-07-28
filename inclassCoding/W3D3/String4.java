package inclassCoding.W3D3;

public class String4 {

  //String Literal Pool (Heap) = String 
  public static void main(String[] args) {
    String str = "abc";
    String str2 = "abc";
    System.out.println(str.equals(str2)); // true, "abc" is same as "abc"
    System.out.println(str == str2); // true, address same ???

    // String Literal Pool -> "abc"
    String str3 = "abcd";
    System.out.println(str.equals(str3)); // false
    System.out.println(str == str3); // false, their addresses are not same

    str = "abc123"; // because "abc123" is not equal to "abc" -> immutable
    System.out.println(str == str2); // false

    Integer a = 10;
    a = a + 20;
    // a = 30

    String temp = str;
    str = new String("abc100"); // new object
    System.out.println(temp == str); // same value but false


  }
}
