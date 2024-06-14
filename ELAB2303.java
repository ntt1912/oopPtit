public class ELAB2303 {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");
        
        // a. What will be the output of the following code?
        if (m2.equals(m1)) {
            System.out.println("value compared: same");
        } else {
            System.out.println("value compared: different");
        }
        //reference comparison
        if (m2 == m1) {
            System.out.println("reference compared: same");
        } else {
            System.out.println("reference compared: different");
        }

    }
}

class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(MyStuff other) {
        return this.name.equals(other.getName());
    }
}