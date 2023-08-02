package inclassCoding.W4D2;

import java.util.Objects;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Point)) {
      return false;
    }
    Point point = (Point) o;
    // return point.x == this.x && point.y == this.y;
    return Objects.equals(point.x, this.x) && Objects.equals(point.y, this.y);
  }

  public static void main(String[] args) {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1, 1);
    Point p3 = new Point(1, 2);
    System.out.println(p1 == p2);
    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));


    Long l = 1L; // 1, unbox -> primitive long
    int i = 1; // 1, auto-box -> Integer
    Point.print(10L); // long -> autobox -> Long
    Point.print(Long.valueOf("10")); // Long object
    // Point.print(10); // cannot convert int to Long, compile error
    Point.print((long) 10); // int -> long -> autobox -> Long

    if (Long.valueOf("100") < 101) {
      // convert Long 100 -> long 100
      // 101 -> int
    }

    if (Boolean.valueOf(false) == false) {
      // right: false -> boolean
      // left: Boolean false -> boolean false
      // boolean vs boolean
    }

    if (Boolean.valueOf(false).equals(false)) {
      // right: false -> boolean
      // left: Boolean false -> boolean false
      // boolean vs boolean
    }

    // unbox Long, and upcast int
    System.out.println(l == i); // true, finally long vs long
    // Big bug here
    System.out.println(Objects.equals(l, i)); // false
  }

  public static void print(Long l) {
    System.out.println("l=" + l);
  }
}
