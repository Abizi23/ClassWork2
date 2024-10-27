
    public class Reagent extends StoreItem{
        private double purity;
        private String expiry;
        private int quantity;

        public Reagent(String name, double price, int quantity, double purity, String expiry) {
            super(name, price);
            this.quantity=quantity;
            this.purity = purity;
            this.expiry = expiry;
        }


        public int getQuantity(){
            return quantity;
        }

        public double getPurity() {
            return purity;
        }

        public String getExpiry() {

            return expiry;
        }
    

        public void show(){
            System.out.println("Reagent Specification:"+" "+getName()+" "+getExpiry()+": "+getPrice()+"ugx"+": "+getPurity()+" "+getQuantity()+"ml");
        }

        
        public double calculatePrice(){
            if(getPurity()<0.5){
                return getPrice()*0.05;
            }else{
                return getPrice();

            }
        }
        

        
        
        
       
        
        
        }
       
        
        
        
        
        
    
        
    
        
        
        
       
       
    
    
