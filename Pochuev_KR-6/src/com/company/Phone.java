package com.company;

public class Phone {
    public int number;
    public int model;
    public int weight;

    public Phone(int number, int model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name + " " + number);
    }

    void receiveCall2(String name, int numb) {               //Пункт и)
        numb = number;
        System.out.println("Звонит " + name + " " + numb);
    }

    void sendMessage(int number1, int number2, int number3) {
        System.out.println("Сообщение отправлено на номера: " + number1 + " " + number2 + " " + number3);
    }

}
