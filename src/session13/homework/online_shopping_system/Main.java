package session13.homework.online_shopping_system;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Ana", "pirvan.anamaria@gmail.com", "Brasov, Romania", "Brasov, Romania");
        Product product1 = new Product("Product1", "Description1", 20.99, 20);
        Product product2 = new Product("Product2", "Description2", 30.99, 10);

        customer1.addToShippingCart(product1);
        customer1.addToShippingCart(product2);

        product1.displayProductInfo();
        product2.displayProductInfo();

        Order order1 = customer1.placeOrder();

        // Add products to the order before calculating the total amount
        order1.addProduct(product1);
        order1.addProduct(product2);

        order1.displayOrderInfo();

        System.out.println("Order history for " + customer1.getName() + " : ");
        for (Order order : customer1.viewOrderHistory()) {
            order.displayOrderInfo();
        }

        Payment payment1 = new Payment("Credit card", order1.calculateTotalAmount());
        payment1.processPayment();
        payment1.displayPaymentInfo();
    }
}
