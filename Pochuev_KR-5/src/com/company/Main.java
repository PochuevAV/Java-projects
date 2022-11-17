package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Task_1();
        System.out.println(" ");
        Task_2();
        System.out.println(" ");
        Task_3();
    }

        private static void Task_1() {
        System.out.println("Задача 1 - Human ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String sname = scanner.nextLine();
        System.out.println("Введите год рождения: ");
        int ThisYear = 2022;
        int year = scanner.nextInt();
        Human human = new Human(name, sname, year);
        System.out.println("Имя: " + human.name );
        System.out.println("Фамилия: " + human.sname);
        System.out.println("Год рождения: " + human.year );
        System.out.println("Возраст: " + (ThisYear- human.year));
    }
    private static void Task_2() {
        System.out.println("Задача 2 - Прямоугольный треугольник ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну первого катета: ");
        double cat1 = scanner.nextInt();
        System.out.println("Введите длинну второго катета: ");
        double cat2 = scanner.nextInt();
        double hip = (Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2)));
        RightTriangle rightTriangle = new RightTriangle(cat1, cat2 , hip);
        System.out.print("Длинна гиптенузы равна: " + rightTriangle.hypotenuse);


}
    private static void Task_3() {
        System.out.println("Задача 3 - Потенциальна энергия ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту: ");
        double h = scanner.nextInt();
        System.out.println("Введите массу: ");
        double m = scanner.nextInt();
        double g = 9.8;
        PotentialEnergy e = new PotentialEnergy(h, m);
        e.Energy();

    }

}