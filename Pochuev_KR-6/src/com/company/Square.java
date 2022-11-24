package com.company;

public class Square implements Area {
    @Override
    public void calculateArea(double num1, double num2) {
        System.out.println(Math.pow(num1, 2));
    }
}

