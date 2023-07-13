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
    // break

    // continue
    for (int i = 0; i < 6; i++) {
      System.out.println("Halo!");
      if (i > 3) {
        continue;
      }
      System.out.println("bye!!");
    }
    // i = 0, hello, bye
    // i = 1, hello, bye
    // i = 2, hello, bye
    // i = 3, hello, bye
    // i = 4, hello
    // i = 5, hello
    // i = 6, exit

    for (int i = 0; i > 8; i++) {
      if (i % 2 == 0) {
        System.out.println("i=" + i);
      }
      if (i % 3 == 0) {
        System.out.println("i=" + i);
      }
    }
    // if(i % 3 == 0) {
    // System.out.println("i=" + i);
    // System.out.println("hello")
    // }

    // Nested Loop
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("hello" + i + j);
      }
      // i=0, j=0, hello
      // i=0, j=1, hello
      // i=0, j=2, hello
      // i=0, j=3, exit
      // i=1, j=0, hello
      // i=1, j=1, hello
      // i=1, j=2, hello
      // i=1, j=3, exit
      // i=2, j=0, hello
      // i=2, j=1, hello
      // i=2, j=2, hello
      // i=2, j=3, exit
      // i=3, j=0, hello
      // i=3, j=1, hello
      // i=3, j=2, hello
      // i=3, j=3, exit
      // i=4, j=0, hello
      // i=4, j=1, hello
      // i=4, j=2, hello
      // i=4, j=3, exit
    }

    for (int i = 0; i < 5; i++) {
      System.out.print("*");
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    // i=0 -> 符合條件 -> print * -> i=1
    //
  }
}
