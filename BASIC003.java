import java.util.Scanner;

public class BASIC003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String text = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append("Hi ");
            sb.append(text);
            System.out.println(sb);
        }
    }
}
