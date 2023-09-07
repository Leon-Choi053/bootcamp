package inclassCoding.W6D4;

public class Department {
  String name;
  private String department;


  public Department(String name) {
    this.name= name;
  }

  @Override
  public String toString() {
    return "Dept[" + "name=" + this.name + "dept=" + this.department+ "]";
  }
}
