import java.util.HashMap;

public class COLLECTION001 {
    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        w.addProduct("milk", 10);
        w.addProduct("coffee", 7);
        System.out.println("prices:");
        System.out.println("milk: "+w.stock("milk"));
        System.out.println("coffee: "+w.stock("coffee"));
        System.out.println("sugar: "+w.stock("sugar"));
    }
}
class Warehouse{
    private HashMap<String, Integer> w;

    public Warehouse(){
        this.w = new HashMap<>();
    }
    public void addProduct(String product, int stock){
        w.put(product, stock);
    }
    public int stock(String product){
        if (w.containsKey(product)){
            return w.get(product);
        }
        return -99;
    }
}