package com.chapter20;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
  public static void main(String[] args) {
    String[] colors = { "black", "red", "green", "yellow" };

    LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));

    for (String color : colors) {
      System.out.println("-> [main] before " + color);
    }

    System.out.println("---------------------");
    links.add("blue");
    links.addFirst("cyan");

    colors = links.toArray(new String[links.size()]);

    for (String color : colors) {
      System.out.println("-> [main] " + color);
    }

  }
}
