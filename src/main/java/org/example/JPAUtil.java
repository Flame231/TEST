package org.example;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("JPAProvider");

    private static ThreadLocal<EntityManager> threadLocal = new ThreadLocal<>();

    public static EntityManager getEm() {
        if (threadLocal.get() == null) {

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            threadLocal.set(entityManager);
            return threadLocal.get();
        }
        return threadLocal.get();
    }

    public static void close() {
        getEm().close();
    }
}
