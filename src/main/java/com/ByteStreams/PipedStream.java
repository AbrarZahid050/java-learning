package com.ByteStreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStream {
  public static void main(String[] args) {
    try {
      PipedOutputStream pipedOutput = new PipedOutputStream();
      PipedInputStream pipedInput = new PipedInputStream();

      // Connecting two piped-streams
      pipedInput.connect(pipedOutput);

      Thread producer = new Thread(() -> {
        try {
          pipedOutput.write("hello from PipedOutputStream.".getBytes());
          pipedOutput.close();
        } catch (IOException err) {
          err.printStackTrace();
        }
      });

      Thread consumer = new Thread(() -> {
        int data;
        try {
          // Reading data until there is nothing to read.
          while ((data = pipedInput.read()) != -1) {
            System.out.print((char) data);
          }
          pipedInput.close();
        } catch (IOException err) {
          err.printStackTrace();
        }
      });

      producer.start();
      consumer.start();

      // Main thread will wait for both thread to finish their work.
      producer.join();
      consumer.join();

    } catch (InterruptedException | IOException err) {
      err.printStackTrace();
    }
  }
}
