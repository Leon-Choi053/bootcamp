package inclassCoding.W4D3;

public class SmallDog extends Dog {

  @Override
  public void jump() { // this is contract from Class Dog
    super.addScore(5);
  }
  // jump()
  public static void main(String[] args) {
    SmallDog smallDog = new SmallDog();
    smallDog.jump();
    System.out.println(smallDog.getScore());
    smallDog.up();
    System.out.println(smallDog.getScore());
  }
}
