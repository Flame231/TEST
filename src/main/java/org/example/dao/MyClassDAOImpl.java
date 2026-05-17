package org.example.dao;

import org.example.model.MyClass;

public class MyClassDAOImpl extends DAOImpl<MyClass> implements MyClassDAO {
    public MyClassDAOImpl() {
        super(MyClass.class);
    }
}
