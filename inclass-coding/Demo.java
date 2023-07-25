public class Demo {
  public static void main(String[] args) {
    Car car = new Car();
    Car car2 = new Car(4, 7, "Red");
    // print car2
    System.out.println(car.getCapacity());
    System.out.println(car.getColor());
    System.out.println(car.getNoOfWheel());

    // car2
    car2.setColor("YELLOW"); // car2 -> object reference, storing the object address
    car.setColor("BLUE");
    System.out.println(car); // object reference storing the object address
    System.out.println(car2); // object reference storing the object address

    car2 = new Car(2, 5, "Black");

    int[] arr = new int[] {1, 3, 2};
    Integer sum = 0; // sum -> reference, an object contains
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }

    
    carFactory carFactory = new carFactory();
    carFactory.changecolor(car2, "white");
    System.out.println(car2.getColor());

    Person person = new Person(); // Constructor
    Computer computer = new Computer();
    String str = new String("Hello"); // str -> object reference
    System.out.println(str); // Hello
  }
}
