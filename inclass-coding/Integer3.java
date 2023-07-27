public class Integer3 {
  public static void main(String[] args) {
    Integer i1 = 100;
    Integer i2 = 200;
    System.out.println(i1 == i2); // value or address?

    Integer i3 = 127;
    Integer i4 = 127;
    if(i3 == 128) { // i3 -> int

    }
    System.out.println(i3 == i4); // address. true

    Integer i5 = -128;
    Integer i6 = -128;
    System.out.println(i5 == i6); // address. true

    Byte b1 = 127;
    // Byte b2 = new Byte(127); // destroy internal cache

    // short, long
    Short b2 = 32767;
    Short b3 = 32766;
    System.out.println(b2 == b3);

    Double c1 = 1.9d;
    Double c2 = 8.3d;
    Float f1 = 2.4f;
    Float f2 = 6.6f;
    Boolean d1 = false;
    Boolean d2 = false;
    System.out.println(d1==d2); //true, same address

    Character ch1 = 'a';
    Character ch2 = 'a';
    Character ch3 = 'Ϩ';
    Character ch4 = 'Ϩ';
    System.out.println(ch1 == ch2); // true, same address
    System.out.println(ch3 == ch4); // false

    Integer i7 = Integer.valueOf(127); // New Object
    Integer i8 = 127;
    System.out.println(i7 == i8); // true

    Integer i9 = Integer.valueOf(128);
    Integer i10 = 128;
    System.out.println(i9 == i10); // false
  }
}
