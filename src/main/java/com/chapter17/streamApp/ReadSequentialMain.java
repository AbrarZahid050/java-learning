package com.chapter17.streamApp;

public class ReadSequentialMain {
  public static void main(String[] args) {
    ReadSequentialFile app = new ReadSequentialFile();
    app.openFile();
    app.readRecords();
    app.closeFile();
  }
}
