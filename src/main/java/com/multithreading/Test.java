package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Test {
  public static void main(String[] args) {
    var generator = new Random();

    int sleepTime1 = generator.nextInt(5000);
    int sleepTime2 = generator.nextInt(5000);

    var task1 = new PrintTask("task1", sleepTime1);
    var task2 = new PrintTask("task2", sleepTime2);

    // ExecutorService to manage threads
    ExecutorService threadExecutor = Executors.newCachedThreadPool();

    threadExecutor.execute(task1);
    threadExecutor.execute(task2);

    // shutdown worker threads when their tasks complete
    threadExecutor.shutdown();

  }
}
