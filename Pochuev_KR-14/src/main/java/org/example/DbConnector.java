package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnector {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-unit");
    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
