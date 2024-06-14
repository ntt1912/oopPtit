public class CONTEST006 {
    public static void main(String[] args) {
        Money a = new Money(10, 8);
        Money b = new Money(5, 5);
        Money c = a.add(b);
        System.out.println(a); // 10.08
        System.out.println(b); // 5.05
        System.out.println(c); // 15.13
        Money u = new Money(10, 0);
        Money y = new Money(3, 0);
        Money w = new Money(5, 0);
        System.out.println(u.lessThan(y)); // false
        System.out.println(y.lessThan(w)); // true
        Money m = new Money(10, 0);
        Money n = new Money(3, 50);
        Money o = m.minus(n);
        System.out.println(m); // 10.00
        System.out.println(n); // 3.50
        System.out.println(o); // 6.50
        o = o.minus(m);
        System.out.println(o); // 0.00
    }
}

class Money {
    public int euros;
    public int cent;

    public Money(int euros, int cent) {
        this.euros = euros;
        this.cent = cent;
    }

    public String toString() {
        return String.format("%.2f"+"e", euros + cent / 100.0);
    }

    public Money add(Money added) {
        int newEuros = euros + added.euros;
        int newCents = cent + added.cent;
        if (newCents >= 100) {
            newEuros++;
            newCents -= 100;
        }
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros) {
            return true;
        } else if (euros == compared.euros && cent < compared.cent) {
            return true;
        }
        return false;
    }

    public Money minus(Money minus) {
        if (lessThan(minus)) {
            return new Money(0, 0);
        }
        int newEuros = euros - minus.euros;
        int newCents = cent - minus.cent;
        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }
        return new Money(newEuros, newCents);
    }
}