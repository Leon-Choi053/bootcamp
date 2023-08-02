package inclassCoding.W4D3;

public interface Move {

  // Constant
  static final int MAX_SPEED = 10; // public

  // Java -> Camlcase
  // "noOfDay "

  // Behavior
  void left(); // public abstract
  void right(); // public abstract
  void up(); // public abstract
  void down(); // public abstract

  void jump();

}
