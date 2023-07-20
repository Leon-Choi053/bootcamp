public class WhileLoop {
  public static void main(String[] args) {
    // while
    int count = 0;
    while (count < 5) { // continue condition: true/ false
      count++;
    }
    System.out.println(count);
    // count = 5

    boolean isHoliday = false;
    int counter = 0;
    while (!isHoliday) {
      if (counter < 6) {
        counter++;
      }
      if (counter >= 6)
        isHoliday = true;
    }
    System.out.println(counter);

    int c = 0;
    int b = 10;
    while (c < 5 || b > 0) {
      System.out.println("hello");
      c++;
      b--;
    }

    // break, continue
    int k = 0;
    while (k < 6) {
      System.out.println("break: Hello");
      k++;
      if (k > 3) {
        break;
      }
    }

    //continue
    int j = 0;
    while (j<6){
      System.out.println("continue bye");
      j++;
      if (j>3){
        continue;
      }
      System.out.println("continue: hello");
    }
  }
}
