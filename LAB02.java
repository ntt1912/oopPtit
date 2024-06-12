import java.util.Scanner;

public class LAB02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Đọc giá trị đầu tiên và kiểm tra xem có phải là số nguyên hay không
            String firstValue = scanner.nextLine().trim();
            if (firstValue.isEmpty() || !firstValue.matches("-?\\d+")) { // Kiểm tra xem firstValue có phải là số nguyên hợp lệ hay không
                throw new NumberFormatException("Invalid format for the first input line");
            }

            // Đọc dòng thứ hai và kiểm tra định dạng
            String secondInput = scanner.nextLine().trim();
            if (!secondInput.startsWith("Integer = \"") || !secondInput.endsWith("\"")) {
                throw new IllegalArgumentException("Invalid format for the second input line");
            }

            // Trích xuất giá trị bên trong dấu ngoặc kép
            String[] parts = secondInput.split("=");
            if (parts.length != 2) {
                throw new IllegalArgumentException("Invalid format for the second input line");
            }
            String secondValue = parts[1].trim().replace("\"", "");

            // Kiểm tra xem secondValue có phải là số nguyên hay không
            if (secondValue.isEmpty() || !secondValue.matches("-?\\d+")) { // Kiểm tra xem secondValue có phải là số nguyên hợp lệ hay không
                throw new NumberFormatException("Invalid format for the second input line");
            }

            // Chuyển đổi giá trị về kiểu số nguyên
            int firstValueInt = Integer.parseInt(firstValue);
            int secondValueInt = Integer.parseInt(secondValue);

            // So sánh hai giá trị và in ra kết quả
            if (firstValueInt == secondValueInt) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } catch (NumberFormatException e) {
            System.out.println("false");
        } catch (IllegalArgumentException e) {
            System.out.println("false");
        } catch (Exception e) {
            System.out.println("false");
        } finally {
            scanner.close();
        }
    }
}
