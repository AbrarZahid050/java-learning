package com.multithreading.realExample;

import java.util.Random;
import java.util.Arrays;

public class SimpleArray {
  private int[] array;
  private int writeIndex = 0;
  private final static Random generator = new Random();

  // contructor:
  public SimpleArray(int size) {
    array = new int[size];
  }

  public synchronized void add(int value) {
    int position = writeIndex;

    try {
      Thread.sleep(generator.nextInt(500));
    } catch (InterruptedException err) {
      err.printStackTrace();
    }

    array[position] = value;
    System.out.println(Thread.currentThread().getName() +
        " wrote " + value + " at position " + position);

    ++writeIndex;

    System.out.println("Next write index: " + writeIndex);
  }

  public String toString() {
    return "\nContents of SimpleArray:\n" + Arrays.toString(array);
  }
}
