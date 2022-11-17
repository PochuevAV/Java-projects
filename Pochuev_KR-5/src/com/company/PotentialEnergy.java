package com.company;

public class PotentialEnergy {
    private double h;
    private double m;
    static double g = 9.8;
    double ep;

    public double getH(){
        return h;
    }
    public void setH(double h){
        this.h = h;
    }

    public double getM(){
        return m;
    }
    public void setM(double m){
        this.m = m;
    }

    PotentialEnergy(double h, double m){
        this.h = h;
        this.m = m;
        this.ep = (h*m*g);
    }
    void Energy(){
        System.out.println("Потенциальная энергия равна: " + ep);
    }



}
