package com.chapter20;

import java.util.Stack;
import java.util.EmptyStackException;

public class StackTest {
  public static void main(String[] args) {
    Stack<Number> stack = new Stack<>();

    stack.push(12L);
    printStack(stack);
    stack.push(34567);
    stack.push(1.02F);
    printStack(stack);

    try {
      Number removedObject = null;
      while (true) {
        removedObject = stack.pop();
        System.out.printf("Popped %s\n", removedObject);
        printStack(stack);
      }
    } catch (EmptyStackException err) {
      err.printStackTrace();
    }

  }

  private static void printStack(Stack<Number> stack) {
    if (stack.empty()) {
      System.out.println("stack is empty\n");
    } else {
      System.out.printf("stack contains: %s (top)\n", stack);
    }
  }

}
