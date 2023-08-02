package inclassCoding.W4D3;

public class Student extends Person implements Runnable, Swimable, Move{ // class signature

  private String name;

  private int score;

  @Override
  public void jump(){
    System.out.println("Student is jumpping");
  }

  @Override
  public void breath(){
    System.out.println("Student is breath");
  }

  @Override
  public void run() {
    System.out.println("Student is running");
  }

  @Override
  public void swim() {
    System.out.println("Student is swimming");
  }

  @Override
  public void left() {
  }

  @Override
  public void right() {
  }

  @Override
  public void up() {
    this.score +=1;
  }

  @Override
  public void down() {
  }

  public static void main(String[] args) {
    // MAX_SPEED
    System.out.println(Move.MAX_SPEED);

    Move move = new Student();
    move.up();
    move.down();
    move.left();
    move.right();
    
    Move dog = new Dog();
    dog.up();
    dog.down();
    dog.left();
    dog.right();

    Swimable swimable = new Student();
    swimable.swim();

    Person person = new Student();
    person.breath();
    person.getAge();
  }

}
