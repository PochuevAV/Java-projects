package com.company;

import java.io.*;

public class Main {
    public static boolean num(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите путь до файла 1:");
        FileReader file1 = new FileReader(reader.readLine());
        System.out.println("Введите путь до файла 2:");
        FileWriter file2 = new FileWriter(reader.readLine());

        String str = "";

        while (file1.ready()) {
            char text1 = (char) file1.read();
            str += String.valueOf(text1).toLowerCase();
        }
        str = str.replaceAll("\\p{Punct}", " ");
        str = str.replaceAll("\n", " ");
        String[] mas = str.split(" ");

        for (String s : mas) {
            s = s.trim();

            if (num(s)) {
                file2.write(s + " ");
            }

        }
        reader.close();
        file1.close();
        file2.close();
    }
}