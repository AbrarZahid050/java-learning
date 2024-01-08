package com.chapter20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
  public static void main(String[] args) {
    List<MyClass> list = new ArrayList<>();

    list.add(new MyClass(10));
    list.add(new MyClass(3));
    list.add(new MyClass(8));

    System.out.println("-> [main] before sorting: " + list);

    Collections.sort(list);

    System.out.println("-> [main] after sorting: " + list);

  }
}

class MyClass implements Comparable<MyClass> {

  private int value;

  public MyClass(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  // have to implement this method in the concrete class
  @Override
  public int compareTo(MyClass other) {
    return Integer.compare(this.value, other.value);
  }

  @Override
  public String toString() {
    return "MyClass{ " + "value = " + value + " }";
  }

}