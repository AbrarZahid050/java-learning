package com.chapter11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
  protected static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int result;
    int[] numbers = new int[2];
    boolean continueLoop = true;

    while (continueLoop) {

      try {
        numbers = getInputFromUser();
        result = division(numbers[0], numbers[1]);
        System.out.printf("Result: %d\n", result);
        continueLoop = false;
        input.close();

      } catch (ArithmeticException err) {
        System.err.printf("\nException: %s\n", err.getMessage());
        System.out.println("You must enter integers. Please try again.\n");

      } catch (InputMismatchException err) {
        input.next();
        System.err.printf("\nException: %s\n", err);
        System.out.println("You must enter integers. Please try again.\n");

      }
    }

  }

  public static int division(int num1, int num2) throws ArithmeticException {
    return num1 / num2;

  }

  public static int[] getInputFromUser() {
    int[] num = new int[2];

    System.out.println("Enter the first number: ");
    num[0] = input.nextInt();

    System.out.println("Enter the second number: ");
    num[1] = input.nextInt();

    return num;

  }
}
