import java.util.Scanner;

public class STRING002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if (s1.contains(s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            } 
        }
    }
}
