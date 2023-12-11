import employee.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.printf("Employee before instantiation: %d\n", Employee.getCount());

        Employee em1 = new Employee("first_test1", "last_test1");
        Employee em2 = new Employee("first_test2", "last_test2");
        Employee em3 = new Employee("first_test3", "last_test3");

        System.out.printf("Employee after instantiation: %d ", Employee.getCount());

        // in this example, there is only one reference to each Employee,
        // so the following statements indicate that these objects
        // are eligible for garbage collections
        em1 = null;
        em2 = null;
        em3 = null;
    }
}