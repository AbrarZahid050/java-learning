package com.java8;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

public class ConsumerTest {
  public static void main(String[] args) {
    Consumer<List<String>> consumer = li -> {
      for (String name : li) {
        System.out.println(name.substring(0, 3));
      }
    };

    Consumer<List<String>> capitalize = li -> {
      for (String name : li) {
        System.out.println(name.toUpperCase());
      }
    };

    Consumer<List<String>> show = li -> {
      for (String name : li) {
        System.out.println(name);
      }
    };

    Consumer<List<String>> modifiedList = show.andThen(capitalize).andThen(consumer);

    modifiedList.accept(Arrays.asList("Abrar", "Zahid", "Test"));

  }
}
