package inclassCoding.W6D1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Demo {
  public static void main(String[] args) {
    Deque<String> arrayDeque = new ArrayDeque<>();
    arrayDeque.addFirst("a");
    arrayDeque.addLast("a");
    arrayDeque.pollFirst();
    arrayDeque.pollLast();
    Deque<String> linkedList = new LinkedList<>();
    linkedList.addFirst("a");
    linkedList.addLast("a");
    linkedList.pollFirst();
    linkedList.pollLast();

    Queue<String> arrayQueue = new ArrayDeque<>();
    arrayQueue.add("a");
    arrayQueue.poll();
    Queue<String> linkedQueue = new LinkedList<>();
    linkedQueue.add("a");
    linkedQueue.poll();

    Queue<String> pQueue = new PriorityQueue<>();
    pQueue.add("a");
    pQueue.poll();

    List<Integer> arrayList = new ArrayList<>();
    arrayList.add(3);
    arrayQueue.remove(3);
    List<Integer> linkedList2 = new LinkedList<>();
    // linkedList.poll();
    linkedList2.add(3);
    linkedList2.remove(3);

    List<String> stack = new Stack<>();
    stack.add("abc");
    stack.remove(0);

    Vector<String> stack2 = new Stack<>();
    stack2.add("abc");
    stack2.remove(0);

    Stack<String> stack3 = new Stack<>();
    stack3.push("abc");
    stack3.pop(); 
  }
}
