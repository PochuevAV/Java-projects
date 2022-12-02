package Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача 1");
        System.out.println("-------------------");
        System.out.println("Введите номер месяца");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println(Month.January.getName());
                break;
            case 2:
                System.out.println(Month.February.getName());
                break;
            case 3:
                System.out.println(Month.March.getName());
                break;
            case 4:
                System.out.println(Month.April.getName());
                break;
            case 5:
                System.out.println(Month.May.getName());
                break;
            case 6:
                System.out.println(Month.June.getName());
                break;
            case 7:
                System.out.println(Month.July.getName());
                break;
            case 8:
                System.out.println(Month.August.getName());
                break;
            case 9:
                System.out.println(Month.September.getName());
                break;
            case 10:
                System.out.println(Month.October.getName());
                break;
            case 11:
                System.out.println(Month.November.getName());
                break;
            case 12:
                System.out.println(Month.December.getName());
                break;
            default:
                System.out.println("Введеный номер не соответствует ни одному месяцу");
        }
    }
}


