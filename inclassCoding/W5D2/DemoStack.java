package inclassCoding.W5D2;

import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    // First In Last Out
    Stack<String> stack =new Stack<>();
    stack.push("abc");
    stack.push("def");
    System.out.println(stack.pop()); //def
    stack.push("xyz");
    stack.push("abc2");
    while(!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
    // stack
    stack.add("fgi");
    stack.push("fgi");
    stack.add("ijk");
    System.out.println(stack.pop()); // ijk
  }
}
