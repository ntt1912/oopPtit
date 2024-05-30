import java.util.Scanner;

public class BASIC011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            String[] arr = sc.nextLine().split(" ");
            System.out.println(mingap(arr));
        }
    }
    public static int mingap(String [] arr){
        if (arr.length < 2) {
            return 0; 
        }
        int [] intArr = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }
        int min = intArr[1]-intArr[0];
        for (int i=0; i<intArr.length-1; i++){
            if (intArr[i+1]-intArr[i]<min){
                min = intArr[i+1]-intArr[i];
            }
        }
        return min;
    }
}
