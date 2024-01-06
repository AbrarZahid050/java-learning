package com.chapter20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
  public static void main(String[] args) {
    String[] colors = { "black", "cyan", "yellow", "magenta" };
    List<String> list = new ArrayList<String>(Arrays.asList(colors));

    Collections.sort(list);
    System.out.println("Sorted array: " + list);

    printSearchResults(list, colors[3]);
    printSearchResults(list, colors[0]);
    printSearchResults(list, "aqua");
    printSearchResults(list, colors[1]);
    printSearchResults(list, "gray");

  }

  private static void printSearchResults(List<String> list, String key) {
    int result = 0;

    System.out.printf("\nSearching for: %s\n", key);
    result = Collections.binarySearch(list, key);

    if (result >= 0) {
      System.out.printf("Found at index %d\n", result);
    } else {
      System.out.printf("Not Found (%d)\n", result);
    }
  }
}
