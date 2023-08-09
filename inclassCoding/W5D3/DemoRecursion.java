package inclassCoding.W5D3;

public class DemoRecursion {
  public static void main(String[] args) {
    // algorithm -> algo
    System.out.println(sum(5));
    System.out.println(sum2(6));
  }

  // Q1:
  // k + (k - 1) + (k - 2) + ... + 0
  public static int sum(int k) {
    if (k < 1) {
      return k;
    }
    // int sum = 0;
    // for(int i = 0; i > 0; i--){
    // sum += 1;
    // }
    // return sum;
    return k + sum(k - 1);
  }

  public static int sum2(int k) {
    if (k <= 1)
      return k;
    return sum2(k - 1) + sum2(k - 2);
  }

  // 3 2 1 1 2 3, k = 3
  public static void print(int k) {
    if (k < 1)
      return;
    System.out.println(k + " ");
    print(k - 1);
    System.out.println(k + " ");
  }
}
