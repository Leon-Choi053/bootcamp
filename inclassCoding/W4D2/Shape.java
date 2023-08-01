package inclassCoding.W4D2;

import java.math.BigDecimal;
import inclassCoding.W4D1.B;

public abstract class Shape {
  public abstract double area(); // area()

  public static void main(String[] args) {
    double total = 0.0d;
    BigDecimal b = BigDecimal.valueOf(total);
    b.add(BigDecimal.valueOf(5));
    System.out.println(b.doubleValue());
    // BigDecimal.valueOf(total).add(BigDecimal.valueOf(5));

    // Shapes area() example
    Circle10 circle = new Circle10(10.0d);
    Square10 square = new Square10(3.0d);
    Shape[] shapes = new Shape[] {circle, square}; 
    System.out.println(Shape.area(shapes));
  }

  public static double area(Shape[] shapes){
    BigDecimal total = BigDecimal.valueOf(0);
    for(Shape s : shapes){
      total = total.add(BigDecimal.valueOf(s.area()));
    }
    return total.doubleValue();
  }


}
