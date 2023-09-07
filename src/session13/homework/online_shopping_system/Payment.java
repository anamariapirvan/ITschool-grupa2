package session13.homework.online_shopping_system;

public class Payment {
    private String paymentMethod;
    private double paymentAmount;
    private PaymentStatus paymentStatus;

    public Payment(String paymentMethod, double paymentAmount) {
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.paymentStatus = PaymentStatus.PENDING;
    }

    public int processPayment() {
        paymentStatus = PaymentStatus.COMPLETED;
        return 0;
    }

    public void displayPaymentInfo() {
        System.out.println("Payment method: " + paymentMethod);
        System.out.println("Payment amount: " + paymentAmount);
        System.out.println("Payment status: " + paymentStatus);
    }

    public void updatePaymentStatus(PaymentStatus newStatus) {
        this.paymentStatus = newStatus;
    }
}
