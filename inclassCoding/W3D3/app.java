package inclassCoding.W3D3;

import javax.print.DocFlavor.STRING;

public class app {
  public static void main(String[] args) {
    double[] arr = new double[] {-5.64, 5.23, 9.800, 6.55};
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += Math.round(Math.abs(arr[i]));
      // total = total + (int) Math.round(Math.abs(arr[i]));
    }
    System.out.println(total);

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {

    }


    int cubeLength = 3;
    double volume = Math.pow(cubeLength, 3);

    int[] bases = new int[] {2, 3, 4, 5};
    int[] index = new int[] {3, 4, 5, 6};
    int[] result = new int[bases.length];
    for (int i = 0; i < bases.length; i++) {
      result[i] = (int) Math.pow(bases[i], index[i]);

      StringBuilder s = new StringBuilder("hello"); // constructor
      // s -> address (reference)
      s.append("world"); // append() is faster then "+" in String
      System.out.println(s);
      System.out.println(s.toString()); // String -> "hello world"
      s.append(1.3f);
      System.out.println(s.toString());

      System.out.println(s.append(true).append(4000L).length());


    }
    String str = "  he llo ";
    String[] strs = str.trim().replace('h', 'e').split(" ");
    System.out.println(strs.length);

    StringBuilder s2 = new StringBuilder("start");
    // Approach 1
    System.out.println(s2.append('a').toString().charAt(3));
    // Approach 2
    StringBuilder s3 = s2.append('a');
    String s4 = s3.toString();
    s4.charAt(3); // r

    String s10 = "hello"; // how to insert a space between ll
    StringBuilder s11 = new StringBuilder("hello");
    s11.insert(3, ' ');
    System.out.println(s11);

    s11.insert(0, "world").append("world");
    System.out.println(s11);

    System.out.println(s11.deleteCharAt(3).toString());
    System.out.println(s11.append("abc"));

    Integer a = 10;
    System.out.println(a + 10);

    s11.setCharAt(4, 'j');
    System.out.println(s11.toString());


  }
}
