package inclassCoding.W1D3;

public class LogicOperator {
  public static void main(String[] args) {
    boolean isExpensive = true;
    boolean isWorthToBuy = false;
    boolean result = isExpensive && isWorthToBuy;
    System.out.println(result);
    // t, t = t
    // t, f = f
    // f, t = f
    // f, f = f

    // || Operator = Or
    // t, t = t
    // t, f = t
    // f, t = t
    // f, f = f
    boolean result2 = isExpensive || isWorthToBuy;
    System.out.println(result2);

    int a = 5;
    int b = 10;
    int c = 13;
    boolean result3 = a > 6 && b < 12;
    // Logical Operator
    boolean result4 = c < 15 || a > 6 && b < 12;
    boolean result5 = c < 15 || (a > 6 && b < 12);
    boolean result6 = a < 6 || b > 9 && c < 9;
    System.out.println(result3 + " " + result4 + " " + result5 + " " + result6);
    // ==, >=, <=, !=
    // == mean asking if a equals b? ->true/false
    // = mean assigment -> a = ?
    boolean result7 = a == b;
    boolean result8 = a >= 5;
    boolean result9 = c <= 13;
    boolean result10 = c != 13;
    System.out.println("==, >=, <=, != result is " + result7 + " " + result8
        + " " + result9 + " " + result10);
    // ! -> not
    boolean result11 = !(c < 13); // asking if the event of (c < 13) is false
    System.out
        .println("asking if the event of (c < 13) is false or not, result is "
            + result11);
    boolean result12 = !(b == 9) && c != 13; // ture && false -> false
    System.out.println(result12);

    // Operator Precedence
    int result13 = (1 + 9) * 3;
    int result14 = ++result13 + 1;
    System.out.println(result13 + " " + result14);

    int i = 27;
    int result15 = i++ + 1; // i++ is not related to result15, just use 27+1
    System.out.println(result15 + " " + i);

    boolean result16 = 25 + 2 < result15 + 1;
    System.out.println(result16);

    //
    int x = 5;
    int y = 10;
    int z = x += 3 * y;
    System.out.println(z); // first: y*3=30, second:30+x=35

    int result17 = (x++ + 2) * x++;
    System.out.println(result17);
    System.out.println(x);
  }
}
