package inclassCoding.W5D5;

import java.util.ArrayList;

public class Box<T extends Number> {

  private ArrayList<T> numbers;

  private Box() {
    numbers = new ArrayList<>();
  }

  public Box(T number) {
    this(); // the empty constructor of Class Box
    numbers.add(number);
  }

  public ArrayList<T> getNumbers() {
    return this.numbers;
  }

  public void add(T number) {
    numbers.add(number);
  }

  public int size() {
    return numbers.size();
  }

  public static void main(String[] args) {
    // Box<String> box1 = new Box<>(); // falue
    Box<Integer> box1 = new Box<>(); // compile-time check
  }

}
