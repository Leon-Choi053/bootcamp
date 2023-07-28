package inclassCoding.W3D4.shape;

public class Side {

  private int id;
  private double length;
  private String color; 
  private static int counter;

  public Side(int id, double length, String color) {
    this.id = ++counter;
    this.length = length;
    this.color = color;
  }

  public static void resetId() {
   counter = 0;
  }

  public void setLength(double length){
     this.length = length;
  }

  public void setColor(String color){
     this.color = color;
  }

  public String getColor(){
     return this.color;
  }

}
