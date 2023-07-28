package inclassCoding.W2D1;

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

    String str = "I love programming, I love Java.";
    System.out.println(str.length());
    // for loop: Interation times, based on the length og the string.
    for (int i = 0; i < str.length(); i++) {
      System.out.println("Hello");
    }

    // print the index of the first occurrence of the character 'e'
    // str.charAt(int index)
    for (int i = 0; i < str.length(); ++i) {
      // str.charAt(i);
      // System.out.println(str.charAt());
    }

    // Quiz will have this!!!
    System.out.println(str.charAt(2));
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == 'e')
        ;
      System.out.println("index" + i);
      break;
    }

    // check if 'y' exists in the string
    // Found or Not Found
    boolean found = false;
    for (int i = 1; i < str.length(); ++i) {
      if (str.charAt(i) == 'y') {
        found = true;
        break;
      }
    }
    if (found == true) {
      System.out.println("found");
    } else {
      System.out.println("not found");
    }

    // if the number of occurrence of target >= 3, print yes
    char target = 'o';
    int count = 0;
    boolean found2 = false;
    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) == target) {
        count++;
      }
      // nice to have
      if (count >= 3) {
        found2 = true;
        break;
      }
    }
    if (found2) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
    System.out.println(count);
  }

}
