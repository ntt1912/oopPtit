import java.util.Scanner;

public class LAB01_ClassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            int count = arr.length;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[j]);
                if (j != arr.length - 1) {
                    sb.append(" ");
                }
            }
            int length = sb.length();
            System.out.println(length + " " + count);

        }
    }
}
