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

    printList(list1);
    convertToUpper(list1);
    printReverse(list1);
    removeItems(list1, 0, 3);
    printList(list1);

  }

  private static void printList(List<String> list) {
    for (String color : list) {
      System.out.println("-> [printList] " + color);
    }
    System.out.println("--------------------");
  }

  private static void convertToUpper(List<String> list) {
    ListIterator<String> iter = list.listIterator();

    while (iter.hasNext()) {
      String color = iter.next();
      iter.set(color.toUpperCase());
    }
  }

  private static void printReverse(List<String> list) {
    ListIterator<String> iter = list.listIterator(list.size());

    while (iter.hasPrevious()) {
      String color = iter.previous();
      System.out.println("-> [printReverse] " + color);
    }
    System.out.println("--------------------");
  }

  private static void removeItems(List<String> list, int start, int end) {
    list.subList(start, end).clear();
  }
}
