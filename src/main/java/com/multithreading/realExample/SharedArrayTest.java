package com.multithreading.realExample;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
  public static void main(String[] args) {
    SimpleArray sharedSimpleArray = new SimpleArray(6);

    ArrayWrite writter1 = new ArrayWrite(1, sharedSimpleArray);
    ArrayWrite writter2 = new ArrayWrite(11, sharedSimpleArray);

    ExecutorService threadExecutors = Executors.newCachedThreadPool();

    threadExecutors.execute(writter1);
    threadExecutors.execute(writter2);

    threadExecutors.shutdown();

    try {
      boolean tasksEnded = threadExecutors.awaitTermination(1, TimeUnit.MINUTES);

      if (tasksEnded) {
        System.out.println(sharedSimpleArray);
      } else {
        System.out.println("Timed out while waiting for tasks to finish.");
      }
    } catch (InterruptedException err) {
      System.out.println("Interrupted while waiting for tasks to finish.");
    }
  }
}
