class ConstructorOverloading {
    private String name;
    private String location;
    private int weight;

    public ConstructorOverloading(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    public ConstructorOverloading(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public ConstructorOverloading(String name, int weight) {
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%dkg) can be found from the %s", name, weight, location);
    }
}
public class OOP010{
    public static void main(String[] args) {
        ConstructorOverloading main1 = new ConstructorOverloading("Tape measure");
        ConstructorOverloading main2 = new ConstructorOverloading("Plaster", "home improvement section");
        ConstructorOverloading main3 = new ConstructorOverloading("Tyre", 5);

        System.out.println(main1);
        System.out.println(main2);
        System.out.println(main3);
    }
}
