import java.util.Scanner;

public class OOP005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("Circle")) {
                Circle c = new Circle(input[0], Double.parseDouble(input[1]));
                c.displayInfo();
            } else if (input[0].equals("Rectangle")) {
                Rectangle r = new Rectangle(input[0], Double.parseDouble(input[1]), Double.parseDouble(input[2]));
                r.displayInfo();
            }
        }
    }
}
abstract class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    public abstract double calculateArea();

    public void displayInfo(){
        System.out.printf("Shape:%s|Area:%.2f\n", name, calculateArea());
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}
