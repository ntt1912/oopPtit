import java.util.ArrayList;

public class INHERITANCE002 {
    public static void main(String[] args) {
        Box box = new BoxWithMaxWeight(10);
        Item item1 = new Item("Saludo", 5);
        Item item2 = new Item("Pirkka", 5);
        Item item3 = new Item("Kopi Luwak", 5);
        box.add(item1);
        box.add(item2);
        box.add(item3);
        box.isInBox(item1);
        box.isInBox(item2);
        box.isInBox(item3);
    }
}
class Item{
    private String name;
    private int weight;

    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public Item(String name){
        this.name = name;
        this.weight = 1;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }
}

abstract class Box{
    public abstract void add(Item item);
    public abstract void isInBox(Item item);
}

class BoxWithMaxWeight extends Box{
    private ArrayList<Item> items;
    private int maxWeight;

    public BoxWithMaxWeight(int maxWeight){
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }
    public void add(Item item){
        int totalWeight = 0;
        for(Item i : items){
            totalWeight += i.getWeight();
        }
        if(totalWeight + item.getWeight() <= maxWeight){
            items.add(item);
        }
    }
    public void isInBox(Item item){
        if(items.contains(item)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}