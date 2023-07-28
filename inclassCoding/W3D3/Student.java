package inclassCoding.W3D3;

public class Student {

  String firstName;
  String lastName;
  int age;

  // All-arguments constructors
  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String fullName() {
    return this.firstName.concat(this.lastName);
  }


  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getAge() {
    return this.age;
  }

  public boolean isAdult() {
    // if (this.age >= 18) {
    //    return true;
    // }
    // return false;
    // return this.age >= 18 ? true : false
    return this.age >= 18;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
