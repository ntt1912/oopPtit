import java.util.ArrayList;
import java.util.Scanner;

public class COLLECTION002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            ArrayList<String> List = new ArrayList<>();
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                List.add(input[j]);
            }
            removeShorterStrings(List);
        }
    }

    public static void removeShorterStrings(ArrayList<String> List) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < List.size(); i++) {
            if (i == List.size() - 1) {
                temp.add(List.get(i));
            } else {
                if (List.get(i).length() > List.get(i + 1).length()) {
                    temp.add(List.get(i));
                } else if (List.get(i).length() < List.get(i + 1).length()) {
                    temp.add(List.get(i + 1));
                } else if (List.get(i).length() == List.get(i + 1).length()) {
                    temp.add(List.get(i+1));
                }
            }
        }
        String tempString = "";
        for (int i = 0; i < temp.size(); i++) {
            if (i == temp.size() - 1) {
                tempString += temp.get(i);
            } else {
                tempString += temp.get(i) + " ";
            }
        }
        System.out.println(tempString);

    }
}
