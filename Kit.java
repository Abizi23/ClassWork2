public class Kit extends StoreItem{

    private int numberofbox;

    public Kit(String name, double price, int numberofbox) {
        super(name, price);
        this.numberofbox = numberofbox;
    }
    

    
        public void show(){
            System.out.println("Kit Specification:"+" "+getName()+" "+getNumberofbox()+": "+getPrice()+"ugx"+": "+" ");
        }



        public int getNumberofbox() {
            return numberofbox;
        }
    }
    
    

