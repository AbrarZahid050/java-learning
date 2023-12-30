package com.basic;

import java.util.ArrayList;
import com.inheritance.Employee;
import com.inheritance.SalariedEmployee;

public class Basic {
  public static void main(String[] args) {

    // Upcasting:
    Employee employee1 = new SalariedEmployee(
        "Abrar",
        "Zahid",
        "111-11-111",
        1000);

    SalariedEmployee employee2 = new SalariedEmployee(
        "Test",
        "Test",
        "111-11-222",
        5000);

    // Downcasting:
    ((SalariedEmployee) employee1).getWeeklySalary();

    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(employee1);
    employees.add(employee2);

    for (Employee em : employees) {
      System.out.println("\n" + em);
    }

  }

}

// Setting color for the console out:
// String yellow = "\u001B[33m";
// String red = "\u001B[31m";
// ---------------------------------------------------------
// logging the values of the employee attributes to the console:
// employee1.display(yellow);
// employee2.display(red);
// ---------------------------------------------------------
// // Instantiating employee object:
// Employee employee1 = new Employee(
// "Abrar",
// "Zahid",
// "111-11-111");
// ---------------------------------------------------------
// Employee employee2 = new Employee(
// "Test",
// "Test",
// "222-22-222");
// ---------------------------------------------------------
// List<Employee> employeeList = new ArrayList<>();
// employeeList.add(employee1);
// employeeList.add(employee2);
// ---------------------------------------------------------
// Company company = new Company("Devsinc", employeeList);
// List<Employee> employeesInCompany = company.getEmployeesList();
// ---------------------------------------------------------
// for (Employee em : employeesInCompany) {
// System.out.printf("\nName: %s %s", em.getFirstName(), em.getLastName());
// }