package inclassCoding.W6D1;

public class Square extends Shape{
  int length;

  @Override
  public double area() {
    return Math.pow(this.length, length);
  }
  
}
