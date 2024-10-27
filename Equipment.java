public class Equipment extends StoreItem{
    private int serialNumber;

    public Equipment(String name, double price, int quantity, int serialNumber) {
        super(name, price, quantity);
        this.serialNumber = serialNumber;
    }

    
}
