package Task_2;

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Задача 2");
        System.out.println("-------------------");
        System.out.println("Введите максимальную сумму на покупку автомобиля (руб.): ");
        Scanner scanner = new Scanner(System.in);
        int cash = scanner.nextInt();
        Cars car1 = Cars.valueOf("Car1");
        Cars car2 = Cars.valueOf("Car2");
        Cars car3 = Cars.valueOf("Car3");
        Cars car4 = Cars.valueOf("Car4");
        Cars car5 = Cars.valueOf("Car5");
        Cars car6 = Cars.valueOf("Car6");
        Cars car7 = Cars.valueOf("Car7");
        Cars[] kor = {car1, car2, car3, car4, car5, car6, car7};
        System.out.println("Автомобили, доступные к покупке: ");
        System.out.println("-----------------------------");
        Arrays.sort(kor, new Comparator<Cars>() {
            @Override
            public int compare(Cars first, Cars second) {
                if (first.getSpeed() != second.getSpeed()) {
                    return Integer.parseInt(second.getSpeed()) - Integer.parseInt(first.getSpeed());
                }
                return first.getMark().compareTo(second.getMark());
            }
        });

        for (int i = 0; i < 7; i++) {
            if (cash >= Integer.parseInt(kor[i].price)) {

                switch (kor[i].mark) {
                    case "Lada":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.Lada.getName() + ")");
                        break;
                    case "KIA":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.KIA.getName() + ")");
                        break;
                    case "Nissan":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.Nissan.getName() + ")");
                        break;
                    case "Lexus":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.Lexus.getName() + ")");
                        break;
                    case "Tesla":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.Tesla.getName() + ")");
                        break;
                    case "VAZ":
                        System.out.println("Марка: " + (kor[i].mark) + " (" + MarkAndColor.VAZ.getName() + ")");
                        break;
                }
                System.out.println("Модель: " + (kor[i].model));
                System.out.println("Цена: " + (kor[i].price) + " руб.");
                System.out.println("Скорость: " + (kor[i].speed) + " км/ч");
                switch (kor[i].color) {
                    case "Silver":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.Silver.getName() + ")");
                        break;
                    case "LimeGreen":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.LimeGreen.getName() + ")");
                        break;
                    case "Black":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.Black.getName() + ")");
                        break;
                    case "Brown":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.Brown.getName() + ")");
                        break;
                    case "Burgundi":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.Burgundi.getName() + ")");
                        break;
                    case "WhiteAndBlack":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.WhiteAndBlack.getName() + ")");
                        break;
                    case "Red":
                        System.out.println("Цвет: " + (kor[i].color) + " (" + MarkAndColor.Red.getName() + ")");
                        break;
                }
                System.out.println("________________________________");
            }
        }
        if (cash < Integer.parseInt(car7.price)){
            System.out.println("Нехватка средств для покупки");
        }
    }
}

