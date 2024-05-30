import java.util.Scanner;

public class BASIC007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int year = sc.nextInt();
            sc.nextLine();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year+": Leap-Year");
            } else {
                System.out.println(year+": Non Leap-Year");
            }
        }
    }
}
