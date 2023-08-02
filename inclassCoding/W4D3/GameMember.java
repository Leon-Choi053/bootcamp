package inclassCoding.W4D3;

public abstract class GameMember {

  private int score;

  public int getScore() {
    return this.score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void addScore(int score) {
    this.score += score;
  }

  public abstract void up();

  public abstract void down();

  public abstract void left();

  public abstract void right();

  public static void upOnce(GameMember... members) { // multiple args
    for (GameMember member : members) {
      member.up(); // dog / cat objects
    }
  }

  public static void movepOnce(Move[] members) { // multiple args
    for (Move member : members) {
      member.jump(); // dog / cat objects
    }
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    GameMember.upOnce(new Dog(), new Cat());
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());

    Move[] members = new Move[] {dog, cat};
    GameMember.movepOnce(members);
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());
  }
}
