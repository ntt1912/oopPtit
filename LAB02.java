import java.util.Scanner;

public class LAB02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            try {
                String a = sc.nextLine();
                String b = sc.nextLine();
                String[] s = b.split("\"");
                System.out.println(a.equals(s[1]));
            }
            catch (Exception e) {
                break;
            }
        }
        sc.close();
    }
}