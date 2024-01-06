package com.chapter20;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms1 {
  public static void main(String[] args) {
    Character[] letters = { 'P', 'C', 'M' };

    List<Character> list = Arrays.asList(letters);
    System.out.println("\n-> [main] the origianl form of list:");
    output(list);

    Collections.reverse(list);
    System.out.println("\n-> [main] the reverse list:");
    output(list);

    Character[] lettersCopy = new Character[3];
    List<Character> copyList = Arrays.asList(lettersCopy);
    Collections.copy(copyList, list);
    System.out.println("\n-> [main] after copying list:");
    output(copyList);

    Collections.fill(copyList, 'R');
    System.out.println("\n-> [main] after insertion of R list:");
    output(copyList);
  }

  private static void output(List<Character> listRef) {
    System.out.println("-> [output] list is: ");
    for (Character el : listRef) {
      System.out.printf("%s ", el);
    }

    System.out.println("\nMax: " + Collections.max(listRef));
    System.out.println("Min: " + Collections.min(listRef));
  }
}
