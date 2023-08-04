package inclassCoding.W4D4;

public class House extends Building{
  private double capacity;

  public House() {

  }

  public House(double capacity) {
    this.capacity = capacity;
  }

  public double getCapacity() {
    return this.capacity;
  }
  
  public void BuildingPrint() {
    System.out.println("I am print");
  }
  @Override
  public void print() {

  }
}
