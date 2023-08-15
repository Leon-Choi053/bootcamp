package inclassCoding.W6D1;

public class DemoArrayIndexOutOfBoundsException {
  public static void main(String[] args) {
    int[] arr = new int[4];

    try {
      for (int i = 0; i <= arr.length; i++) {
        System.out.println(i);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException");
    }
  }
}
