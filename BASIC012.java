    import java.util.Scanner;

    public class BASIC012 {
        public static void main(String[] args ){
            Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
            sc.nextLine();
            for (int i=0; i<n; i++){
                String[] arr = sc.nextLine().split(" ");
                int[] intArr = new int[arr.length];
                for (int j=0; j<arr.length; j++){
                    intArr[j]= Integer.parseInt(arr[j]);
                }
                System.out.println(longestSortedSequence(intArr));

            }
        }
        public static int longestSortedSequence(int[] arr){
            if (arr.length ==0){
                return 0;
            }
            int max =1;
            int count =1;
            for (int i=0; i<arr.length-1;i++){
                if(arr[i]<=arr[i+1]){
                    count++;
                    if (count>max){
                        max = count;
                    }
                }else
                    count =1;
            }
            return max;
        }
    }
