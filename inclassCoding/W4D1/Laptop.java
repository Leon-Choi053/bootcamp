package inclassCoding.W4D1;

import java.util.Objects;

public class Laptop extends Machine{

  // Laptop is subclass 實際存在(child), Machine is superclass 概念存在(parent)
  // Inherit Machine attribute ("double weight")
  // Inherit Mashine methods (start() and stop())
  Keyboard keyboard;
  Monitor monitor;
  private int volume;

    // superclass must call superclass constructor

  public Laptop(){
    // implicitly call superclass empty constructor
    // super(); // new Machine()
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
    // super(); + this.setWeight(weight);
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  @Override
  public boolean equals(Object o){
    if(this == o)
      return true;
    if(!(o instanceof Laptop))
      return false;
    Laptop laptop =(Laptop) o;
    return Objects.equals(laptop.keyboard, this.keyboard) && Objects.equals(laptop.monitor, this.monitor); 
  }

  @Override // Method Overriding
  public void start() {
    super.start(); // Machine Start ...
    System.out.println("Laptop start ...");
  }

  @Override // Method Overrrind
  public void stop() {
    System.out.println("Laptop stop ...");
  }

  public void mute() {
    this.volume = 0;
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

    Laptop laptop2 = new Laptop();
    laptop2.setWeight(10.0d);
    System.out.println(laptop2.getWeight());

    Laptop laptop3 = new Laptop();
    System.out.println(laptop3.getWeight());
    System.out.println(Machine.staticMethod("ABC", "def"));
    System.out.println(Laptop.staticMethod("abc", "def"));
    // laptop3.staticMethod("abc","def"); // not recommended

    
  }
}
