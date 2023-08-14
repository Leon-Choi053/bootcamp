package inclassCoding.W5D2;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    PriorityQueue<String> queue = new PriorityQueue<>();
    LinkedList<String> queues = new LinkedList<>();
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

    for (String str: queue) {
      System.out.println(str);
    }

    PriorityQueue<String> backup = queue;
    while (!queue.isEmpty()) {
      System.out.println(queue.poll()); //  abc, ijk
    }

    System.out.println(backup.size()); // 0
  }
}
