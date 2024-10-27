
    public class Reagent extends StoreItem{
        private double purity;
        private String expiry;

        public Reagent(String name, double price, int quantity, double purity, String expiry) {
            super(name, price, quantity);
            this.purity = purity;
            this.expiry = expiry;
        }

        public double getPurity() {
            return purity;
        }

        public String getExpiry() {
            return expiry;
        }
    
       
       
        
        
        
        
        
    
        
    
        
        
        
       
       
    }
    
