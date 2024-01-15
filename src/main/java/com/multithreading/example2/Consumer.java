package com.multithreading.example2;

import java.util.Random;
import com.interfaces.Buffer;

public class Consumer implements Runnable {
  private final static Random generator = new Random();
  private final Buffer sharedLocation;

  // constructor:
  public Consumer(Buffer shared) {
    sharedLocation = shared;
  }

  // ought to be implemented for Runnable-interface:
  // read sharedLocation's value 10 times and sum the values
  public void run() {
    int sum = 0;

    for (int count = 1; count <= 10; count++) {

      try {
        Thread.sleep(generator.nextInt(3000));
        sum += sharedLocation.get();
        // System.out.printf("\t\t\t%2d\n", sum);
      } catch (InterruptedException err) {
        err.printStackTrace();
      }
    }

    System.out.printf("\n%s %d\n%s\n",
        "Consumer read values totaling", sum, "Terminating Consumer");
  }
}
