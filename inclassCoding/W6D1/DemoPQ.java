package inclassCoding.W6D1;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {
  public static void main(String[] args) {
    // Priority: natural order by default
    Queue<String> queue = new PriorityQueue<>();
    queue.add("bcd");
    queue.add("acd");
    queue.add("def");
    System.out.println(queue.poll()); // abc

    // Priority: Custom Priority by Comparator
    Queue<String> custom = new PriorityQueue<>(new SortByDesecending());
    custom.add("bcd");
    custom.add("acd");
    custom.add("def");
    System.out.println(custom.poll()); // def
  }
}
