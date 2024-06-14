import java.util.ArrayList;
import java.util.Scanner;

public class POLYMORPHISM002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Organism o = new Organism(x, y);
            Herd h = new Herd();
            h.addMoveable(o);
            h.move(1, 1);
            System.out.println(h);
        }
    }
}

interface Moveable {
    void move(int dx, int dy);
}

class Organism implements Moveable {
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public String toString() {
        return "x:" + x + ";y:" + y;
    }
}

class Herd implements Moveable {
    private ArrayList<Moveable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }

    public void addMoveable(Moveable m) {
        herd.add(m);
    }

    public void move(int dx, int dy) {
        for (Moveable m : herd) {
            m.move(dx, dy);
        }
    }

    public String toString() {
        String result = "";
        for (Moveable m : herd) {
            result += m + "\n";
        }
        return result;
    }
}