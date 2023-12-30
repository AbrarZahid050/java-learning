package com.basic;

import java.util.List;

public class Company {
  private String companyName;
  private List<Employee> employees;

  // Constructor:
  public Company(String name, List<Employee> employees) {
    companyName = name;
    this.employees = employees;
  }

  public String getCompanyName() {
    return companyName;
  }

  public List<Employee> getEmployeesList() {
    return employees;
  }

  // public void display(Employee employee) {
  // System.out.printf("\n%s works at %s", employee.getFirstName(), companyName);
  // }

}
