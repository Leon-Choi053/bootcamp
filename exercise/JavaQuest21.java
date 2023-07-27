/*
 * 
 * Question : Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
 * 
 * An integer m is a divisor of n if there exists an integer k such that n = k * m.
 * 
 */
public class JavaQuest21 {

  public static void main(String[] args) {
    System.out.println(isThreeDivisors(1)); // false
    System.out.println(isThreeDivisors(3)); // false
    System.out.println(isThreeDivisors(4)); // true, 4/1, 4/2, 4/4
    System.out.println(isThreeDivisors(12)); // false
    System.out.println(isThreeDivisors(9999)); // false
  }

  public static boolean isThreeDivisors(int n) {
    int sqrt = (int) Math.sqrt(n);
    return n == sqrt * sqrt && isPrime(sqrt);
  }

  private static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
