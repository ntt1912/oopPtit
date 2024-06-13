import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LAB02_StaticClass {
    public static class Account {
        public int id;
        public String name;
        public int balance = 0;

        Account(int id, String name, int in) {
            this.id = id;
            this.name = name;
            this.balance = in;
        }

        @Override
        public String toString() {
            String id_r = String.format("%03d", this.id);
            return "[" + id_r + ", " + this.name + ", " + balance + "]";
        }

        public void rut(int amount) {
            if (balance >= amount) {
                balance -= amount;
            }
        }

        public void nap(int amount) {
            balance += amount;
        }

        public void chuyen(int amount, Account recipient) {
            if (balance >= amount) {
                balance -= amount;
                recipient.nap(amount);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Account> list_Account = new ArrayList<>();
            String[] input = scanner.nextLine().split(" ");
            int l = input.length;
            String tmp = "";
            for (int i = 0; i < l; i++) {
                try {
                    int in = Integer.parseInt(input[i]);
                    list_Account.add(new Account(list_Account.size() + 1, tmp.trim(), in));
                    tmp = "";
                } catch (Exception e) {
                    tmp = tmp + " " + input[i];
                }
            }
            if (!tmp.equals("")) {
                list_Account.add(new Account(list_Account.size() + 1, tmp.trim(), 0));
            }
            n = scanner.nextInt();
            while (n-- > 0) {
                String acc = scanner.next();
                if (acc.equals("rut")) {
                    int id_r = Integer.parseInt(scanner.next());
                    int amount_r = Integer.parseInt(scanner.next());
                    if (checkId(list_Account, id_r))
                        list_Account.get(id_r - 1).rut(amount_r);
                } else if (acc.equals("nap")) {
                    int id_n = Integer.parseInt(scanner.next());
                    int amount_n = Integer.parseInt(scanner.next());
                    if (checkId(list_Account, id_n))
                        list_Account.get(id_n - 1).nap(amount_n);
                } else if (acc.equals("chuyen")) {
                    int id_m = Integer.parseInt(scanner.next());
                    int id_s = Integer.parseInt(scanner.next());
                    int amount_c = Integer.parseInt(scanner.next());
                    if (checkId(list_Account, id_m) && checkId(list_Account, id_s)) {
                        Account sender = list_Account.get(id_m - 1);
                        Account receiver = list_Account.get(id_s - 1);
                        sender.chuyen(amount_c, receiver);
                    }
                }
            }
            for (Account x : list_Account) {
                System.out.print(x);
            }
            System.out.println();
        }
        scanner.close();
    }

    public static boolean checkId(List<Account> list_Account, int id) {
        for (Account acc : list_Account) {
            if (acc.id == id) {
                return true;
            }
        }
        return false;
    }
}
