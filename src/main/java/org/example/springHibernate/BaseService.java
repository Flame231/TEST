package org.example.springHibernate;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.io.Serializable;

public class BaseService<T> implements IService<T> {
    @Autowired
    private DAO<T> baseDAO;

    @Override
    public T add(T t) {
        return baseDAO.add(t);
    }

    @Override
    public T update(T t) {
        return null;
    }

    @Override
    public T get(Serializable id) {
        return baseDAO.get(id);
    }

    @Override
    public void delete(Serializable id) {
        baseDAO.delete(id);
    }
}

