public class INHERITANCE003 {
    public static void main(String[] args) {
        GroceryBill bill = new GroceryBill(new Employee("Grocery Bill"));
        bill.add(new Item("item 1", 2.3, 0));
        bill.add(new Item("item 2", 3.45, 0));
        System.out.println(bill);
        DiscountBill dbill = new DiscountBill(new Employee("Discount Bill"));
        dbill.add(new Item("item 3", 20, 15));
        dbill.add(new Item("item 4", 40, 35));
        dbill.add(new Item("item 5", 50, 55));
        System.out.println(dbill);
    }
}

class Item {
    private String name;
    private double price;
    private double discount;

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {

        return name + " $" + String.format("%.2f", price) + " (-$" + String.format("%.2f", discount) + ")";
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class GroceryBill {
    private Employee clerk;
    private Item[] receipt;
    private double total;

    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
        receipt = new Item[100];
        total = 0;
    }

    public void add(Item i) {
        for (int j = 0; j < receipt.length; j++) {
            if (receipt[j] == null) {
                receipt[j] = i;
                total += i.getPrice() - i.getDiscount();
                break;
            }
        }
    }

    public double getTotal() {
        return total;
    }

    public Employee getClerk() {
        return clerk;
    }

    public Item[] getReceipt() {
        return receipt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("items:\n");
        for (int i = 0; i < receipt.length; i++) {
            if (receipt[i] == null) {
                break;
            }
            sb.append("   " + receipt[i] + "\n");
        }
        sb.append("total: $" + String.format("%.2f", total) + "\n");
        sb.append("Clerk: " + clerk.getName() + "\n");
        return sb.toString();
    }
}

class DiscountBill extends GroceryBill {
    private double discountAmount;

    public DiscountBill(Employee clerk) {
        super(clerk);
        discountAmount = 0;
    }

    @Override
    public void add(Item i) {
        super.add(i);
        if (i.getDiscount() > 0) {
            discountAmount += i.getDiscount();
        }
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("items:\n");
        for (int i = 0; i < getReceipt().length; i++) {
            if (getReceipt()[i] == null) {
                break;
            }
            sb.append("   " + super.getReceipt()[i] + "\n");
        }
        sb.append("sub-total: $" + String.format("%.2f", super.getTotal() + discountAmount) + "\n");
        sb.append("discount: $" + String.format("%.2f", discountAmount) + "\n");
        sb.append("total: $" + String.format("%.2f", super.getTotal()) + "\n");
        sb.append("Clerk: " + super.getClerk().getName());
        return sb.toString();

    }
}