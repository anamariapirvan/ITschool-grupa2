package session13.homework.online_shopping_system;

import java.util.List;

public class Order {

    private static int nextOrderNumber = 1;
    private int orderNumber;
    private Customer customer;
    private List<Product> products;
    private OrderStatus orderStatus;

    public Order(Customer customer, List<Product> products) {
        this.orderNumber = nextOrderNumber;
        this.customer = customer;
        this.products = products;
        this.orderStatus = OrderStatus.PLACED;
    }
    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalAmount() {
        double totalAmount = 0.0;
        for (Product product : products) {
            totalAmount += product.getPrice();
        }
        return totalAmount;
    }

    public void displayOrderInfo() {
        System.out.println("Order number: " + orderNumber);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total amount: " + calculateTotalAmount());
        System.out.println("Order status: " + orderStatus);
    }

    public void updateOrderStatus(OrderStatus newStatus) {
        this.orderStatus = newStatus;
    }
}
