package com.chapter20;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
  public static void main(String[] args) {
    String[] colors = { "red", "blue", "green", "cyan", "black" };
    String[] removeColors = { "blue", "cyan", "magenta" };

    List<String> list = new ArrayList<>();
    List<String> removeList = new ArrayList<>();

    for (String color : colors) {
      list.add(color);
    }

    for (String color : removeColors) {
      removeList.add(color);
    }

    removeColors(list, removeList);

    for (String color : list) {
      System.out.println("-> [main] after removing " + color);
    }
  }

  public static void removeColors(Collection<String> collection1, Collection<String> collection2) {
    Iterator<String> iter = collection1.iterator();

    while (iter.hasNext()) {
      if (collection2.contains(iter.next())) {
        iter.remove();
      }
    }
  }
}
