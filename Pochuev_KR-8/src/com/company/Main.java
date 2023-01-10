package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println("Подтвердите пароль");
        String confpass = scanner.nextLine();
        try {
            checkLogInInfo(login, password,confpass, "[\\w]{1,20}");
            System.out.println("Логин и пароль верны");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean checkLogInInfo(String login, String password,String confpass, String regex)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches(regex) | login.length() >= 20) {
            throw new WrongLoginException("Неверный логин");
        } else if (!password.matches(regex) | password.length() >= 20 | !password.matches(confpass)) {
            throw new WrongPasswordException("Неверный пароль");
        }
        return true;
    }
}
