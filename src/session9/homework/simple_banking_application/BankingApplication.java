package session9.homework.simple_banking_application;

import java.util.List;


public class BankingApplication {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ana Pirvan", "575657", 5000.56);
        account.deposit(500);
        account.withdraw(400);
        account.withdraw(300);
        account.deposit(1000);
        account.withdraw(9000);

        System.out.println("Account holder: " + account.getAccountHolderName());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Current balance: " + account.getBalance());

        System.out.println("Recent transactions:");
        List<Transaction> transactions = account.getTransactions();
        for (Transaction transaction : transactions) {
            System.out.println(
                    "Type: " + transaction.getType() +
                            ", Amount: $" + transaction.getAmount() +
                            ", Balance After Transaction: $" + transaction.getBalanceAfterTransaction()
            );
        }
    }
}
