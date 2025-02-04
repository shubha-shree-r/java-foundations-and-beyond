package fundamentals;

import java.util.ArrayList;
import java.util.List;

public class OverLoading {
    private List items;

    public OverLoading() {
        items = new ArrayList<>();
//        System.out.println(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItem(String name, double price) {
        Item item = new Item(name, price);
        items.add(item);
    }

    public void addItem(String name, double price, int quantity) {
        Item item = new Item(name, price, quantity);
        items.add(item);
    }
    public static void main(String[] args) {
        OverLoading cart = new OverLoading();

        Item item1 = new Item("Shirt", 29.99);
        cart.addItem(item1);

        cart.addItem("Pants", 49.99);

        cart.addItem("Shoes", 79.99, 2);
        System.out.println(cart.items);
    }
}
class Item extends OverLoading{
    private String name;
    private double price;
    private int quantity;

    // Constructor for name and price (defaults quantity to 1)
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1; // Default quantity
    }

    // Constructor for name, price, and quantity
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters (if needed)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " x " + quantity;
    }
}
