import java.util.Scanner;

public class EXCEPTION003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            String s = sc.nextLine();
            hasVowels(s);
        }
    }
    public static void hasVowels(String s){
        try{
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                    throw new Exception();
                }
            }
            System.out.println("String not contain vowels");
        }
        catch (Exception e){
            System.out.println("String has vowels");
        }
    }
}

