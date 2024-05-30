public class OBJECT_REFERENCES002 {
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1,2,2000);
        System.out.println(d.equals("hehe"));
        System.out.println(d.equals(new SimpleDate(5,2,2012)));
        System.out.println(d.equals(new SimpleDate(1,2,2000)));
    }
}
class SimpleDate{
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public boolean equals(Object obj){
        if (obj instanceof SimpleDate){
            SimpleDate date = (SimpleDate) obj;
            return this.day==date.day && this.month==date.month && this.year==date.year;
        }

        return false;
    }
}
