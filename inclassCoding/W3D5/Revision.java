package inclassCoding.W3D5;



public class Revision {

// instance variable (non-static)
String name; // non-primitive -> address

public void print(String input){
  System.out.println("hello" + input + " " + this.name);
}

public static void print2(String input){
  System.out.println("hello " + input);
}
  public static void main(String[] args) {
    Revision r1 = new Revision();
    r1.name = "john";
    Revision r2 = new Revision();
    r2.name = "join";
    System.out.println(r1 == r2);
    System.out.println(r1.name == r2.name);

    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1 == s2);

    String s3 = new String("abc");
    System.out.println(s1 == s3);

    Integer i1 = 127;
    Integer i2 = 127;
    System.out.println(i1 == i2); // cache
    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4);

    String temp = s1;
    s1 += "d";
    System.out.println(temp == s1);
  }
}
