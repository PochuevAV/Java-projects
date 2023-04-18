package com.mine.openapi_lesson.model;

public class Loco {
    private String mark;
    private Integer number;

    public Loco() {
    }

    public Loco(String mark, Integer number) {
        this.mark = mark;
        this.number = number;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Loco{" +
                "mark='" + mark + '\'' +
                ", number=" + number +
                '}';
    }
    public void copy (Loco loco){
        mark = loco.getMark();
        number = loco.getNumber();
    }
}
