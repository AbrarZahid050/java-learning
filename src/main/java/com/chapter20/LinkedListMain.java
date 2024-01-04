package com.chapter20;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMain {
  public static void main(String[] args) {
    String[] colors = { "black", "blue", "yellow", "greem" };
    String[] removedColors = { "green", "blue" };

    List<String> list1 = new LinkedList<>();
    List<String> list2 = new LinkedList<>();

    for (String color : colors) {
      list1.add(color);
    }

    for (String color : removedColors) {
      list2.add(color);
    }

    list1.addAll(list2);

    for (String color : list1) {
      System.out.println("-> [main] -> " + color);
    }
  }
}
