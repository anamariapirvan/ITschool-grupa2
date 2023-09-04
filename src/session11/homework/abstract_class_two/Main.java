package session11.homework.abstract_class_two;

public class Main {

    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Balance in Bank A: $ " + bankA.getBalance());
        System.out.println("Balance in Bank B: $ " + bankB.getBalance());
        System.out.println("Balance in Bank C: $ " + bankC.getBalance());
    }
}
