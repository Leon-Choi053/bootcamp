import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(100) + 1;
    // number start from 0
    int input = 0;
    do {
      // ask user to pick number from range
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please pick a number from " + min + " to " + max);
      input = scanner.nextInt();

      // Revise question so that user can pick a number from different range
      // If Bomb = 13, user input 10, 2nd question min = 11, max = 20
      // If Bomb = 13, user input 17, 2nd question min = 10, max = 16
      if (input < bomb) {
        min = input + 1;
      }
      if (input > bomb) {
        max = input - 1;
      }
    } while (input != bomb);

    System.out.println("The Bomb is exploded!! Your Lose!!");
  }
}
