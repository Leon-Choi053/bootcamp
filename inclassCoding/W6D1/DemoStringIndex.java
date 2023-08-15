package inclassCoding.W6D1;

public class DemoStringIndex {
  public static void main(String[] args) {
    try{
      // Integer.valueOf("abc"); // error
      "abc".charAt(3);
    } catch(StringIndexOutOfBoundsException e) {
      System.out.println("String index issue");
    }
  }
}
