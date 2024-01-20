package com.ByteStreams;

import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {
  public static void main(String[] args) {
    try {
      var fin = new FileInputStream("./assets/input.png");
      var fout = new FileOutputStream("./assets/output.png");

      int temp;
      int counter = 0;

      long startTime = System.nanoTime();
      while ((temp = fin.read()) != -1) {
        fout.write(temp);
        counter++;
      }
      long endTime = System.nanoTime();
      long executionTime = endTime - startTime;
      long executionTimeInMillis = TimeUnit.NANOSECONDS.toSeconds(executionTime);

      fin.close();
      fout.close();
      System.out.println("-> [main] counter: " + counter + "\nTime in seconds: " + executionTimeInMillis);

    } catch (IOException err) {
      System.out.println(err.getMessage());
    }
  }
}

// byte[] buffer = new byte[1024];
// while ((temp = fin.read(buffer)) != -1) {
// System.out.println("-> [main] " + temp);
// fout.write(buffer);
// counter++;
// }