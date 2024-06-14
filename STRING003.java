import java.util.Scanner;

public class STRING003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s1 = sc.nextLine().toLowerCase();
            String s2 = sc.nextLine().toLowerCase();
            if (s1.equals(s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
