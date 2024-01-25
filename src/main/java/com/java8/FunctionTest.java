package com.java8;

import java.util.function.Function;

public class FunctionTest {
  public static void main(String[] args) {
    Function<String, Integer> getLength = x -> x.length();
    Function<String, String> firstThreeChar = x -> x.substring(0, 3);
    Function<String, String> capitalize = x -> x.toUpperCase();

    int len = getLength.apply("Abrar zahid");
    System.out.println(len);

    String name = firstThreeChar.apply("Abrar");
    System.out.println(name);

    System.out.println(capitalize.andThen(firstThreeChar).apply("Abrar"));
  }
}
