package session10.homework.bank_account_management_system;

import java.util.UUID;

public class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = generateAccountNumber();
        this.balance = 0.0;
    }

    private String generateAccountNumber() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " units. New balance is: " + balance);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " units. New balance is: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount of insufficient funds" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void getAccountDetails() {
        System.out.println("Account holder: " + accountHolderName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void transferFunds(BankAccount targetAccount, double amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
            targetAccount.balance += amount;
            System.out.println("Transferred " + amount + " to account " + targetAccount.accountNumber);
        } else {
            System.out.println("Invalid transfer or insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ana Pirvan");
        BankAccount account2 = new BankAccount("Ion Popescu");


        account1.deposit(1000);
        account2.deposit(500);

        account1.withdraw(800);
        account2.withdraw(800);

        account1.transferFunds(account2, 200);

        account1.getAccountDetails();
        account2.getAccountDetails();
    }
}
