import java.util.Scanner;
import java.lang.Math;

public class OOP004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int xA = Integer.parseInt(input[0]);
            int yA = Integer.parseInt(input[1]);
            int xB = Integer.parseInt(input[2]);
            int yB = Integer.parseInt(input[3]);
            Point A = new Point(xA, yA);
            Point B = new Point(xB, yB);
            A.move(1, 1);
            A.distance(B);
        }
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void distance(Point p) {
        double distance = Math.sqrt((x - p.getX()) * (x - p.getX()) + (y - p.getY()) * (y - p.getY()));
        System.out.printf("%.2f\n", distance);
    }
}
