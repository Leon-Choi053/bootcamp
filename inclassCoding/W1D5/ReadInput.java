package inclassCoding.W1D5;

import java.util.Scanner;

public class ReadInput {
  public static void main(String[] args) {
    String str = "Hello";
    str.charAt(0); // H
    System.out.println(str.charAt(0));
    // Scanner --> read user input
    System.out.println("please input an integer: ");
    Scanner s = new Scanner(System.in);
    int input = s.nextInt();// read user input, expecting it is an integent
    System.out.println("input = " + input);

    for (int i = 0; i < input; i++) {
      System.out.println("Hello!");
    }

  }

}
