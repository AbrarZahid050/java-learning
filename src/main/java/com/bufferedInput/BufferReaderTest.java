package com.bufferedInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTest {
  public static void main(String[] args) throws IOException {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter input: ");

    String str = buffer.readLine();
    int num = Integer.parseInt(buffer.readLine());

    System.out.println("String is: " + str);
    System.out.println("Number is: " + num);

    buffer.close();
  }
}
