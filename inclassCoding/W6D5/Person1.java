package inclassCoding.W6D5;

import inclassCoding.W6D5.Thread.TestInterface;

public record Person1<T>(T name, int age) implements TestInterface {
  // Immutable Object
  // final class, support Generics
  // Support Interface, but can not further extents (extents Object.class)
  // private final String name
  // private fianl int age;
  // All-args constructor ONLY
  // All getters
  // No Setters (final instance variable)
  // custom static method, static variable
  // custom constant
  // custom instance method
  // No other instance variable
  // Already @override equals(), hashcode(), toString()

  // int salary;

  static int counter = 0; // class variable

  static final int MAX_VALUE = 100; // constant

  static final int MIN_VALUE = 50; // constant

  public boolean isELDERLY(int age) {
    return age >= 65;
  }

  public static int add(int x, int y) {
    return x + y;
  }

  public void read() {

  }
}
