package com.multithreading;

public class PrintTask implements Runnable {
  private final int sleepTime;
  private final String taskName;

  // constructor:
  public PrintTask(String name, int seconds) {
    taskName = name;
    sleepTime = seconds;
  }

  // has to implement run method:
  public void run() {

    try {

      System.out.println("-> [PrintTask] run(): "
          + taskName + " has started");
      System.out.println("-> [PrintTask] run(): "
          + taskName + " is going to sleep for " + sleepTime + "ms");

      Thread.sleep(sleepTime); // putting thread to sleep for the given time.

    } catch (InterruptedException err) {
      System.out.println(err.getMessage());
    }

    System.out.println("-> [PrintTask] run():"
        + taskName + " done sleeping");
  }
}