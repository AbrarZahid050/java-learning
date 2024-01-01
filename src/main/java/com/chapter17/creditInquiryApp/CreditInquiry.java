package com.chapter17.creditInquiryApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.chapter17.ReadWriteApp.AccountRecord;

public class CreditInquiry {
  private MenuOptions accountType;
  private Scanner input;
  private final static MenuOptions[] choices = {
      MenuOptions.ZERO_BALANCE,
      MenuOptions.CREDIT_BALANCE,
      MenuOptions.DEBIT_BALANCE,
      MenuOptions.END
  };

  private void readRecords() {
    AccountRecord record = new AccountRecord();

    try {
      input = new Scanner(new File("test.txt"));

      while (input.hasNext()) {
        record.setAccount(input.nextInt());
        record.setFirstName(input.next());
        record.setLastName(input.next());
        record.setBalance(input.nextDouble());

        if (shouldDisplay(record.getBalance())) {
          System.out.printf("%-10d%-12s%-12s%10.2f\n",
              record.getAccount(),
              record.getFirstName(),
              record.getLastName(),
              record.getBalance());
        }
      }

    } catch (FileNotFoundException err) {
      System.err.println("File cannot be found.");
      System.exit(1);
    } catch (IllegalStateException err) {
      System.err.println("Error reading from file.");
      System.exit(1);
    } catch (NoSuchElementException err) {
      System.err.println("File improperly formed.");
      System.exit(1);
    } finally {
      if (input != null) {
        input.close();
      }
    }

  }

  private boolean shouldDisplay(double balance) {
    if ((accountType == MenuOptions.CREDIT_BALANCE) && (balance < 0)) {
      return true;
    } else if ((accountType == MenuOptions.DEBIT_BALANCE) && (balance > 0)) {
      return true;
    } else if ((accountType == MenuOptions.ZERO_BALANCE) && (balance == 0)) {
      return true;
    }
    return false;
  }

  // method to return the user choice:
  private MenuOptions getRequest() {
    Scanner textIn = new Scanner(System.in);
    int request = 1;

    System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
        "Enter request",
        " 1 - List accounts with zero balances",
        " 2 - List accounts with credit balances",
        " 3 - List accounts with debit balances",
        " 4 - End of run");

    try {
      System.out.print("\n? ");
      request = textIn.nextInt();
      while ((request < 1) || (request > 4)) {
        System.out.print("\n? ");
        request = textIn.nextInt();
      }
    } catch (NoSuchElementException err) {
      System.err.println("Invalid input.");
      textIn.close();
      System.exit(1);
    }

    return choices[request - 1];
  }

  // method to process requests:
  public void processRequests() {
    accountType = getRequest();

    while (accountType != MenuOptions.END) {

      switch (accountType) {
        case ZERO_BALANCE:
          System.out.println("\nAccounts with zero balances:\n");
          break;

        case CREDIT_BALANCE:
          System.out.println("\nAccounts with credit balances:\n");
          break;

        case DEBIT_BALANCE:
          System.out.println("\nAccount with debit balances:\n");
          break;

        case END:
          break;
      }
      readRecords();
      accountType = getRequest();
    }
  }
}
