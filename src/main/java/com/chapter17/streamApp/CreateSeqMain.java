package com.chapter17.streamApp;

public class CreateSeqMain {
  public static void main(String[] args) {
    CreateSequentialFile app = new CreateSequentialFile();
    app.openFile();
    app.addRecords();
  }
}
