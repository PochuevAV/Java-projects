package org.example.DAO;

import org.example.model.User;

public interface User_DAO {


    User getById(int id);

    void delete(int id);

    void create(User user);

    void update1(int id, String Name);

    void update2(int id, String Surname);

    void update3(int id, String Lastname);

    void update4(int id, String Jobtitle);

    void update5(int id, int Salary);
}