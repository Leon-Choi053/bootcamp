public class methods {

  public static void main(String[] args) { // method name: main()
    String str = "hello";
    str = str + " world"; // append operation
    // approach 1
    System.out.println("Hello in main() method.");
    // approach 2
    print(); // print "Hello in print() method"

    // approach 1
    int x = 10;
    int y = 100;
    int m = x + y;
    // approach 2
    int z = sum(x, y);
    int i = sum(1000, -30);
    int j = sum(80, 30);

    // if (sum(1000, -30) == 970) {
      if (i == 970) {
    System.out.println(m + " " + z + " " + i + " " + j);
    System.out.println(m);
    }

    //call method2
    method2("hello ");
    method2("Github ");

    double circleArea = 5*5*pi();
    System.out.println("circle area=" + circleArea);
  }

  public static void print() { // method name: print()
    System.out.println("Hello in print() method.");
  }

  public static int sum(int x, int y) {
    // left int = reture type
    // the int inside the bracket are parameters
    int c = x + y;
    return c;
  }

  public static int substract(int x, int y) {
    return x - y; // execute x - y first, then return the result
  }

  public static void method2(String str) {
    System.out.print("string= " + str);
  }

  public static double pi() {
    return 3.14159256;
  }
}
