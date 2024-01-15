package com.multithreading.blockingQueue;

import com.interfaces.Buffer;

public class Producer implements Runnable {
  private Buffer sharedLocation;

  public Producer(Buffer sharedLocation) {
    this.sharedLocation = sharedLocation;
  }

  public void run() {
    int value = 100;
    try {
      sharedLocation.set(value);
      int size = ((BlockingBuffer) sharedLocation).size();
      System.out.println("-> [Producer] run() writes: " + value + "\tsize: " + size);
    } catch (InterruptedException err) {
      err.printStackTrace();
    }
  }

}
