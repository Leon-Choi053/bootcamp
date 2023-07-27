/**
 * Expected Output: Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {

  private int carYear;
  private String carModel;

  public JavaQuest19(int carYear, String carModel) {
    this.carYear = carYear;
    this.carModel = carModel;
  }

  public void printCarDetails() {
    System.out.println("Car Year: " + carYear);
    System.out.println("Car Model: " + carModel);
  }

  public static void main(String[] args) {
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");
    myCar.printCarDetails();
  }
}
