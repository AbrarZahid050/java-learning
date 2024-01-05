package com.chapter20;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort2 {
  public static void main(String[] args) {
    String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

    List<String> list = Arrays.asList(suits);

    System.out.println("-> [main] before reverse sort: " + list);

    Collections.sort(list, Collections.reverseOrder());

    System.out.println("-> [main] after reverse sort: " + list);

    suits = list.toArray(new String[list.size()]);

    System.out.println("---------------------");

    for (String element : suits) {
      System.out.println("-> [main] string suits: " + element);
    }

  }
}
