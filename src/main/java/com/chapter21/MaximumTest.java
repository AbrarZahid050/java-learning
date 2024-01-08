package com.chapter21;

public class MaximumTest {
  public static void main(String[] args) {
    System.out.println("-> [main] with integers 3,8,2 max is: "
        + maximum(3, 8, 2));

    System.out.println("-> [main] with doubles 9.8,8.0,2.1 max is: "
        + maximum(9.8, 8.0, 2.1));

    System.out.println("-> [main] with strings max is: "
        + maximum("pears", "apples", "tea"));

  }

  public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
    T max = x;

    if (y.compareTo(max) > 0) {
      max = y;
    }

    if (z.compareTo(max) > 0) {
      max = z;
    }

    return max;
  }
}
