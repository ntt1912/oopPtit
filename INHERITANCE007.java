import java.util.ArrayList;
import java.util.Scanner;

public class INHERITANCE007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numQuestions = Integer.parseInt(sc.nextLine());
        ArrayList<TestQuestion> ans = new ArrayList<>();

        for (int i = 0; i < numQuestions; i++) {
            char questionType = sc.nextLine().charAt(0);
            TestQuestion question;
            if (questionType == 'e') {
                question = new Essay();
            } 
            else {
                question = new MultChoice();
            }
            question.readQuestion(sc);
            ans.add(question);
        }

        System.out.println(numQuestions);
        for (TestQuestion question : ans) 
            System.out.println(question);
    }
}

abstract class TestQuestion {
    protected String questionText;
    protected abstract void readQuestion(Scanner sc);
}

class Essay extends TestQuestion {
    private int save;
    protected void readQuestion(Scanner sc) {
        this.save = sc.nextInt();
        sc.nextLine();
        this.questionText = sc.nextLine();
    }

    @Override
    public String toString() {
        return "e\n" + save + "\n" + questionText;
    }
}

class MultChoice extends TestQuestion {
    private ArrayList<String> choices = new ArrayList<>();

    @Override
    protected void readQuestion(Scanner sc) {
        int numChoices = sc.nextInt();
        sc.nextLine(); 
        this.questionText = sc.nextLine();
        for (int i = 0; i < numChoices; i++) {
            choices.add(sc.nextLine());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("m\n").append(choices.size()).append( "\n").append(questionText).append( "\n");
        for (String choice : choices) {
            sb.append(choice).append("\n");
        }
        return sb.toString().trim(); 
    }
}
