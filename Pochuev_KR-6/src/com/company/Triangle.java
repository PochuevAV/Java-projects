package com.company;

public class Triangle implements Area {
    @Override
    public void calculateArea(double num1, double num2) {
        System.out.println(0.5 * num1 * num2);
    }
}
