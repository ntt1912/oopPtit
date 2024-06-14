import java.util.Scanner;

public class STRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            System.out.println(findLongestWord(s));
        }
    }
    static String findLongestWord(String s){
        String[] words = s.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() == longestWord.length()) {
                    longestWord = word;
            }
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
