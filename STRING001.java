import java.util.Scanner;

public class STRING001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            int index = Integer.parseInt(s[1]);
            String text = s[0];
            char c = text.charAt(index);
            System.out.println("The character at position "+ index + " is " +c);
        }
    }
}
