package session13.homework.online_shopping_system;

public class Product {
    private String name;
    private String description;
    private double price;
    private int quantity;

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice(){
        return price;
    }

    public void addToInventory(int quantity) {
        this.quantity += quantity;
    }

    public void removeFromInventory(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Not enough stock to remove.");
        }
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in stock: " + quantity);
    }

    public boolean isInStock() {
        return quantity > 0;
    }


}
