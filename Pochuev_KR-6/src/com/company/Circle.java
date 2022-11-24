package com.company;

public class Circle implements Area {

    @Override
    public void calculateArea(double num1, double num2) {
        System.out.println(3.14 * Math.pow(num1, 2));
    }
}
