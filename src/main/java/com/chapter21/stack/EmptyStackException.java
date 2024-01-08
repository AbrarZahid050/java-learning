package com.chapter21.stack;

public class EmptyStackException extends RuntimeException {
  public EmptyStackException() {
    this("Stack is empty");
  }

  public EmptyStackException(String message) {
    super(message);
  }
}
