package com.inheritance;

public class SalariedEmployee extends Employee {
  private double weeklySalary;

  // Constructor:
  public SalariedEmployee(String firstName, String lastName, String ssn, double salary) {
    super(firstName, lastName, ssn); // passing to Employee's constructor
    setWeeklySalary(salary);
  }

  // setter:
  public void setWeeklySalary(double salary) {
    if (salary >= 0.0) {
      weeklySalary = salary;
    } else {
      throw new IllegalArgumentException("Wage must be a number >= 0.0");
    }
  }

  // getter:
  public double getWeeklySalary() {
    return weeklySalary;
  }

  @Override
  public double earnings() {
    return getWeeklySalary();
  }

  @Override
  public String toString() {
    return String.format("\n-> [class-SalariedEmployee]%s\n wage: $%.2f",
        super.toString(),
        getWeeklySalary());
  }
}
