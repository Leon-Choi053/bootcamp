package inclassCoding.W1D5;

public class ReverseString {
  public static void main(String[] args) {
    String str = "Hello";
    //output: olleh
    //str.charAt()
    //index
    String reverseStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
    reverseStr += str.charAt(i);
      }
    System.out.println(reverseStr);
  }
}
