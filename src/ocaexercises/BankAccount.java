
/* Problem: Create a Bank Account Class

You are tasked with creating a simple Bank Account class that can be used to manage bank accounts. The class should have the following features:

Initialize the account with an account number, account holder's name, and initial balance.
Allow deposits and withdrawals from the account.
Display the current balance. */
package ocaexercises;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        //Initialize instance variables
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayBalance() {
        System.out.println("Account balance is: " + balance);
    }

    public static void main(String[] args) {
        //Create an instance of BankAccount
        BankAccount account = new BankAccount("12345", "Ana Pirvan", 1200);
        // perform some operation on the account
        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();

    }
}
