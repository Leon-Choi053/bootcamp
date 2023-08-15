package inclassCoding.W6D2;

public class Student {
  String name;
    // constuctor
    // getter, setter, static method & variable

    // method -> Bag.method, instance variable

  // Static nested class
  public static class Bag {
    int size;
    // constuctor
    // getter, setter, static method & variable
  }
  // Inner class (non-static nested class)

  public static void main(String[] args) {
    Student student = new Student();
    Student.Bag bag =  new Student.Bag();
  }
}
