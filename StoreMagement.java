import java.util.ArrayList;
import java.util.List;

public class StoreMagement {
    public static void main(String[] args) {
        List<StoreItem>storeItems=new ArrayList<>();
        storeItems.add(new Reagent("HCl",50,1,0.9,"08/12/2025"));
        storeItems.add(new Kit("HCV",23,5));
        storeItems.add(new Equipment("Chemsitry Analyzer",5000,241026));
        
        for (StoreItem item:storeItems){
            item.show();
            
            
        }
    }
    
}
