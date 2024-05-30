public class OOP001 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("1234");
        b.deposit(10);
        b.deposit(50);
        b.deposit(70);
        b.deposit(10);
        System.out.println(b.transactionFee(5));
    }
}

class BankAccount {
    private String id;
    private double balance;
    private int transactions;

    public BankAccount(String id) {
        this.id = id;
        this.balance = 0;
        this.transactions = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getId() {
        return id;
    }

    public int getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        if (amount > 0 && amount < 500) {
            this.balance += amount;
            this.transactions++;
        }
    }

    public void withdraw(double amount) {
        if (balance - amount >= 0 && amount > 0) {
            this.balance -= amount;
            this.transactions++;
        }
    }

    public boolean transactionFee(double amount) {
        for (int i = 1; i <= transactions; i++) {
            this.balance -= amount * i;
        }
        if (this.balance < 0) {
            this.balance = 0;
            return false;
        } else {
            return true;
        }
    }
}