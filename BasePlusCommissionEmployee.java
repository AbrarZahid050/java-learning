
public class BasePlusCommissionEmployee extends CommissionEmployee {
  private double baseSalary;

  public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {

    // explicit call to superclass CommissionEmployee constructor
    super(first, last, ssn, sales, rate);

  }

  public void setBaseSalary(double salary) {
    if (salary >= 0.0) {
      baseSalary = salary;
    } else {
      throw new IllegalArgumentException("Base salary must be >= 0.0");
    }
  }

  public double getBaseSalary() {
    return baseSalary;
  }

  @Override
  public double earnings() {
    return baseSalary + (getCommissionRate() * getGrossSales());
  }

  @Override
  public String toString() {
    return String.format(
        "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
        "base-salaried commission employee", getFirstName(), getLastName(),
        "social security number", getSocialSecurityNumber(),
        "gross sales", getGrossSales(), "commission rate", getCommissionRate(),
        "base salary", getBaseSalary());
  }
}