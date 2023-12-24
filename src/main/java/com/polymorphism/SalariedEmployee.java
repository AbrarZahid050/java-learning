package com.polymorphism;

public class SalariedEmployee extends Employee {
  private double weeklySalary;

  // constructor:
  public SalariedEmployee(String first, String last, String ssn, double salary) {
    super(first, last, ssn); // call superclass constructor
    setWeeklySalary(salary);
  }

  public void setWeeklySalary(double salary) {
    if (salary >= 0.0) {
      weeklySalary = salary;
    } else {
      throw new IllegalArgumentException("weekly salary must be >= 0.0");
    }
  }

  public double getWeeklySalary() {
    return weeklySalary;
  }

  @Override
  public double getPaymentAmount() {
    return getWeeklySalary();
  }

  @Override
  public String toString() {
    return String.format("salaried employee: %s\n%s: $%,.2f",
        super.toString(), "weekly salary", getWeeklySalary()); // call superclass toString
  }
}
