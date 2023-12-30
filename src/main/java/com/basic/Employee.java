package com.basic;

public class Employee {
  // Attributes:
  private String firstName;
  private String lastName;
  private String NIC;

  // Constructor with parameters:
  public Employee(String firstName, String lastName, String NIC) {
    setFirstName(firstName);
    setLastName(lastName);
    setNIC(NIC);
  }

  // Method:
  public void display(String color) {
    System.out.printf(color + "\nFirst name: %s\nLast name: %s\nNIC#: %s\n",
        firstName, lastName, NIC);
  }

  // firstName setter:
  public void setFirstName(String firstName) {
    if (isValidName(firstName)) {
      this.firstName = firstName;
    } else {
      System.out.println("Invalid first name");
      this.firstName = "unnamed";
    }
  }

  // lastName setter:
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // NIC setter:
  public void setNIC(String NIC) {
    this.NIC = NIC;
  }

  // firstName getter:
  public String getFirstName() {
    return firstName;
  }

  // lastName getter:
  public String getLastName() {
    return lastName;
  }

  // NIC getter:
  public String getNIC() {
    return NIC;
  }

  private boolean isValidName(String name) {
    // Check if the name is not null and not empty
    if (name != null && !name.isEmpty()) {
      // Check if the name contains only letters
      // (you can customize this based on your criteria)
      return name.matches("^[a-zA-Z]+$");
    }
    return false;
  }

}
