public class Primitives {
  public static void main(String[] args) {
    // correct Syntax
    // Upcasting (Implicit conversion)
    // byte -> short -> int -> long -> float -> double
    // char -> int
    byte b = 2;
    short s = b; // byte -> short, upcasting (promotion)
    int i = s;
    long l = i;
    float f = l;
    double d = f;
    // char -> int
    char c = 'A';
    int j = c;

    // Downcasting
    double d2 = 10.3d;
    // float f2 = d2; // why error? ans: double precision is langer than float
    float f2 = (float) d2; // developer take responsibility for the risky
    System.out.println(f2);;

    short s2 = 128;
    // byte b2 = s2; //error
    byte b2 = (byte) s2;
    System.out.println("b2 =" + b2); // -128

    // for (byte k = 127; k < 129; k++) {
    //   System.out.println("hello");
    // }

    //long[] arr = new long[(int) Long.MAX_VALUE];
    // int[] arr = new int[Integer.MAX_VALUE];
    // for (int n = 0; n < arr.length; n++) {
    // }

    char c2 ='B'; //66
    if (c2 == 'B') {
      System.out.println("c2 is B");
    }
    if (c2 == 66) {
      System.out.println("c2 is 66");
    }

    char c3 =67;
    if(c3 == 'C'){
      System.out.println("c3 is C");
    }

    //ASCII (int) tyo char
    int v = 'a';
    char o = (char) g; //downcasting
    char o2 = 66; //why? downcast

    //
    int h = (int) 1000L; // downcast, explicit conversion
    byte r = (byte) 9;

  }
}
