
public class BasePlusCommissionEmployee extends CommissionEmployee {
  private double baseSalary;

  public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {

    // explicit call to superclass CommissionEmployee constructor
    super(first, last, ssn, sales, rate);
    setBaseSalary(salary);
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
    // return baseSalary + (getCommissionRate() * getGrossSales());
    return getBaseSalary() + super.earnings();
  }

  @Override
  public String toString() {
    return String.format("%s %s\n%s: %.2f", "base-salaried",
        super.toString(), "base salary", getBaseSalary());
  }
}