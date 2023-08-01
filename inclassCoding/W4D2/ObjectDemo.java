package inclassCoding.W4D2;

public class ObjectDemo {
  // rule 1: All class extends Bject implicitly
  String name = "hello";

  @Override
  public String toString() {
    return this.name;
  }

  public static void main(String[] args) {
    // Example 1: ObjectDemo extends Object
    ObjectDemo objectDemo = new ObjectDemo();
    objectDemo.hashCode(); // another presentation of object reference
    // because hash code has a short range of value storage
    // so, it cannot store all memory address(object reference) in your machine

    int[] arr = new int[] {1, 2, 3};
    System.out.println(arr.toString());

    String str = "abc";
    System.out.println(str);

    System.out.println(objectDemo);
    System.out.println(objectDemo.toString());

    System.out.println("abc hashcode()=" + str.hashCode());
    System.out.println(97 * (int) Math.pow(31, 2) + 98 * 31 + 99);

    Integer i1 = 3;
    System.out.println(i1.hashCode());
    Long l1 =100L;
    System.out.println(l1.hashCode()); // overflow

    ObjectDemo a = new ObjectDemo();
    ObjectDemo b = new ObjectDemo();
    System.out.println(a);
    System.out.println(b);
    if (a == b) { // address

    }

    Object obj = new String("abc");
    Shape shape = new Circle10(5.0d);
    System.out.println(obj instanceof String);
    obj = Long.valueOf(10);
    System.out.println(obj instanceof String); // true
    System.out.println(obj instanceof Long); // true

    Integer int1 = Integer.valueOf(100);
    System.out.println(int1 instanceof Number);
    Double d1 = Double.valueOf(100);
    System.out.println(d1 instanceof Number);

    // Primitives, for comparsion, we use ==

    // Wrapper Class, for comparsion, we use equals
    Integer j1 = 128;
    Integer j2 = 128;
    System.out.println(j1.equals(j2));
    j1 = 127;
    j2 = 127;
    System.out.println(j1.equals(j2));
    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1.equals(bool2));

    System.out.println(bool1.equals(false));
  }

}
