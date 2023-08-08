package inclassCoding.W5D2;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    LinkedList<String> queue = new LinkedList<>();
    // First In First Out
    queue.add("hello");
    queue.add("world");
    System.out.println(queue.peek()); // hello
    System.out.println(queue.poll()); // hello
    System.out.println(queue.poll()); // world
    System.out.println(queue.size()); // 0

    queue.add("abc");
    queue.add("def");
    queue.add("xyz");
    System.out.println(queue.remove("def")); // true
    System.out.println(queue.poll()); // abc
    System.out.println(queue.poll()); // xyz

    System.out.println(queue.offer("ijk")); // add()
    System.out.println(queue.offer("ijk")); // add()
    System.out.println(queue.size()); // 2

    if (queue.contains("ijk")) { // true
      queue.remove("ijk");
    }

    for (String str : queue) {
      System.out.println(str);
    }

    Queue<String> backup = queue;
    while (!queue.isEmpty()) {
      System.out.println(queue.poll()); // abc, ijk
    }
    System.out.println(backup.size()); // 0

    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.push(10);
    // queueNum.push(10); // 2nd even number
    queueNum.push(9);
    queueNum.push(0);
    queueNum.push(-3);
    queueNum.push(100);
    // 10, 9, -3, 100
    int countEven = 0;
    int element = 0;
    //int first = queueNum.peek(); // first = 10
    //queueNum.add(first);
    //boolean firstTime = true;
    System.out.println("Start");
    int size = queueNum.size(); // 6
    int i = 0;
    while (i++ < size) { // ???
      element = queueNum.poll();
      if (element % 2 == 0) {
        System.out.println(element);
        if (element % 2 == 0 && ++countEven == 2) {
          //System.out.println("second even");
          // size--;
          continue;
        }
        queueNum.add(element);
      }
      System.out.println(queueNum);
    }
  }
}
