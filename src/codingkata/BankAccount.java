package codingkata;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount){
        balance -=amount;
        System.out.println("Withdraw: " +amount);
    }
}
