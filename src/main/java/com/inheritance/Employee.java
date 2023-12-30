package com.inheritance;

public abstract class Employee {
  private String firstName;
  private String lastName;
  private String socialSecurityNumber;

  // Constructor:
  public Employee(String first, String last, String ssn) {
    firstName = first;
    lastName = last;
    socialSecurityNumber = ssn;
  }

  // setters:
  public void setFirstName(String first) {
    firstName = first;
  }

  public void setLastName(String last) {
    lastName = last;
  }

  public void setSocialSecurityNumber(String ssn) {
    socialSecurityNumber = ssn;
  }

  // getters:
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  // Abstract method which will be implemented by the subclasses.
  public abstract double earnings();

  @Override
  public String toString() {
    return String.format("\n-> [class-Employee]\n Name: %s %s\n SSN: %s",
        getFirstName(), getLastName(), getSocialSecurityNumber());
  }

}
