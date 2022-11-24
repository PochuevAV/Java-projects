package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество фигур: ");
        int N = sc.nextInt();
        System.out.println("Список фигур: ");
        System.out.println("--------------------------------");
        System.out.println("1 - круг");
        System.out.println("2 - квадрат");
        System.out.println("3 - прямоугольный треугольник");
        System.out.println("--------------------------------");
        int[] Area = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Выберите фигуру: ");
            int a = sc.nextInt();
            Area[i] = a;
        }

        for (int j = 0; j < N; j++) {
            Area area;
            if (Area[j] == 1) {
                area = new Circle();
                System.out.println("Введите радиус круга:");
                double n1 = sc.nextDouble();
                System.out.println("Площадь круга:");
                area.calculateArea(n1, 0);
            } else if (Area[j] == 2) {
                area = new Square();
                System.out.println("Введите длинну стороны квадрата:");
                double n1 = sc.nextDouble();
                System.out.println("Площадь квадрата:");
                area.calculateArea(n1, 0);
            } else if (Area[j] == 3) {
                area = new Triangle();
                System.out.println("Введите первый катет:");
                double n1 = sc.nextDouble();
                System.out.println("Введите второй катет:");
                double n2 = sc.nextDouble();
                System.out.println("Площадь прямоугольного треугольника:");
                area.calculateArea(n1, n2);
            }
        }
    }
}