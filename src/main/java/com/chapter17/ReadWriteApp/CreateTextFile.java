package com.chapter17.ReadWriteApp;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
  private Formatter output;

  public void openFile() {
    try {
      output = new Formatter("test.txt");
    } catch (SecurityException err) {
      System.out.printf("You don't have write access to this file.", err.getMessage());
      System.exit(1); // terminate the program.
    } catch (FileNotFoundException err) {
      System.out.printf("Error openning or creating file.", err.getMessage());
      System.exit(1); // terminate the program.
    }
  }

  public void closeFile() {
    if (output != null) {
      output.close();
    }
  }

  public void addRecord() {
    AccountRecord record = new AccountRecord();
    Scanner input = new Scanner(System.in);

    System.out.printf("%s\n%s\n%s\n%s\n\n",
        "To terminate input, type the end-of-file indicator ",
        "when you are prompted to enter input.",
        "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
        "On Windows type <ctrl> z then press Enter");

    System.out.printf("%s\n%s",
        "Enter account number (> 0), first name, last name and balance.",
        "? ");

    while (input.hasNext()) {
      try {
        record.setAccount(input.nextInt());
        record.setFirstName(input.next());
        record.setLastName(input.next());
        record.setBalance(input.nextDouble());

        if (record.getAccount() > 0) {
          output.format("%d %s %s %.2f\n",
              record.getAccount(),
              record.getFirstName(),
              record.getLastName(),
              record.getBalance());
        } else {
          System.out.println("Account number must be greater than 0.");
        }
      } catch (FormatterClosedException err) {
        System.err.println("Error writting to file.");
        input.close();
        return;
      } catch (NoSuchElementException err) {
        System.err.println("Invalid input, Please try again.");
        input.nextLine();
      }
      System.out.printf("%s %s\n%s", "Enter account number (> 0),",
          "first name, last name and balance.", "? ");
    }
    input.close();
  }
}
