package com.java8;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
  public static void main(String[] args) {
    Predicate<Integer> predicate = s -> s % 2 == 0;
    Function<Integer, Integer> function = s -> s * s;
    Consumer<Integer> consumer = s -> System.out.println(s);
    Supplier<Integer> supplier = () -> 100;

    if (predicate.test(supplier.get())) {
      consumer.accept(function.apply(supplier.get()));
    }

  }
}
