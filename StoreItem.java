public abstract class StoreItem{
    private String name;
    private double price;
    private int quantity;

    public StoreItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract void show();



public String getName() {
    return name;
}
public double getPrice() {
    return price;
}
public int getQuantity() {
    return quantity;
}


    
}