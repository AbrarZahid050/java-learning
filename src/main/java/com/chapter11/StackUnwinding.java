package com.chapter11;

public class StackUnwinding {
  public static void main(String[] args) {
    try {
      method1();
    } catch (Exception err) {
      System.err.println("-> [main] " + err.getMessage());
      err.printStackTrace();

      StackTraceElement[] traceElem = err.getStackTrace();

      System.out.println("\nStack trace from getStackTrace:");
      System.out.println("Class\t\t\t\tFile\t\t\tLine\tMethod");

      for (StackTraceElement el : traceElem) {
        System.out.printf("%s\t", el.getClassName());
        System.out.printf("%s\t", el.getFileName());
        System.out.printf("%s\t", el.getLineNumber());
        System.out.printf("%s\n", el.getMethodName());
      }
    }
  }

  public static void method1() throws Exception {
    method2();
  }

  public static void method2() throws Exception {
    method3();
  }

  public static void method3() throws Exception {
    throw new Exception("Exception message.");
  }
}
