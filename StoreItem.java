public abstract class StoreItem{
    private String name;
    private double price;
    

    public StoreItem(String name, double price) {
        this.name = name;
        this.price = price;
        
    }

    public abstract void show();



public String getName() {
    return name;
}
public double getPrice() {
    return price;
}





    
}