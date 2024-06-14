import java.util.Scanner;

public class STRING_005 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            String s = sc.nextLine();
            System.out.println(isPangram(s));
        }
    
    }
    public static boolean isPangram(String s) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}

