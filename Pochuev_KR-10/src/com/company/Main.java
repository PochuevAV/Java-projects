package com.company;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class Main {


    public static void main(String[] args) {
        System.out.println("УНИВЕРСИТЕТЫ");
        University un0 = new University("РУТ", 50, 3, 64);
        University un1 = new University("МФТИ", 30, 4, 50);
        University un2 = new University("МГУ", 45, 3, 69);
        University un3 = new University("ДВГУПС", 55, 1, 55);
        University un4 = new University("СПбГУ", 50, 2, 60);
        University un5 = new University("ВШЭ", 101, 5, 51);
        University un6 = new University("МГИМО", 100, 5, 50);

        HashSet<University> humanitiesUniversity = new HashSet<>();
        humanitiesUniversity.add(un5);
        humanitiesUniversity.add(un2);
        humanitiesUniversity.add(un4);
        humanitiesUniversity.add(un6);

        HashSet<University> technicalUniversity = new HashSet<>();
        technicalUniversity.add(un1);
        technicalUniversity.add(un3);
        technicalUniversity.add(un4);
        technicalUniversity.add(un0);
        technicalUniversity.add(un2);

        HashSet<University> AllUniversity = new HashSet<>();
        AllUniversity.add(un0);
        AllUniversity.add(un1);
        AllUniversity.add(un2);
        AllUniversity.add(un3);
        AllUniversity.add(un4);
        AllUniversity.add(un5);
        AllUniversity.add(un6);

        HashSet<University> SmeshUniversity = new HashSet<>();
        SmeshUniversity.add(un2);
        SmeshUniversity.add(un4);
        int teach_sr = 0;
        int exam_sr = 0;
        int st_sum = 0;
        System.out.println("Технические ВУЗы: ");
        for (University i : technicalUniversity) {
            int s = 0;
            int e = 0;
            int st = 0;
            System.out.println(i.name);

            s += i.teachers;
            teach_sr += s;

            e += i.examscore;
            exam_sr += e;
            st += i.students;
            st_sum += st;
        }
        System.out.println("Общее количество студентов: " + st_sum + " тыс. чел.");
        System.out.println("Среднее количество преподавателей: " + teach_sr / technicalUniversity.size() + " тыс. чел.");
        System.out.println("Средний балл: " + exam_sr / technicalUniversity.size() + "\n" + "======================");
        System.out.println("Гуманитарные ВУЗы: ");
        teach_sr = 0;
        exam_sr = 0;
        st_sum = 0;
        for (University q : humanitiesUniversity) {
            int s = 0;
            int e = 0;
            int st = 0;
            System.out.println(q.name);
            s += q.teachers;
            teach_sr += s;

            e += q.examscore;
            exam_sr += e;

            st += q.students;
            st_sum += st;
        }
        System.out.println("Общее количество студентов: " + st_sum + " тыс. чел.");
        System.out.println("Среднее количество преподавателей: " + teach_sr / humanitiesUniversity.size() + " " + "тыс. чел.");
        System.out.println("Средний балл: " + exam_sr / humanitiesUniversity.size() + "\n" + "======================");
        System.out.println("Все ВУЗы: ");
        teach_sr = 0;
        exam_sr = 0;
        st_sum = 0;
        for (University w : AllUniversity) {
            int s = 0;
            int e = 0;
            int st = 0;
            System.out.println(w.name);

            s += w.teachers;
            teach_sr += s;

            e += w.examscore;
            exam_sr += e;
            st += w.students;
            st_sum += st;
        }
        System.out.println("Общее количество студентов: " + st_sum + " тыс. чел.");
        System.out.println("Среднее количество преподавателей: " + teach_sr / AllUniversity.size() + " " + "тыс. чел.");
        System.out.println("Средний балл: " + exam_sr / AllUniversity.size() + "\n" + "======================");
        System.out.println("Смешанные ВУЗы: ");
        teach_sr = 0;
        exam_sr = 0;
        st_sum = 0;

        for (University r : SmeshUniversity) {
            int s = 0;
            int e = 0;
            int st = 0;
            System.out.println(r.name);

            s += r.teachers;
            teach_sr += s;

            e += r.examscore;
            exam_sr += e;
            st += r.students;
            st_sum += st;
        }
        System.out.println("Общее количество студентов: " + st_sum + " тыс. чел.");
        System.out.println("Среднее количество преподавателей: " + teach_sr / SmeshUniversity.size() + " " + "тыс. чел.");
        System.out.println("Средний балл: " + exam_sr / SmeshUniversity.size() + "\n" + "======================");

        System.out.println("УНИВЕРСИТЕТЫ И ГОРОДА");
        City cit1 = new City("Москва", 13);
        City cit2 = new City("Санкт-Петербург", 5.6);
        City cit3 = new City("Хабаровск", 0.7);
        City cit4 = new City("Долгопрудный", 0.12);

        Map<University, City> city = new HashMap<University, City>();
        city.put(un0, cit1);
        city.put(un1, cit4);
        city.put(un2, cit1);
        city.put(un3, cit3);
        city.put(un4, cit2);
        city.put(un5, cit1);
        city.put(un6, cit1);
        System.out.println("Количество жителей на одного студента:" + "\n" + "РУТ: " + Math.round(cit1.population * 1000000 / un0.students) + " человек");
        System.out.println("МФТИ: " + Math.round(cit4.population * 1000000 / un1.students) + " человек");
        System.out.println("МГУ: " + Math.round(cit1.population * 1000000 / un2.students) + " человек");
        System.out.println("ДВГУПС: " + Math.round(cit3.population * 1000000 / un3.students) + " человек");
        System.out.println("СПбГУ: " + Math.round(cit2.population * 1000000 / un4.students) + " человек");
        System.out.println("ВШЭ: " + Math.round(cit1.population * 1000000 / un5.students) + " человек");
        System.out.println("МГИМО: " + Math.round(cit1.population * 1000000 / un6.students) + " человек");

    }
}