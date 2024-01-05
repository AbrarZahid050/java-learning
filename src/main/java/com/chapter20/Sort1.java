package com.chapter20;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Sort1 {
  public static void main(String[] args) {
    String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

    List<String> list = Arrays.asList(suits);

    System.out.println("-> [main] before sort: " + list);

    Collections.sort(list);

    System.out.println("-> [main] after sort: " + list);
  }
}