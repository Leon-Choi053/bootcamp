package inclassCoding.W4D4;

// 1. public class Direction extends Enum
// 2. enum is final class

// 全局唯一, 4 object (EAST, SOUTH, NORTH, WEST)
// new Direction('E')

public enum Direction { // special keyword since Java 1.5
  EAST('E', 90), 
  SOUTH('S', 180), 
  WEST('W', 270), 
  NORTH('N', 360)
  ;

  private char direction;
  private int degree;

  private Direction(char direction, int degree) {
    this.direction = direction;
    this.degree = degree;
  }

  public char getDirection() {
    return this.direction;
  }

  public int getDegree() {
    return this.degree;
  }

  public boolean isOpposive(Direction direction){
    return Math.abs(this.degree - direction.getDegree()) == 180;
  }

  public static void main(String[] args) {
    System.out.println(Direction.EAST.isOpposive(Direction.WEST));
    System.out.println(Direction.WEST.isOpposive(Direction.EAST));
    System.out.println(Direction.WEST.isOpposive(Direction.NORTH));

  }
}
