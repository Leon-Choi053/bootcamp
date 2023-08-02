package inclassCoding.W4D3;

public class Dog extends GameMember implements Move {

  // int score = 0;
  String name;

  @Override
  public void jump() {
    super.addScore(3);
  }

  @Override
  public void left() {

  }

  @Override
  public void right() {
    System.out.println("Move right");
    super.addScore(2);
    // GameMember.up(this);
  }

  @Override
  public void up() {
    System.out.println("Moving up");
  }

  @Override
  public void down() {
  }
}
