import java.util.Scanner;

public class BASIC005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String [] s = sc.next().split(" ");
            int num1 = Integer.parseInt(s[0]);
            int num2 = Integer.parseInt(s[1]);
            int num3 = Integer.parseInt(s[2]);
            int num4 = Integer.parseInt(s[3]);
            int num5 = Integer.parseInt(s[4]);
            int sum = num1 + num2 + num3 + num4 + num5;
            System.out.println(sum);
        }
    }
}
