package session13.homework.online_shopping_system;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String email;
    private String shippingAddress;
    private String billingAddress;
    private List<Product> shoppingCart;
    private List<Order> orderHistory;

    Customer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.shoppingCart = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
    }
    public void addToShippingCart(Product product){
        shoppingCart.add(product);
    }
    public void removeFromShoppingCart(Product product){
        shoppingCart.remove(product);
    }
    public Order placeOrder() {
        Order order = new Order(this, shoppingCart);
        orderHistory.add(order);
        shoppingCart.clear();
        return order;
    }
    public List<Order> viewOrderHistory(){
        return orderHistory;
    }
    public void trackOrderStatus(Order order){

    }

    public String getName() {
        return name;
    }
}
