import java.util.Scanner;

class SlopePoint {
    private long x;
    private long y;

    public SlopePoint(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public double slope(SlopePoint other) {
        if (this.x == other.x) {
            return -1;
        } else if (this.y == other.y) {
            return 0;
        } else {
            return (double) (other.y - this.y) / (other.x - this.x);
        }
    }
}

public class OOP009 {
    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            for (int i = 0; i < testCases; i++) {
                long x1 = scanner.nextLong();
                long y1 = scanner.nextLong();
                long x2 = scanner.nextLong();
                long y2 = scanner.nextLong();
                SlopePoint point1 = new SlopePoint(x1, y1);
                SlopePoint point2 = new SlopePoint(x2, y2);
                System.out.println(point1.slope(point2));
            }
        }
    }
}