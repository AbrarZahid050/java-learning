package com.multithreading.blockingQueue;

import com.interfaces.Buffer;

public class Consumer implements Runnable {
  private Buffer sharedLocation;

  public Consumer(Buffer sharedLocation) {
    this.sharedLocation = sharedLocation;
  }

  public void run() {
    try {
      int value = sharedLocation.get();
      int size = ((BlockingBuffer) sharedLocation).size();
      System.out.println("-> [Consumer] run() reads: " + value + "\tsize: " + size);
    } catch (InterruptedException err) {
      err.printStackTrace();
    }
  }
}
