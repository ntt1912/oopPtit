import java.math.BigDecimal;
import java.util.Scanner;

public class LAB01_BigDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            BigDecimal sum = BigDecimal.ZERO;
            String[] nums = sc.nextLine().split(" ");
            for (String s : nums) {
                BigDecimal a = new BigDecimal(s);
                BigDecimal fractionalPart = a.remainder(BigDecimal.ONE);
                sum = sum.add(fractionalPart);
            }
            System.out.println(sum);
        }
    }
}