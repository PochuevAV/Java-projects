package org.example;

import org.example.DAO.UserDAO;
import org.example.model.User;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        printMenu();
        Scanner commandScanner = new Scanner(System.in);
        String command = "";
        command = commandScanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "1":
                    create();
                    printMenu();
                    command = commandScanner.nextLine();
                    break;
                case "2":
                    getUser();
                    printMenu();
                    command = commandScanner.nextLine();
                    break;
                case "3":
                    deleteUser();
                    printMenu();
                    command = commandScanner.nextLine();
                    break;
                case "4":
                    reduction();
                    printMenu();
                    command = commandScanner.nextLine();
                    break;
                default:
                    System.out.println("Такого пункта в меню нет");
                    System.out.println("Введите команду");
                    command = commandScanner.nextLine();
            }
        }
    }

    private static void create() {
        User user = new User();
        System.out.println("Введите имя:");
        Scanner nameScanner = new Scanner(System.in);
        user.setName(nameScanner.nextLine());

        System.out.println("Введите фамилию:");
        Scanner surnameScanner = new Scanner(System.in);
        user.setSurname(surnameScanner.nextLine());

        System.out.println("Введите отчество:");
        Scanner lastnameScanner = new Scanner(System.in);
        user.setLastname(lastnameScanner.nextLine());

        System.out.println("Введите профессию:");
        Scanner jobScanner = new Scanner(System.in);
        user.setJobtitle(jobScanner.nextLine());

        System.out.println("Введите размер заработной платы(руб.):");
        Scanner salaryScanner = new Scanner(System.in);
        user.setSalary(salaryScanner.nextInt());

        System.out.println("Введите номер должности:");
        System.out.println("1 - junior" + "\n" + "2 - middle" + "\n" + "3 - senior");
        Scanner c = new Scanner(System.in);
        int cmd = c.nextInt();
        while (cmd != 0) {
            switch (cmd) {
                case 1:
                    user.setDepartment_id(cmd);
                    cmd = 0;
                    user.setDepartment("junior");
                    break;
                case 2:
                    user.setDepartment_id(cmd);
                    cmd = 0;
                    user.setDepartment("middle");
                    break;
                case 3:
                    user.setDepartment_id(cmd);
                    user.setDepartment("senior");
                    cmd = 0;
                    break;
                default:
                    System.out.println("Нет такой должности");
                    cmd = 0;

            }
        }

        UserDAO userDao = new UserDAO();
        userDao.create(user);
        System.out.println("Пользователь добавлен");
    }

    private static void getUser() {

        System.out.println("Введите id пользователя:");
        Scanner idScanner = new Scanner(System.in);
        int id = idScanner.nextInt();

        UserDAO userDao = new UserDAO();
        User user = userDao.getById(id);
        System.out.println("Найден пользователь: " + user);
    }

    private static void deleteUser() {

        System.out.println("Введите id:");
        Scanner idScanner = new Scanner(System.in);
        int id = idScanner.nextInt();
        UserDAO userDao = new UserDAO();
        userDao.delete(id);
        System.out.println("Пользователь удалён");
    }

    private static void printMenu() {
        System.out.println("Введите команду:");
        System.out.println("1) Добавить пользователя.");
        System.out.println("2) Получить пользователя.");
        System.out.println("3) Удалить пользователя.");
        System.out.println("4) Редактировать данные пользователя.");
        System.out.println("Для завершения введите 'end'.");
    }

    private static void reduction() throws SQLException {
        System.out.println("Введите команду: ");
        System.out.println("1) Редактировать имя пользователя.");
        System.out.println("2) Редактировать фамилию пользователя.");
        System.out.println("3) Редактировать отчество пользователя.");
        System.out.println("4) Редактировать профессию пользователя.");
        System.out.println("5) Редактировать заработную плату пользователя.");
        System.out.println("Для завершения введите 'end'.");
        Scanner command2Scanner = new Scanner(System.in);
        String command2 = "";
        command2 = command2Scanner.nextLine();
        while (!command2.equals("end")) {
            UserDAO userDAO = new UserDAO();
            switch (command2) {
                case "1":
                    System.out.println("Введите id:");
                    Scanner iddScanner = new Scanner(System.in);
                    int idd = iddScanner.nextInt();
                    System.out.println("Введите новое имя: ");
                    Scanner name2 = new Scanner(System.in);
                    userDAO.update1(idd, name2.nextLine());
                    System.out.println("Готово.");
                    command2 = command2Scanner.nextLine();
                    break;
                case "2":
                    System.out.println("Введите id:");
                    Scanner idd2Scanner = new Scanner(System.in);
                    int idd2 = idd2Scanner.nextInt();
                    System.out.println("Введите новую фамилию: ");
                    Scanner surname2 = new Scanner(System.in);
                    userDAO.update2(idd2, surname2.nextLine());
                    System.out.println("Готово.");
                    command2 = command2Scanner.nextLine();
                    break;
                case "3":
                    System.out.println("Введите id:");
                    Scanner idd3Scanner = new Scanner(System.in);
                    int idd3 = idd3Scanner.nextInt();
                    System.out.println("Введите новое отчество: ");
                    Scanner lastname2 = new Scanner(System.in);
                    userDAO.update3(idd3, lastname2.nextLine());
                    System.out.println("Готово.");
                    command2 = command2Scanner.nextLine();
                    break;
                case "4":
                    System.out.println("Введите id:");
                    Scanner idd4Scanner = new Scanner(System.in);
                    int idd4 = idd4Scanner.nextInt();
                    System.out.println("Введите новую профессию: ");
                    Scanner job2 = new Scanner(System.in);
                    userDAO.update4(idd4, job2.nextLine());
                    System.out.println("Готово.");
                    command2 = command2Scanner.nextLine();
                    break;
                case "5":
                    System.out.println("Введите id:");
                    Scanner idd7Scanner = new Scanner(System.in);
                    int idd5 = idd7Scanner.nextInt();
                    System.out.println("Введите новую заработную плату: ");
                    Scanner salary2 = new Scanner(System.in);
                    userDAO.update5(idd5, salary2.nextInt());
                    System.out.println("Готово.");
                    command2 = command2Scanner.nextLine();
                    break;
                default:
                    System.out.println("Такого пункта в меню нет" + "\n" + "Введите end для выхода.");
                    command2 = command2Scanner.nextLine();
            }
        }
    }
}



