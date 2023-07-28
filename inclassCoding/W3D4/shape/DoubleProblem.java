package inclassCoding.W3D4.shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblem {
  public static void main(String[] args) {
    double result = 0.1 + 0.2;
    System.out.println(result);

    if (result == 0.3) {
      System.out.println("reslut = 0.3");
    } else {
      System.out.println("result != 0.3");
    }

    System.out.println(0.3 / 0.1);
    System.out.println(0.2 * 0.1);

    BigDecimal b = new BigDecimal(5.0);
    BigDecimal b2 = BigDecimal.valueOf(4);
    // BigDecimal b3 = 5.0; //Not ok
    Double d = 5.0d;

    System.out.println(b.multiply(b)); // 25
    System.out.println(b.subtract(b2)); // 25 - 4 -> 21
    System.out.println(b.add(b2)); // 21 + 21 = 42
    System.out.println(b.divide(b));
    System.out.println(b.add(new BigDecimal(7))); // 5 + 7 = 12

    System.out.println(b.compareTo(b2)); // b = 5, b2 = 4, b > b2 result 1
    System.out.println(b2.compareTo(b)); // b = 5, b2 = 4, b2 > b result -1
    System.out.println(b.compareTo(BigDecimal.valueOf(5))); // 0

    BigDecimal b3 = BigDecimal.valueOf(3.456);
    System.out.println(b3.setScale(2, RoundingMode.HALF_UP));
    System.out.println(b3.setScale(2, RoundingMode.HALF_DOWN));

    System.out.println(b.equals(b2));

    BigDecimal b4 = BigDecimal.valueOf(5);
    System.out.println(b.equals(b4));
    System.out.println(b == b4);

    System.out.println(b4.remainder(BigDecimal.valueOf(3)));
  }
}
