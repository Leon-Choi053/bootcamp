package shape;

public class Square {
  private Side[] sides; // instance variable

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
    this.sides = new Side[4];
    this.sides[0] = new Side(length, "RED");
    this.sides[1] = new Side(length, "RED");
    this.sides[2] = new Side(length, "RED");
    this.sides[3] = new Side(length, "RED");
  }

  public Side[] getSides(){
    return this.sides;
  }


  public static void main(String[] args) {
    Square s1 = new Square(10);
    Square s2 = new Square(4);
    Square s3 = new Square(5);

    // s1 -> sides[0] color -> YELLOW
    s1.getSides()[0].setColor("YELLOW");
    System.out.println(s1.getSides()[0].getColor());
  }
}
