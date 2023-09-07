package inclassCoding.W6D3;

public class MathDemo {

  public static int calculate(int i, int j, MathOperation fomula) {
    return fomula.operate(i, j);
  }

  public static void main(String[] args) {
    MathOperation add = (a, b) -> a + b;
    MathOperation substract = (x, y) -> x - y;
    MathOperation multiply = (x, y) -> x * y;
    MathOperation divide = (x, y) -> x / y;

    System.out.println(calculate(1, 3, add)); // 1+3=4
    System.out.println(calculate(10, 2, divide)); // 10/2=5
    System.out.println(calculate(10, 2, (x,y)->x*y)); // 10*2=20
  }
}
