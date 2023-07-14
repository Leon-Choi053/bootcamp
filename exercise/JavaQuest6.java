/**
 * Expected output: 1 1 2 3 5 8 13 21 ...
 * 
 */
// Count the target of character in a String.
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int num1 = 0;
    int num2 = 1;
    for (int i = 0; i < 15; i++) {
    System.out.println(num2);
    int sum = num1 + num2;
    num1 = num2;
    num2 = sum;
    }

  }
}
