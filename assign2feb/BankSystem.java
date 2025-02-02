
import java.util.*;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    void display() {
        System.out.println("Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: Rs" + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void showDetails() {
        System.out.println("Savings Account - Account Number: " + accountNumber + ", Holder: " + accountHolder);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("111222", "John", 5000);
        acc.deposit(1000);
        acc.withdraw(200);
        acc.display();

        SavingsAccount savAcc = new SavingsAccount("333444", "Snow", 3000);
        savAcc.showDetails();
    }
}

