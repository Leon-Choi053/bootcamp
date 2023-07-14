public class loop2 {
  public static void main(String[] args) {
    // break
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("i=" + i + " " + "j=" + j);
        if (i == j) {
          break; // this just break inner loop
        }
      }
      // break action here
    }

    // continue
    for (int a = 0; a < 6; a++) {
      for (int j = 0; j < 3; j++) {
        if (a == j) {
          continue; // skip the rest in inner loop, go to next iteration
        }
        System.out.println("a=" + a + " " + "j=" + j);
        // a = 0,j = 1
      }
    }

    String str = "I love programming, I love Java";
    System.out.println(str.length());
    // for loop: Interation times, based on the length og the string.
    for(int i=0;i<str.length();i++){
      System.out.println("the number of length = ");
    }

  }

}
