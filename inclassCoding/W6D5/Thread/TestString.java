package inclassCoding.W6D5.Thread;

public class TestString {
  String str = "";

  public static void main(String[] args) {
    TestString t = new TestString();

    Runnable concat = () -> {
      for (int i = 0; i < 100000; i++) {
        t.str = t.str.concat("s"); // concat() -> non-atomic operation
      }
    };

    Thread thread1 = new Thread(concat);
    Thread thread2 = new Thread(concat);
    
  }
}
