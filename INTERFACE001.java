public class INTERFACE001 {
    public static void main(String[] args) {
        Packable[] items = { new Book("Fyodor Dostoevsky", "Crime and Punishment", 2.0),
                new Book("Robert Martin", "Clean Code", 1.0),
                new Book("Kent Beck", "Test Driven Development", 0.5),
                new CD("Pink Floyd", "Dark Side of the Moon", 1973),
                new CD("Wigwam", "Nuclear Nightclub", 1975),
                new CD("Rendezvous Park", "Closer to Being Here", 2012) };

        for (Packable item : items) {
            System.out.println(item);
        }
    }
}

interface Packable {
    double weight();
}

class Book implements Packable {
    private String author;
    private String title;
    private double weight;

    public Book(String author, String title, double weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return author + ": " + title;
    }
}

class CD implements Packable {
    private String artist;
    private String name;
    private int year;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }

    public double weight() {
        return 0.1;
    }

    @Override

    public String toString() {
        return artist + ": " + name + " (" + year + ")";
    }
}