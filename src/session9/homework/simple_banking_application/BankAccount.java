package session9.homework.simple_banking_application;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public BankAccount(String accountHolderName, String accountNumber, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.transactions = new ArrayList<>();
        this.transactions.add(new Transaction("Initial Deposit", initialDeposit, initialDeposit));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount, balance));
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", -amount, balance));
        } else {
            System.out.println("Insufficient funds");
        }

    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
