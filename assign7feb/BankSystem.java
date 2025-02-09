
import java.util.Scanner;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Savings Account with interest rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Checking Account with withdrawal limit: Rs" + withdrawalLimit);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(12345, 5000, 3.5);
        CheckingAccount c = new CheckingAccount(67890, 2000, 1000);

        s.displayAccountType();
        c.displayAccountType();
    }
}

