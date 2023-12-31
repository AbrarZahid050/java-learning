package com.chapter16;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a character:");
    String input = scanner.next();
    char c = input.charAt(0);

    System.out.printf("is defined %b\n", Character.isDefined(c));
    System.out.printf("is digit: %b\n", Character.isDigit(c));
    scanner.close();
  }
}
