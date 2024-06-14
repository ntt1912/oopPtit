import java.io.IOException;
import java.util.Scanner;

public class ELAB2306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            MyMethods m = new MyMethods();
        if(n == 0) m.m(1);
        else if(n == 1) m.m(0);
        else m.m(2);
    }
}

class MyMethods {
    public static void m(int x) {
        try {
            m2(x);
            System.out.println(1);
        }  catch (IOException e) {
            System.out.println(2);
        }   catch (ArithmeticException e) {
            System.out.println(3);
        }
    }

    public static void m2(int x) throws IOException {
        System.out.println(4);
        if (x == 1)
            throw new IOException();
        if (x == 0)
            throw new ArithmeticException();
        System.out.println(5);
    }
}