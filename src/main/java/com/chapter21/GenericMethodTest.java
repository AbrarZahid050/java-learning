package com.chapter21;

public class GenericMethodTest {
  public static void main(String[] args) {
    Integer[] intArray = { 1, 2, 3, 4 };
    String[] strArray = { "Abrar", "Zahid", "test" };
    Character[] charArray = { 'a', 'b', 'c', 'd' };

    System.out.println("\n-> [main] Interger array: ");
    printArray(intArray);

    System.out.println("\n-> [main] String array: ");
    printArray(strArray);

    System.out.println("\n-> [main] Character array: ");
    printArray(charArray);

  }

  private static <T> void printArray(T[] list) {
    for (T element : list) {
      System.out.println(element);
    }
  }
}
