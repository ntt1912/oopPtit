import java.util.Scanner;

public class EXCEPTION001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String currency1 = sc.next();
            int amount1 = sc.nextInt();
            String currency2 = sc.next();
            int amount2 = sc.nextInt();
            Amount a1 = new Amount(amount1, currency1);
            Amount a2 = new Amount(amount2, currency2);
            a1.add(a2);
        }
    }
}

class Amount {
    private int amount;
    private String currency;

    public Amount(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void add(Amount a) {
        try {
            if (!this.currency.equals(a.currency)) {
                throw new IllegalArgumentException();
            }
            this.amount += a.amount;
            System.out.println(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Currency doesn't match");
        }
    }

}