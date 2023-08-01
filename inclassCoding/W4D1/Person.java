package inclassCoding.W4D1;

public abstract class Person {
  private int age;
  private double height;

  public Person(){

  }

  public int getAge() {
    return this.age;
  }

  public double getHeight(){
    return this.height;
  }

  public void run(){
    System.out.println("I am running");
  }

  public abstract void sleep();
}
