package inclassCoding.W4D1;

public class Machine {
  
  private double weight;

  public Machine(double weight) {
    this.weight = weight;
  }

  public Machine(){

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

}
