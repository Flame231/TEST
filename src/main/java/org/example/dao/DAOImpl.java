package org.example.dao;

import org.example.JPAUtil;

import javax.persistence.EntityManager;
import java.io.Serializable;

public class DAOImpl<T> implements DAO<T> {

    private EntityManager entityManager = JPAUtil.getEm();

    public EntityManager getEntityManager() {
        return entityManager;
    }

    Class<T> tClass;

    public DAOImpl(Class<T> tClass) {
        this.tClass = tClass;
    }

    @Override
    public void save(T t) {
        begin();
        entityManager.persist(t);
        commit();
    }

    @Override
    public T get(Serializable id) {
        return entityManager.find(tClass, id);
    }

    @Override
    public void update(T t) {

        entityManager.merge(t);
    }

    @Override
    public void delete(Serializable id) {
        begin();
        entityManager.remove(id);
        commit();
    }

    @Override
    public void begin() {
        entityManager.getTransaction().begin();
    }

    @Override
    public void commit() {
        entityManager.getTransaction().commit();

    }
}
