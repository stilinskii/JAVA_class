package src.java_test.test12;

public class Fruit {
    private String name;
    private int price;
    private int quantity;
    
    public Fruit() {
    }

    public Fruit(String name, int price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString() {
	return null;
    }
    
}
