package org.example.dao;

import org.example.model.MyClass;

import javax.persistence.EntityManager;

public interface MyClassDAO extends DAO<MyClass>{

    EntityManager getEntityManager();
}
