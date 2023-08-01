package inclassCoding.W4D1;

public class Machine {

  private double weight;

  public Machine(double weight) {
    this.weight = weight;
  }

  public Machine() {

  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void start() {
    System.out.println("Machine start...");
  }

  public void stop() {
    System.out.println("Mashine stop...");
  }

  public static String staticMethod(String x, String y) {
    return x + y;
  }

  public static Machine produce(int code) {
    switch (code) {
      case 1:
        return new Machine();
      case 2:
        return new Laptop();
    }
    return new Machine();
  }

  public static void stop(int code) {
    Machine machine = Machine.produce(code);
    machine.stop();
  }

  public static void main(String[] args) {
    int pockeyMoney = 100;
    boolean stopCondition = pockeyMoney < 0;
    
    if (stopCondition) {
      Machine.stop(1);
    }
  }
}
