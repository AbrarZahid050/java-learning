package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(11, 22, 43, 14, 35, 66, 1778, 90, 67, 78);

    List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    List<Integer> newlist = evenList.stream()
        .map(n -> n / 2)
        .distinct()
        .sorted((a, b) -> (b - a))
        .limit(4)
        .skip(1)
        .collect(Collectors.toList());

    System.out.println(newlist);

    Stream.iterate(0, n -> n + 1)
        .limit(101)
        .skip(1)
        .filter(n -> n % 2 == 0)
        .map(n -> n / 10)
        .distinct()
        .sorted()
        .peek(n -> System.out.println(n));

  }
}
