package com.chapter17.streamApp;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;

public class ReadSequentialFile {
  private ObjectInputStream input;

  public void openFile() {
    try {
      input = new ObjectInputStream(new FileInputStream("client.ser"));
    } catch (IOException err) {
      System.err.println("Error opening file.");
    }
  }

  public void readRecords() {
    AccountRecordSerializable record;
    System.out.printf("%-10s%-12s%-12s%10s\n", "Account",
        "First Name", "Last Name", "Balance");

    try {
      while (true) {
        record = (AccountRecordSerializable) input.readObject();

        System.out.printf("%-10d%-12s%-12s%10.2f\n",
            record.getAccount(), record.getFirstName(),
            record.getLastName(), record.getBalance());

      }
    } catch (EOFException err) {
      return;
    } catch (IOException err) {
      System.err.println("Error during read from file.");
    } catch (ClassNotFoundException err) {
      System.err.println("Unable to create object");
    }
  }

  public void closeFile() {
    try {
      if (input != null) {
        input.close();
      }
    } catch (IOException err) {
      System.err.println("Error closing file.");
      System.exit(1);
    }
  }
}
