import java.util.Arraylist;
import java.util.List;

public class StoreMagement {
    public static void main(String[] args) {
        List<StoreItem>storeItems=new Arraylist<>();
        storeItems.add(new Reagent("HCl",50,1,0.9,"08/12/2025"));
        storeItems.add(new Kit("hcv",5,100,5));
        
    }
    
}
