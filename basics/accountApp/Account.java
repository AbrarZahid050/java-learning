package basics.accountApp;

public class Account {
    private double balance;

    // constructor:
    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        balance = balance + amount;
    }
}
