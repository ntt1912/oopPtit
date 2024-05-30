import java.util.Scanner;

public class OBEJCT_REFERENCES001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] song1 = sc.nextLine().split(" ");
            String[] song2 = sc.nextLine().split(" ");
            Song s1 = new Song(song1[0], song1[1], Integer.parseInt(song1[2]));
            Song s2 = new Song(song2[0], song2[1], Integer.parseInt(song2[2]));
            System.out.println(s1.equals(s2));
    }
}
}

class Song{
    private String name;
    private String author;
    private int duration;

    public Song(String name, String author, int duration){
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

    public boolean equals (Object obj){
        if (obj instanceof Song){
            Song song = (Song) obj;
            return this.name.equals(song.name) && this.author.equals(song.author) && this.duration == song.duration;
        }
        return false;
    }
}
