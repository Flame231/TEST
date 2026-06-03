package org.example.springHibernate;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl extends BaseDAO<Employee> implements EmployeeDAO {
    public EmployeeDAOImpl() {
        super();
        clazz = Employee.class;
    }
    @Override
    public List<Employee> getEmployee() {
        return getEm().createQuery("from Employee").getResultList();
    }
}

