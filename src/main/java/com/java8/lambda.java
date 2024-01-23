package com.java8;

import java.util.ArrayList;
import java.util.List;
// import com.interfaces.Employee;
import com.networking.People;

public class lambda {
  public static void main(String[] args) {

    // Employee em1 = () -> "Software engineer.";
    // System.out.println(em1.getName());

    // Thread childThread = new Thread(() -> {
    // System.out.println("This is a child thread");
    // });

    // childThread.run();

    List<People> list = new ArrayList<>();

    list.add(new People("Abrar", 32));
    list.add(new People("Zahid", 65));
    list.add(new People("furqan", 26));

    list.sort((a, b) -> {
      return a.getAge() - b.getAge();
    });

    System.out.println(list);
  }

}
