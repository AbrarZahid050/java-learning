package com.multithreading.example2;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import com.interfaces.Buffer;

public class SharedBufferTest {
  public static void main(String[] args) {
    ExecutorService application = Executors.newCachedThreadPool();

    Buffer sharedLocation = new UnsnychronizedBuffer();

    System.out.println("Action\t\tValue\tSum of Produced\tSum of Consumed");
    System.out.println("------\t\t-----\t---------------\t---------------\n");

    application.execute(new Producer(sharedLocation));
    application.execute(new Consumer(sharedLocation));
    application.shutdown();

  }
}
