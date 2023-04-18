package com.mine.openapi_lesson.model;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final List<Loco> locoList = new ArrayList<>();

    public Service() {
        locoList.add(new Loco("Ласточка", 111));    // additions are just an example
        locoList.add(new Loco("ЭД9", 133));
        locoList.add(new Loco("Сапсан", 424));
        locoList.add(new Loco("Стрела", 777));
    }

    public List<Loco> getLocoList() {
        return locoList;
    }
    public void addLoco (Loco loco){
        locoList.add(loco);
    }
    public void editLoco (int id, Loco loco){
        locoList.get(id).copy(loco);
    }
    public void deleteLoco (int id){
        locoList.remove(id);
    }

}
