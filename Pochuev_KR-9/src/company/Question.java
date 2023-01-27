package company;
import java.util.Arrays;
public class Question {
    public String question;
    private byte rightAnswerNumber;
    private String[] answers;

    public Question(String question, String[] answers, byte rightAnswerNumber) {
        this.question = question;
        this.rightAnswerNumber = rightAnswerNumber;
        this.answers = answers;
    }

    public byte getRightAnswerNumber() {
        return rightAnswerNumber;
    }

    @Override
    public String toString() {
        return question +
                "\n Варианты ответов: " + "\n" + Arrays.toString(answers) +"\n Ваш ответ: " ;
    }}