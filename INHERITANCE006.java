public class INHERITANCE006 {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.play();
        f.walk();
        Cat c = new Cat("Fluffy");
        c.play();
        c.eat();
        Spider s = new Spider();
        s.eat();
        c.walk();
        s.walk();
    }
}

class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }

    public void eat() {
    }

}

class Spider extends Animal {
    public Spider() {
        super(8);
    }

    public void eat() {
        System.out.println("The spider eats a fly.");
    }
}

class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " likes to play with string.");
    }

    public void eat() {
        System.out.println("Cats like to eat spiders and mice.");
    }

}

class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play() {
        System.out.println("Fish swim in their tanks all day.");
    }

    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
        System.out.println("Fish, of course, can't walk; they swim.");
    }

    public void eat() {
        System.out.println("Fish eat pond scum.");
    }
}

interface Pet {
    public String getName();

    public void setName(String name);

    public void play();
}
