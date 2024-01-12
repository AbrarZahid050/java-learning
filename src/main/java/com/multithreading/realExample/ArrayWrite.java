package com.multithreading.realExample;

public class ArrayWrite implements Runnable {
  private final SimpleArray sharedSimpleArray;
  private final int startValue;

  public ArrayWrite(int value, SimpleArray array) {
    sharedSimpleArray = array;
    startValue = value;
  }

  public void run() {
    for (int i = startValue; i < startValue + 3; i++) {
      sharedSimpleArray.add(i);
    }
  }
}
