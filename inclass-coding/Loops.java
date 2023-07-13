public class Loops {
  public static void main(String[] args) {
    // for loop
    // int a = 0;
    // a++;
    // ++a;
    for (int i = 0; i < 4; ++i) {
      System.out.println("i=" + i + ", Hello");
      // Logic flow:
      // i = 0 -> 0 < 4, print 1st Hello
      // ++1 -> i = 1 -> 2 < 4,print 2nd Hello
      // ++1 -> i = 2 -> 3 < 4,print 3rd Hello
      // ++1 -> i = 3 -> 4 < 4,print 4th Hello
      // ++1 -> i = 4 -> 4 is NOT smaller than 4, exit loop
    }

    for (int j = 6; j > 0; j--) {
      System.out.println("j=" + j); // 6 times
    }

    for (int i = 0; i >= 3; i++) {
      System.out.println("i=" + i);
    }

    int max = 11;
    int total = 0;
    for (int i = 0; i < max; ++i) {
      total += i;
      System.out.println(total);
    }

    int sum = 0;
    for (int i = 0; i < 10; i++) {
      // odd numbers
      if (i % 2 == 1) {
        sum += i;
      }
    }
    System.out.println("the result is " + sum);

    int sum1 = 0;
    int sumOddNumberWithout5 = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) {
        sum1 += i;
      }
      if (i % 2 == 1 && i != 5) {
        sumOddNumberWithout5 += i;
      }
    }
    System.out.println("the sum1 reusult is " + sum1
        + "the sum num without 5 result is " + sumOddNumberWithout5);

    for (int i = 0; i < 10; ++i) {
      System.out.println("Hello");
      if (i > 3) {
        break;
      }
      if (i > 8) {
        break;
      }
    }
    // i = 0, hello
    // i = 1, hello
    // i = 2, hello
    // i = 3, hello
    // break;


  }
}
