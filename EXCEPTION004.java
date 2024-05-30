import java.util.Scanner;

public class EXCEPTION004{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n;i++){
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            Person person = new Person(name,age);
            person.printInfo();
        }
        sc.close();
    }
}
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void printInfo(){
            if (age < 0 || age > 120){
                System.out.println("Age is not valid");
            }
        	else{
            System.out.println("Name: " + name +"--Age:" + age);
            }
    }
}
