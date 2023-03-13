package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Введите номер автомобиля: ");
        car.setCar_number(sc.nextLine());
        System.out.println("Введите дату проезда: ");
        car.setPassage_date(sc.nextLine());
        CarDAO carDAO = new CarDAO();
        carDAO.create(car);

    }

}
