import java.util.Map;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;

public class COLLECTION003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int testCases = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < testCases; i++) {
                String[] data = scanner.nextLine().split(" ");
                Map<String, Integer> map = new HashMap<>();
                for (int j = 0; j < data.length; j += 2) {
                    map.put(data[j], Integer.parseInt(data[j + 1]));
                }
                System.out.println(rarest(map));
            }
    }
    public static int rarest( Map<String, Integer> map ){
        Map<Integer, Integer> count = new HashMap<>();
        for (int value : map.values()){
            count.put(value, count.getOrDefault(value, 0) + 1);
        }
        int minCount = Collections.min(count.values());
        int minAge = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (count.get(entry.getValue()) == minCount){
                minAge = Math.min(minAge, entry.getValue());
            }
        }
        return minAge;
}
}