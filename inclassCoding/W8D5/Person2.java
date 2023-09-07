package inclassCoding.W8D5;

public class Person2 {
  private String name;


  public Person2(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Person(name = " + this.name + ")";
  }
}
