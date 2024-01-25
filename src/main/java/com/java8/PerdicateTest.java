package com.java8;

import java.util.function.Predicate;

import com.networking.People;

public class PerdicateTest {
  public static void main(String[] args) {
    People abrar = new People("Abrar", 32);
    People furqan = new People("Furqan", 25);

    Predicate<People> ageElseThen30 = (x) -> {
      return x.getAge() < 30;
    };

    System.out.println(ageElseThen30.test(abrar));
    System.out.println(ageElseThen30.test(furqan));

  }
}
