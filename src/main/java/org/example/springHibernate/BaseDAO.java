package org.example.springHibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class BaseDAO<T> implements DAO<T> {
    Class<T> clazz;
    @Autowired
    @PersistenceContext
    @Getter
    private EntityManager em;

    @Override
    public T add(T t) {
        getEm().persist(t);
        return t;
    }

    @Override
    public T get(Serializable id) {
        return getEm().find(clazz, id);
    }

    @Override
    public T update(T t) {
        getEm().merge(t);
        return t;
    }

    @Override
    public void delete(Serializable id) {
        T t = getEm().find(clazz, id);
        getEm().remove(t);
    }

}

