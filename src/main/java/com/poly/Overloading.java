package com.poly;

public class Overloading {
  public void thisMethodIsOverloaded(double num) {
    System.out.println("\n-> [num]: " + num);
  }

  public void thisMethodIsOverloaded() {
    System.out.println("\n-> [NO-ARG]");
  }
}
