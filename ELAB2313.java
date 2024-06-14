import java.util.*;

class Point {
    private double x; // x co-ordinate
    private double y; // y co-ordinate
    private double z; // z co-ordinate

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}

class Line {
    private Point start;
    private Point end;
    
    // Constructor
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    
    // Method to calculate length of the line
    public double length() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        double dz = end.getZ() - start.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}



public class ELAB2313 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Map<String, Point> points = new LinkedHashMap<>();
        String startPointName = null;
        int i = 0;
        while (true) {
            i++;
            try{
            String pointName= scanner.nextLine().trim();
            startPointName = pointName;
            String[] point = scanner.nextLine().trim().split("\\s+");
            if (point.length < 3) {
                break;
            }
            if (points.containsKey(pointName) || pointName.isEmpty()) {
                pointName += i;
            }
            double x = Double.parseDouble(point[0]);
            double y = Double.parseDouble(point[1]);
            double z = Double.parseDouble(point[2]);
            points.put(pointName, new Point(x, y, z));
            } catch (Exception e) {
                break;
            }
        }
        if (points.size() <= 1) {
            System.out.print("invalid input");
            return;
        }

        if (startPointName == null || !points.containsKey(startPointName)) {
            System.out.print("invalid input");
            return;
        }

        Point startPoint = points.get(startPointName);
        for (Map.Entry<String, Point> entry : points.entrySet()) {
            if (entry.getKey().equals(startPointName)) {
                continue;
            }

            Point endPoint = entry.getValue();
            Line line = new Line(startPoint, endPoint);
            double length = line.length();

            if (length == 0) {
                System.out.println("Line " + startPointName + entry.getKey() + ": same point");
            } else {
                System.out.printf("Line %s%s: %.2f\n", startPointName, entry.getKey().replaceAll("\\d+", ""), length);
            }
        }
    }
}
