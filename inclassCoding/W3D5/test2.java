package inclassCoding.W3D5;

class Password {
  public static int counter = 2;
  private String password;

  Password(String x) {
    this.password = x;
    counter++;
  }

  public void setPassword(String password) {
    this.password = password;
    counter--;
  }

}
