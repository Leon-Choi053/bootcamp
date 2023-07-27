package shape;

public class Circle {
  private int id;
  private double radius;
  // static -> shared variable
  // final -> one time initialization ONLY
  private static final double pi = 3.14159;

  private static int counter;

  public Circle(){
    this.id++;
    AddCounrt();
  }

  public int getID(){
    return this.id;
  }

  public static void AddCounrt(){
    counter++;
  }

  public double area() {
    return Math.pow(this.radius, 2) * pi;
  }

  public double circumference() {
    return 2 * radius * pi;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }


  public static void main(String[] args) {
    Circle c = new Circle(); // Constructor
    // circle.radius = 1;
    // circle.radius = 2;
    c.setRadius(2);
    c.area();
    c.circumference();
    Circle c2 = new Circle(); // Constructor
    // circle.radius = 1;
    // circle.radius = 2;
    c.setRadius(6);
    c.area();
    c.circumference();
  }
}
