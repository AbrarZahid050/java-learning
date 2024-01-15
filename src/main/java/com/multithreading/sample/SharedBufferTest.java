package com.multithreading.sample;

import com.interfaces.Buffer;
import com.multithreading.example2.Producer;
import com.multithreading.example2.Consumer;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class SharedBufferTest {
  public static void main(String[] args) {

    ExecutorService app = Executors.newCachedThreadPool();

    Buffer sharedLocation = new SynchronizedBuffer();

    System.out.printf("%-40s%s\t\t%s\n%-40s%s\n\n", "Operation", "Buffer", "Occupied", "---------",
        "------\t\t--------");

    app.execute(new Producer(sharedLocation));
    app.execute(new Consumer(sharedLocation));
    app.shutdown();
  }
}
