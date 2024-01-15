package com.multithreading.circularBuffer;

import com.multithreading.example2.Consumer;
import com.multithreading.example2.Producer;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class CircularBufferTest {
  public static void main(String[] args) {

    ExecutorService app = Executors.newCachedThreadPool();

    CircularBuffer sharedLocation = new CircularBuffer();

    app.execute(new Producer(sharedLocation));
    app.execute(new Consumer(sharedLocation));

    app.shutdown();

  }

}
