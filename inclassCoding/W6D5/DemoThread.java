package inclassCoding.W6D5;

public class DemoThread {
  public static void main(String[] args) {
    Runnable printout =() -> {
      for(int i = 0; i<1000; i++) {
        System.out.println("i=" +i);
      }
    };

    Thread thread = new Thread(printout);

    System.out.println("start thread 1");
    thread.start();
    System.out.println("end thread 1");

    Thread thread2 = new Thread(new PrintOut());
    System.out.println("start thread 2");
    thread2.start();
    System.out.println("end thread 2");

    Thread thread3 = new Thread(new PrintOut2());
    thread3.start();

    try {
      thread.join();
      thread3.join();
      thread3.join();
    } catch(InterruptedException e) {

    }
    System.out.println("main thread ends");
  }
}
