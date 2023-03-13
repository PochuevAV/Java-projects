package org.example;

import javax.persistence.EntityManager;

public class CarDAO {
    public void create(Car car) {
        EntityManager entityManager = DbConnector.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(car);
        entityManager.getTransaction().commit();
        System.out.println("Запись проезда создана");
    }
}
