import java.util.Scanner;

public class B24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(s[0]);
            int num2 = Integer.parseInt(s[1]);
            System.out.println(num1 + num2+" "+(num1 - num2)+" "+num1 / num2);
        }
    }
}

