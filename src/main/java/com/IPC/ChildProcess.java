package com.IPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChildProcess {
  public static void main(String[] args) {
    // declaring input stream to take input from parent process.
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

      // outputing
      System.out.println("-> [Java]: Hello from Java");

      // echoing the input in continous manner:
      while (true) {
        String dataFromNode = reader.readLine();
        System.out.println("-> [Java] " + dataFromNode);

        // if "bye" received then end the process.
        if ("bye".equalsIgnoreCase(dataFromNode.trim())) {
          break;
        }
      }

      // closing the input stream.
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
