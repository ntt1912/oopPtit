import java.util.Scanner;

class Planet {
    private String name;
    private double mass;
    private double radius;

    public Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }
    public String getName() {
        return name;
    }

    public double calculateWeight(double weightOnEarth) {
        final double G = 6.67300e-11;
        final double surfaceGravityEarth = G * 5.976e+24 / Math.pow(6.37814e6, 2);
        double mass = weightOnEarth / surfaceGravityEarth;
        double surfaceGravity = G * this.mass / Math.pow(this.radius, 2);
        return mass * surfaceGravity;
    }
}
public class ELAB2314{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double mass = Double.parseDouble(scanner.nextLine());
        double radius = Double.parseDouble(scanner.nextLine());
        double weightOnEarth = Double.parseDouble(scanner.nextLine());

        Planet planet = new Planet(name, mass, radius);
        double weightOnPlanet = planet.calculateWeight(weightOnEarth);

        System.out.printf("Your weight on %s is %.2f\n", planet.getName(), weightOnPlanet);
    }
}