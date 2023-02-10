package com.company;

public class University {
    public String name;
    public int students;
    public int teachers;
    public int examscore;

    public University(String name, int students, int teachers, int examscore) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
        this.examscore = examscore;


    }

    public String getName() {
        return name;
    }

    public int getStudents() {
        return students;
    }

    public int getTeachers() {
        return teachers;
    }

    public int getExamscore() {
        return examscore;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", Students: '" + students + '\'' +
                ", Teachers: " + teachers +
                ", Exam results: " + examscore;
    }
}
