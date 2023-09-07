package inclassCoding.W6D5;

public class DemoSwitch {

  public static void main(String[] args) throws Exception {
    System.out.println(grade(90));
    Weekday weekday = Weekday.TUE;
    int result = switch (weekday) {
      case MON ->1;
      case TUE ->2;
      case WED ->3;
      case THU ->4;
      case FRI ->5;
      default -> 0;
    };
    System.out.println(result);

    // Approach 2
    int result2 = switch (weekday) {
      case MON,TUE: // condition is not allow in Java 17
        System.out.println("Mon or TUE");
        yield 1; // yield means "return" + break
      case WED:
        System.out.println("WED");
        yield 3; // yield means "return" + break
      case THU:
        System.out.println("THU");
        yield 4; // yield means "return" + break
      case FRI:
        System.out.println("FRI");
        yield 5; // yield means "return" + break
      // default -> 0;
    };
    System.out.println(result2);
  }

  public static int getDayNum(Weekday weekday) {
    switch (weekday) {
      case MON:
        return 1;
      case TUE:
        return 2;
      case WED:
        return 3;
      case THU:
        return 4;
      case FRI:
        return 5;
      default:
        return 0;
    }
  }

  public static char grade(int score) {
    char grade = ' ';
    switch (score) {
      case 90:
        grade = 'A';
        break;
      case 80:
        grade = 'B';
        break;
      default:
        grade = 'F';
    }
    return grade;
  }
}
