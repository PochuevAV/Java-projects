package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.println("Выберите фигуру: ");
        System.out.println("1 - круг");
        System.out.println("2 - квадрат");
        System.out.println("3 - прямоугольный треугольник");
        System.out.println("--------------------------------");
        int fig = sc.nextInt();

        Area area;
        if (fig == 1) {
            area = new Circle();
            System.out.println("Введите радиус:");
            double n1 = sc.nextDouble();
            System.out.println("Площадь круга:");
            area.calculateArea(n1, 0);
        } else if (fig == 2) {
            area = new Square();
            System.out.println("Введите длинну стороны:");
            double n1 = sc.nextDouble();
            System.out.println("Площадь квадрата:");
            area.calculateArea(n1, 0);
        } else if (fig == 3) {
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

