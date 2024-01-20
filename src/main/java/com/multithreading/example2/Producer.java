package com.multithreading.example2;

import java.util.Random;
import com.interfaces.Buffer;

public class Producer implements Runnable {
  private final static Random generator = new Random();
  private final Buffer sharedLocation;

  // constructor:
  public Producer(Buffer shared) {
    sharedLocation = shared;
  }

  // ought to be implemented for Runnable-interface:
  // store values from 1 to 10 in sharedLocation
  public void run() {
    int sum = 0;
    for (int count = 1; count <= 10; count++) {

      try {
        Thread.sleep(generator.nextInt(3000));
        sharedLocation.set(count);
        sum += count;
        System.out.printf("\t%2d\n", sum);
      } catch (InterruptedException err) {
        err.printStackTrace();
      }
    }

    System.out.println("Producer done producing\nTerminating Producer totaling: " + sum);
  }
}
