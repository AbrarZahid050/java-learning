public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
                "333-33-3333", 5000, .04, 300);

        // invoke toString method on superClass obj using superClass var:
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call CommissionEmployee's toString with superclass reference ",
                "to superclass object", commissionEmployee.toString());

        // invoke toString method on subClass obj using subClass var:
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call basePlusCommissionEmployee's toString with subclass reference",
                "to subclass object", basePlusCommissionEmployee.toString());

        // superClass obj refering to subclass object:
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;

        System.out.printf("%s %s:\n\n%s\n",
                "Call BasePlusCommissionEmployee's toString with superclass",
                "reference to subclass object", commissionEmployee2.toString());
    }
}
