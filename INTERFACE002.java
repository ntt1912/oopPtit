public class INTERFACE002 {
    public static void main(String[] args) {
        TripleTacobox t = new TripleTacobox();
        t.eat();
        t.eat();
        System.out.println("Triple taco boxes left: "+t.tacosRemaining());
        CustomTacoBox c = new CustomTacoBox(8);
        c.eat();
        System.out.println("Custom taco boxes left: "+c.tacosRemaining());
    }
}
interface TacoBox{
    int tacosRemaining();
    void eat();
}
class CustomTacoBox implements TacoBox{
    private int tacos;
    
    public CustomTacoBox(int tacos){
        this.tacos=tacos;
    }
    
    @Override
    public int tacosRemaining() {
        return tacos;
    }
    
    @Override
    public void eat() {
        if (tacos>0){
            tacos--;
        }
    }
}
class TripleTacobox implements TacoBox{
    private int tacos;

    public TripleTacobox(){
        this.tacos=3;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (tacos>0){
            tacos--;
        }
    }
}

