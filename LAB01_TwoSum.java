import java.util.HashMap;
import java.util.Scanner;

public class LAB01_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[sc.nextInt()];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            int target = sc.nextInt();
            System.out.println(twoSum(arr, target));
        }
    }

    public static String twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return map.get(complement) + " " + i;
            }
            map.put(nums[i], i);
        }
        return "Not found";
    }
}
