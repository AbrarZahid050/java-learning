package com.ByteStreams;

import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class BufferedInputStreamTest {
  public static void main(String[] args) throws IOException {
    var fio = new BufferedInputStream(new FileInputStream("./assets/input.png"));
    var fout = new BufferedOutputStream(new FileOutputStream("./assets/output.png"));

    int counter = 0;
    int temp;

    long startTime = System.nanoTime();
    while ((temp = fio.read()) != -1) {
      fout.write(temp);
      counter++;
    }
    long endTime = System.nanoTime();
    long executionTime = endTime - startTime;
    long executionTimeInMillis = TimeUnit.NANOSECONDS.toMillis(executionTime);

    fio.close();
    fout.close();
    System.out.println("-> [main] counter: " + counter + "\nTime in ms: " + executionTimeInMillis);
  }
}

// byte[] buffer = new byte[8192];