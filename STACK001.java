import java.util.Scanner;
import java.util.Stack;

public class STACK001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Stack<Integer> s = new Stack<>();
            String[] input = sc.nextLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                s.push(Integer.parseInt(input[j]));
            }
            compressDuplicates(s);
            System.out.println("");
        }
    }

    // compressDuplicates(Stack<Integer> s)
    public static void compressDuplicates(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            int n = s.pop();
            int count = 1;
            while (!s.isEmpty() && s.peek() == n) {
                s.pop();
                count++;
            }
            temp.push(n);
            temp.push(count);
        }
        while (!temp.isEmpty()) {
            if (temp.size() > 1) {
                System.out.print(temp.pop() + " ");
            } else {
                System.out.print(temp.pop());
            }        
        }

    }
}
