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
    System.out.println(m + " " + z + " " + i + " " + j);

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
}
