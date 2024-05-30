import java.util.Scanner;

public class BASIC010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int num= sc.nextInt();
            System.out.println(swapDigitsPairs(num));
        }
    }

    public static int swapDigitsPairs(int n) {
        int result = 0;
        int i = 0;
        while (n > 0) {
            int dig1 = n % 10;
            n /= 10;
            if(n!=0){
                int dig2 = n % 10;
                n /= 10;
                result += dig1 * Math.pow(10, i + 1) + dig2 * Math.pow(10, i);
                i += 2;
            }
            else result += dig1 * Math.pow(10, i);
       
        }
        return result;
    }
}
