package inclassCoding.W4D1;

public class Laptop extends Machine{

  // Laptop is subclass 實際存在(child), Machine is superclass 概念存在(parent)
  // Inherit Machine attribute ("double weight")
  // Inherit Mashine methods (start() and stop())
  
  Keyboard keyboard;
  Monitor monitor;

    // superclass must call superclass constructor

  public Laptop(){
    // implicitly call superclass empty constructor
  }

  public Laptop(Keyboard keyborad, Monitor monitor) {
    // implicitly call superclass empty constructor
    this.keyboard = keyborad;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton, double length, double width) {
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor) {
    super(weight); // new Machine(5);
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  @Override
  public void start() {
    System.out.println("Laptop start ...");
  }

  @Override // Method Overrrind
  public void stop() {
    System.out.println("Laptop stop ...");
  }

  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    laptop.setWeight(3.0d);
    laptop.getWeight(); 
    System.out.println(laptop.getWeight());
    laptop.start(); // Laptop Start ...
    laptop.stop(); // Laptop Stop ...

    Machine machine = new Machine();
    machine.setWeight(5.0d);
    System.out.println(machine.getWeight());
    machine.start(); // Machine Start ... 
    machine.stop(); // Machine Stop ...
  }
}
