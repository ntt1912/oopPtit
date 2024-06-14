import java.util.Scanner;

public class EXCEPTION002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String fileName = sc.nextLine();
            CheckFileExtension(fileName);
        }
    }

    static void CheckFileExtension(String fileName) {
        try {
            if (fileName == null || fileName.isEmpty()) {
                throw new NotJavaFileException("File name is empty or null. Mark is -1");
            }

            if (fileName.endsWith(".java")) {
                System.out.println("1");;
            } else {
                System.out.println("0");
            }
        } catch (NotJavaFileException e) {
            System.out.println("Not java file exception.Mark is -1");;
        }
    }

    static class NotJavaFileException extends RuntimeException {
        public NotJavaFileException(String message) {
            super(message);
        }
    }
}