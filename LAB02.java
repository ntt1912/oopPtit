import java.math.BigInteger;
import java.util.Scanner;

public class LAB02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        int length1 = input1.length();
        int num1 = Integer.parseInt(input1);
        String [] input2 = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder(input2[2]);
        sb.deleteCharAt(0);
        sb.deleteCharAt(input2[2].length()-1);
        int num2 = Integer.parseInt(sb.toString());
        BigInteger bigInt1 = new BigInteger(input1);
        BigInteger bigInt2 = new BigInteger(sb.toString());
        System.out.println( num1==num2 );
    }
}
