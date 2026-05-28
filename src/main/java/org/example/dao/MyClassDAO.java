package org.example.dao;

import jakarta.persistence.EntityManager;
import org.example.model.MyClass;



public interface MyClassDAO extends DAO<MyClass>{

    EntityManager getEntityManager();
}
