public class Kit extends StoreItem{

    private int numberofbox;

    public Kit(String name, double price, int quantity, int numberofbox) {
        super(name, price, quantity);
        this.numberofbox = numberofbox;
    }
    

    
        public void show(){
            System.out.println("Kit Specification:"+" "+getName()+" "+getNumberofbox()+": "+getPrice()+"ugx"+": "+" "+getQuantity()+"ml")
        }



        public int getNumberofbox() {
            return numberofbox;
        }
    }
    
    
}
