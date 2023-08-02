package inclassCoding.W4D3;

public class Cat extends GameMember implements Move {

  int score = 0;
  String name;

  @Override
  public void jump() {
    super.addScore(4);
  }

  @Override
  public void left() {

  }

  @Override
  public void right() {
    System.out.println("Move right");
    super.addScore(1);
  }

  @Override
  public void up() {
    System.out.println("Moving up");
    this.score += 2;
  }

  @Override
  public void down() {
  }
  
}
