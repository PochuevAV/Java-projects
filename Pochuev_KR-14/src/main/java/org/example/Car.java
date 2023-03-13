package org.example;

import javax.persistence.*;

@Entity
@Table(name = "PASSAGE_OF_CAR")

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "CAR_NUMBER")
    private String car_number;
    @Column(name = "PASSAGE_NUMBER")
    private String passage_date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getPassage_date() {
        return passage_date;
    }

    public void setPassage_date(String passage_date) {
        this.passage_date = passage_date;
    }
}
