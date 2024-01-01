package com.chapter17.ReadWriteApp;

public class ReadWriteApp {
  public static void main(String[] args) {
    readFile();

  }

  public static void readFile() {
    ReadTextFile app = new ReadTextFile();
    app.openFile();
    app.readRecords();
    app.closeFile();

  }

  public static void writeFile() {
    CreateTextFile app = new CreateTextFile();
    app.openFile();
    app.addRecord();
    app.closeFile();

  }
}
