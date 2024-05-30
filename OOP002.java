import java.util.Scanner;

public class OOP002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            String[] input = sc.nextLine().split(" ");
            Rectangle r = new Rectangle(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3]));
            System.out.println(r);
        }
    }
}

class Rectangle{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle (int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    public String toString(){
        return "Rectangle[x="+x+",y="+y+",width="+width+",height="+height+"]";
    }
}