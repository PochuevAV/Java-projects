package com.company;

public class City {
    public String name;
    public double population;

    public City(String name, double population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public double getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", population: '" + population;
    }
}
