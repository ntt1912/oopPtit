import java.util.Scanner;

public class STRING004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.length());
        }
    }
}
