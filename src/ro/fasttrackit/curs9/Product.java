package ro.fasttrackit.curs9;

public class Product {
    protected int price;
    protected String name;
    protected String description;
    protected int quantity;

    public Product() {
        this(50, 6, "milk", "drink fast");
    }

    public Product(int price, int quantity) {
        this(price, quantity, "milk", "drink fast");
    }

    public Product(int price, int quantity, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public void livrareMarfa(int cantitate) {
        this.quantity += cantitate;

    }

    protected void sale(int percent) {
        this.price = price - price * percent / 100;
    }

    public void soldOut() {
        this.quantity = 0;
    }

    public void priceIncrease(int amount) {
        this.price = price + amount;

    }

    public String toString() {
        return name + " Cantitate: " + quantity + "; pret: " + price + "; descriere: " + description;
    }

    public void restock() {
        this.quantity = 10;
    }

    public void newProduct(String name, int price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

}
