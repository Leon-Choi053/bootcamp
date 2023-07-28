package inclassCoding.W3D4.shape;

import javax.print.attribute.standard.Sides;

public class Square {
  private final Side[] sides; // instance variable

  public Square() { // empty constructor
    this.sides = new Side[4];
    this.sides[0] = new Side(3.0d, "RED");
    this.sides[1] = new Side(3.0d, "YELLOW");
    this.sides[2] = new Side(3.0d, "BLACK");
    this.sides[3] = new Side(3.0d, "BLUE");
  }

  public Square(double length) {
    if (length <= 0.0)
      length = 1.0d;
    int id = 0;
    this.sides = new Side[4];
    this.sides[0] = new Side(++id, length, "RED");
    this.sides[1] = new Side(++id, length, "RED");
    this.sides[2] = new Side(++id, length, "RED");
    this.sides[3] = new Side(++id, length, "RED");
    // Side.resetId();
  }

  public Side getSide(int sideId) {
    return this.sides[sideId - 1];
  }

  // public static void resetId(){
  // sideCounter = 0;
  // }
  public void modify(double length) {
    this.getSides()[0].setLength(length);
    this.getSides()[1].setLength(length);
    this.getSides()[2].setLength(length);
    this.getSides()[3].setLength(length);
  }

  public void modify(String color) {
    this.getSides()[0].setColor(color);
    this.getSides()[1].setColor(color);
    this.getSides()[2].setColor(color);
    this.getSides()[3].setColor(color);
  }

  public void modify(int sideId, String color) {
    this.getSide(sideId).setColor(color);
  }

  public Side[] getSides() {
    return this.sides;
  }

  public static void main(String[] args) {
    Square s1 = new Square(10);
    Square s2 = new Square(4);
    Square s3 = new Square(5);


  }

  public static Square of(String string) {
    return null;
  }

  public static Square of(String string) {
    return null;
  }

  public static Square of(double d) {
    return null;
  }
}
