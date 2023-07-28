package inclassCoding.W3D5;

class Quiz {
  public static void main(String[] args) {
    Password pl = new Password("ABC");
    Password p2 = new Password("ABC");
    Password p3 = new Password("BCD");
    p2.setPassword("password");
    Password.counter *= Password.counter;

    System.out.println(Password.counter);
  }

}
