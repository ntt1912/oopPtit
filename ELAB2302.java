import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private static int totalStudents = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudents++;
    }

    public void display() {
        if (age >= 18) {
            System.out.println(name);
        }
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}

public class ELAB2302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            if (name.isEmpty()) break;
            int age = Integer.parseInt(scanner.nextLine());
            students.add(new Student(name, age));
        }

        for (Student student : students) {
            student.display();
        }

        System.out.println(Student.getTotalStudents());
    }
}