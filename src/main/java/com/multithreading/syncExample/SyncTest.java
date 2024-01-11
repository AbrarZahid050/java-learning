package com.multithreading.syncExample;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class SyncTest {
  public static void main(String[] args) {
    var task1 = new Task();
    var task2 = new Task();
    var task3 = new Task();

    // Dynamically grow and shrink threads based on the workload.
    ExecutorService threadExecutor = Executors.newCachedThreadPool();

    threadExecutor.execute(task1);
    threadExecutor.execute(task2);
    threadExecutor.execute(task3);

    threadExecutor.shutdown();

    for (long i = 0; i <= 10000000000L; i++) {
      // waiting for some extra long time so when all the threads are done working
      // in the background I'd be able to see output, cuz the "main()" thread of
      // JVM might get closed even when the other threads are running. But the
      // program will terminate only when all the other threads are done.
    }

    System.out.println("-> [main] task1 counter: " + Task.getCounter());

  }
}
