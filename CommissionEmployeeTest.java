public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee1 employee = new CommissionEmployee1(
                "John",
                "Smith",
                "123-456-7890",
                10000,
                .06);

        System.out.println("Employee information obtained by get methods; \n");

        System.out.printf("%s %s\n", "First name is", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is", employee.getLastName());
        System.out.printf("%s %s\n", "Social Security Number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %s\n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %s\n", "Commission rate is", employee.getCommissionRate());

        employee.setGrossSales(500);
        employee.setCommissionRate(.1);

        System.out.printf("\n%s: \n\n%s\n", "Updated employee information obtained by toString", employee);

    }
}
