import basics.accountApp.Account;
import java.util.Scanner;

public class AccountTest {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        double depositAmount;

        Account account1 = new Account(25);
        Account account2 = new Account(0);

        System.out.printf("Balance of account 1: $%.2f\n", account1.getBalance());
        System.out.printf("Balance of account 2: $%.2f\n", account2.getBalance());

        System.out.print("Enter the amount to be deposited in account 1: ");
        depositAmount = input.nextDouble();
        account1.credit(depositAmount);
        System.out.printf("New balance of account 1: $%.2f\n", account1.getBalance());

        System.out.print("Enter the amount to be deposited in account 2: ");
        depositAmount = input.nextDouble();
        account2.credit(depositAmount);
        System.out.printf("New balance of account 2: $%.2f\n", account2.getBalance());

        input.close();

    }

}
