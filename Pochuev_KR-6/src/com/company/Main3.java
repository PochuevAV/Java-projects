package com.company;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Задание 3");
        System.out.println("Введите номер телефона: ");
        int number = sc.nextInt();
        System.out.println("Введите имя звонящего: ");
        String name = scan.nextLine();
        System.out.println();
        System.out.println("Введите модель: ");
        int model = sc.nextInt();
        System.out.println("Введите вес: ");
        int weight = sc.nextInt();
        Phone phone = new Phone(number, model, weight);
        phone.receiveCall(name);
        phone.receiveCall2(name, number);
        Phone IPhone = new Phone();
        System.out.println("Введите номер телефона IPhone: ");
        int number1 = sc.nextInt();
        IPhone.number = number1;
        System.out.println("Введите модель IPhone: ");
        int model1 = sc.nextInt();
        IPhone.model = model1;
        System.out.println("Введите вес IPhone: ");
        int weight1 = sc.nextInt();
        IPhone.weight = weight1;

        Phone Xiaomi = new Phone();
        System.out.println("Введите номер телефона Xiaomi: ");
        int number2 = sc.nextInt();
        Xiaomi.number = number2;
        System.out.println("Введите модель Xiaomi: ");
        int model2 = sc.nextInt();
        Xiaomi.model = model2;
        System.out.println("Введите вес Xiaomi: ");
        int weight2 = sc.nextInt();
        Xiaomi.weight = weight2;

        Phone Sony = new Phone();
        System.out.println("Введите номер телефона Sony: ");
        int number3 = sc.nextInt();
        Sony.number = number3;
        System.out.println("Введите модель Sony: ");
        int model3 = sc.nextInt();
        Sony.model = model3;
        System.out.println("Введите вес Sony: ");
        int weight3 = sc.nextInt();
        Sony.weight = weight3;

        IPhone.getNumber();
        Xiaomi.getNumber();
        Sony.getNumber();

        System.out.println("IPhone: number " + IPhone.number + " model " + IPhone.model + " weight " + IPhone.weight);
        System.out.println("Xiaomi: number " + Xiaomi.number + " model " + Xiaomi.model + " weight " + Xiaomi.weight);
        System.out.println("Sony: number " + Sony.number + " model " + Sony.model + " weight " + Sony.weight);
        phone.sendMessage(number1, number2, number3);
    }
}
