package com.chapter17.ReadWriteApp;

import java.util.Scanner;
import java.io.File;

public class fileExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.printf("Enter the path: ");

    String path = input.nextLine();
    input.close();

    File file = new File(path);

    System.out.println(file.getAbsolutePath());
    System.out.println(file.getPath());

    String[] list = file.list();
    for (String element : list) {
      System.out.println(element);
    }

    System.out.println();
    System.out.println(list.toString());

  }
}
