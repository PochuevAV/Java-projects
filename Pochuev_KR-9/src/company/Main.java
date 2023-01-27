package company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("=====ВИКТОРИНА=====\nВОПРОСЫ:");
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("Что такое конструктор у класса?",
                new String[]{"1. метод, который вызывается при создании экземпляра объекта", "\n2. специальная переменная класса", "\n3. объект класса;"}, (byte) 1));
        questions.add(new Question("Если у класса в теле не объявлен конструктор тогда",
                new String[]{"1. у данного класса автоматически создается конструктор по умолчанию", "\n2. нельзя создать объект этого класса", "\n3. код не скомпилируется"}, (byte) 2));
        questions.add(new Question("Сколько конструкторов может быть у класса?",
                new String[]{"1. неограниченное количество", "\n2. только один", "\n3. не более пяти"}, (byte) 1));
        questions.add(new Question("Переменные в классе инициализируется:",
                new String[]{"1. порядке их объявления", "\n2. только один", "\n3. в случайном порядке"}, (byte) 1));
        questions.add(new Question("Для каких целей служат методы get и set?",
                new String[]{"1. чтобы другие классы могли корректно получать или менять данные внутри объектов вашего класса", "\n2. это специальные конструкторы класса"}, (byte) 2));
        final Scanner sc = new Scanner(System.in);
        int[] rightAnswersCounter = new int[1];
        String[] wrAn = new String[1];
        wrAn[0] = "";
        questions.forEach(question -> {
            System.out.println(question);
            if (sc.nextByte() == question.getRightAnswerNumber())
                rightAnswersCounter[0]++;
            else{ wrAn[0] += question.question + "; "; }
        });

        System.out.println("Вы ответили на " + rightAnswersCounter[0] + " вопросов из " + questions.size());
        if (wrAn[0] != ""){
            System.out.println("Вы ошиблись в следующих вопросах: " + wrAn[0]);}
    }}
