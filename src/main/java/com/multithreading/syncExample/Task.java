package com.multithreading.syncExample;

public class Task implements Runnable {
  private static int counter;

  // constructor:
  public Task() {
    counter = 0;
  }

  public void run() {
    // Synchronized block ensures that only one thread
    // can execute this block at a time
    synchronized (Task.class) {
      int sharedValue = counter;

      // Simulate some processing time
      try {
        Thread.sleep(100);
      } catch (InterruptedException err) {
        err.printStackTrace();
      }

      counter = sharedValue + 1;
      System.out.println("-> [Task] run() counter: " + counter + " sharedValue: " + sharedValue);
    }
  }

  public static int getCounter() {
    return counter;
  }
}
