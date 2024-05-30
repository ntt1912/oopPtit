import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Car {
    protected double price;
    protected int year;
    protected double salePrice;
    protected static double mostExpensive = 0;

    public Car(double price, int year) {
        this.price = price;
        this.year = year;
        this.salePrice = calculateSalePrice();
        if (this.salePrice > mostExpensive) {
            mostExpensive = this.salePrice;
        }
    }

    protected abstract double calculateSalePrice();

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Price: " + df.format(this.salePrice) + " VND | Year: " + this.year;
    }

    public static String getMostExpensive() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Most Expensive: " + df.format(mostExpensive) + " VND";
    }
}

class ClassicCar extends Car {
    public ClassicCar(double price, int year) {
        super(price, year);
    }

    @Override
    protected double calculateSalePrice() {
        return this.price * 1.12 + 20000000;
    }
}

class SportCar extends Car {
    public SportCar(double price, int year) {
        super(price, year);
    }

    @Override
    protected double calculateSalePrice() {
        if (this.year > 2018) {
            return this.price * 0.8;
        } else if (this.year > 2010) {
            return this.price * 0.5;
        } else {
            return this.price * 0.1;
        }
    }
}

public class ELAB2308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] carData = sc.nextLine().split(" ");
            String type = carData[0];
            double price = Double.parseDouble(carData[1]);
            int year = Integer.parseInt(carData[2]);
            Car car;
            if (type.equals("CC")) {
                car = new ClassicCar(price, year);
            } else {
                car = new SportCar(price, year);
            }
            System.out.println(car);
        }
        System.out.println(Car.getMostExpensive());
        sc.close();
    }
}
