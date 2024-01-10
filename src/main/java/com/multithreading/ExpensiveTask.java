package com.multithreading;

import java.util.concurrent.TimeUnit;

public class ExpensiveTask implements Runnable {

  private final long loopIteration;

  public ExpensiveTask(long number) {
    loopIteration = number;
  }

  public void run() {
    long startTime = System.nanoTime();

    for (long i = 0; i <= loopIteration - 1; i++) {
    }
    long endTime = System.nanoTime();
    long executionTime = endTime - startTime;
    long executionTimeInMillis = TimeUnit.NANOSECONDS.toSeconds(executionTime);
    System.out.println("-> [ExpensiveTask] done!" + "\nTime taken: " + executionTimeInMillis + "s");
  }
}
