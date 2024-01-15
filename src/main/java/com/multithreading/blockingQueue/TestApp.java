package com.multithreading.blockingQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestApp {
  public static void main(String[] args) {
    ExecutorService app = Executors.newCachedThreadPool();

    BlockingBuffer sharedLocation = new BlockingBuffer(1);

    app.execute(new Producer(sharedLocation));
    app.execute(new Consumer(sharedLocation));

    app.shutdown();
  }
}
