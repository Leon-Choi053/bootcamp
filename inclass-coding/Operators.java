public class Operators {
  public static void main(String[] args) {
    int x = 10 + 5;
    System.out.println(x);
    int y = 10 - 5;
    System.out.println(y);
    int z = 10 * 5;
    System.out.println(z);
    int a = 10 / 5;
    System.out.println(a);
    int reminder = 10 % 4; // % = 搵餘數
    System.out.println("The reminder is " + reminder);

    int b = 1;
    b = b + 1;
    b = b - 2;
    int c = 10 / 5;
    c = c * 3 + 5;
    System.out.println("a append b = " + b + c);

    int d = 1;
    d = d + 1;
    d++;
    ++d;
    d += 1; // ++d & d++ & d+= 1 are the same, mean d + 1
    System.out.println("d=" + d);

    // shift+ctrl+f can rejust the format
    int e = 10;
    e = e - 1;
    e--;
    --e;
    e -= 1; // --e & e-- & e-= 1 are the same, mean e - 1
    System.out.println("e=" + e);

    int f = 9;
    f = f * 3;
    f *= 3;
    System.out.println("f=" + f);

    int g = 8;
    g = g / 2;
    g /= 2;
    System.out.println("g=" + g);

    int integer = 14 % 5;
    int integer2 = 14;
    integer2 %= 5;
    System.out.println("integer = " + integer + " integer2 =" + integer2);

    // ++,--
    int h = 3;
    h++;
    int preIncrement = ++h; // +1 first, assigment later
    System.out.println("preIncrement=" + preIncrement);
    int postIncrement = h++; // assigment first, +1 later
    System.out.println("postIncrement=" + postIncrement);
    System.out.println("h=" + h);

    int i = 3;
    i--;
    int preIncrements = --i; // -1 first, assigment later
    System.out.println("preIncrements=" + preIncrements);
    int postIncrements = i--; // assigment first, -1 later
    System.out.println("postIncrements=" + postIncrements);
    System.out.println("i=" + i);

    // String +=
    String str = "hello ";
    str += "world!";
    System.out.println(str);

  }
}
