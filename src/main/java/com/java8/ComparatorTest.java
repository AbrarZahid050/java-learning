package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.networking.People;

public class ComparatorTest {
  public static void main(String[] args) {
    List<People> list = new ArrayList<>();

    list.add(new People("Abrar", 32));
    list.add(new People("Furqan", 25));
    list.add(new People("Zahid", 60));

    Collections.sort(list, (a, b) -> {
      return a.getAge() - b.getAge();
    });

    System.out.println(list);

  }
}
