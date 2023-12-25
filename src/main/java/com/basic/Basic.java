package com.basic;

public class Basic {
  public static void main(String[] args) {
    // Instantiating employee object:
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();

    // Changing the values of the attributes;
    employee1.setFirstName("12");
    employee1.setLastName("Zahid");
    employee1.setNIC("111-11-111");

    employee2.setFirstName("Test");
    employee2.setLastName("Test");
    employee2.setNIC("222-22-222");

    // Setting color for the console out:
    String yellow = "\u001B[33m";
    String red = "\u001B[31m";

    // logging the values of the employee attributes to the console:
    employee1.display(yellow);
    employee2.display(red);

  }
}
