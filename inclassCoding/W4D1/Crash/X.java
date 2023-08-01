package inclassCoding.W4D1.Crash;

public class X extends Y{

  private String name;

  public X() {

  }

  public X(String name) {
    super("john");
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getParentName() {
    return super.getName();
  }

public static void main(String[] args) {
    X x = new X("Peter");
    System.out.println(x.getName()); 
    System.out.println(x.getParentName());

    // Hiding
    Y y = new X("Peter");
    y.staticMethod();
    Y.staticMethod();
    X.staticMethod();
    System.out.println(y.getName());
    
  
  }
  
}
