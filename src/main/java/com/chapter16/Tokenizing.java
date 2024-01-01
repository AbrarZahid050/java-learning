package com.chapter16;

import java.util.Scanner;

public class Tokenizing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a sentence and press Enter");
    String input = scanner.nextLine();
    scanner.close();

    String[] tokens = input.split(" ");
    System.out.println(tokens.length);

    for (String token : tokens) {
      System.out.println(token);
    }
  }
}
