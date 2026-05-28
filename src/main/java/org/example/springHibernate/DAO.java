package org.example.springHibernate;

import java.io.Serializable;

public interface DAO<T> {
    T add(T t);

    T update(T t);

    T get(Serializable id);

    void delete(Serializable id);

}
