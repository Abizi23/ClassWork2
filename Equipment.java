public class Equipment extends StoreItem{
    private int serialNumber;

    public Equipment(String name, double price, int serialNumber) {
        super(name, price);
        this.serialNumber = serialNumber;
    }

    public double calculatePrice(){
        return getPrice();
    }

    

    public void show(){
        System.out.println("Equipment Specification:"+" "+getName()+" "+getSerialNumber()+": "+getPrice()+"ugx"+": "+" ");
    }



    public int getSerialNumber() {
        return serialNumber;
    }
}
