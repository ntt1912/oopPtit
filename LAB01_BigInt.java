import java.util.Scanner;

public class LAB01_BigInt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            String a = sc.next();
            String op = sc.next();
            String b = sc.next();
            java.math.BigInteger bigA = new java.math.BigInteger(a);
            java.math.BigInteger bigB = new java.math.BigInteger(b);
            if (op.equals("+")){
                System.out.println(bigA.add(bigB));
            }
            else if (op.equals("-")){
                System.out.println(bigA.subtract(bigB));
            }
            else if (op.equals("*")){
                System.out.println(bigA.multiply(bigB));
            }
        }
    }
}