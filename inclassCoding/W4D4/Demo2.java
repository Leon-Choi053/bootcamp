package inclassCoding.W4D4;

public class Demo2 {
  public static void main(String[] args) {
    Building building = new House();
    // Copile-time checks
    // building.getCapacity(); // compile error
    building.print(); // compile-time confirm you can call print() method
    // Run-time decide which print() iws going to call
    // So, "building" variable call House's print() method
    building.print2(); // I am House

    building.print3();

    House house = new House();
    house.print("hello");
    house.print();
    House house2 = new House(3.0d);
    house2.print("hello");
    house2.print();
    // house2.print(3L);

    long l1 = Long.valueOf(1L);
    Long l3 = 3L;
    long l2 = 2;
    int i2 = (int)3L;
    Object obj = new Container();
    if(obj instanceof Container) {
      Cube cube = (Cube) obj;
      System.out.println("obj instance of Cube");
    }

    Object obj2 = new Cube();
    if(obj2 instanceof Container) {
      Container container = (Container) obj2;
      System.out.println("obj2 instance of Cube");
    }

    Container obj3 = new Clone();
    Cube cube2 = (Cube) obj3;

    Number num = Integer.valueOf(3);
    Double d1 = (Double) number;

    System.out.println(Direction.EAST.ordinal());
    System.out.println(Direction.SOUTH.ordinal());

    System.out.println(east.getDegree());
    System.out.println(east.getDirection());
  }
}

