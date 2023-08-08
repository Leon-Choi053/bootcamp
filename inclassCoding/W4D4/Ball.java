package inclassCoding.W4D4;

import inclassCoding.W4D1.C;

public class Ball {
  private Color color; // String -> "RE D", "RED", "red", "R ED"

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Ball)) {
      return false;
    }
    Ball ball = (Ball) o;
    return this.color == ball.color; //
  }

  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);
    System.out.println(ball.getColor().name());

    // Object is topmost parent
    Object object = new Ball(Color.RED); // object is reference
    // Compile-time Class "Object" type check
    object.hashCode(); // reference presentation
    // Compile-time check if Object class has hashcode() method
    // Compile-time check if Ball class inherit Object

    // Run-time object variable stores an address, point to a Ball object in he
    // Run-time determine if Class Ball has hashcode()
    // If no, then invoke Class Object hashcode()
    // If yes, invoke the Class Ball hashcode()

    Color color = ((Ball) object.getColor());
    Class<?> clas = color.getClass();
    System.out.println(clas.getName());
    System.out.println(clas.toString());

    if (Color.BLUE instanceof Color) {
      System.out.println();
    }

    if(Color.BLUE.getClass() == Color.class) {
      System.out.println("Color.BLUE is instance of Color");
    }

    Object o = 1 - 'a';
    System.out.println(o.getClass().getName());
    Object o2 = 'b';
    System.out.println(o2.getClass().getName());
    Object o3 = new Ball(Color.GREEN);
    System.out.println(o3.getClass().getName());

    System.out.println(o3.getClass().isEnum());
    System.out.println(clas.isEnum());

  }
}
