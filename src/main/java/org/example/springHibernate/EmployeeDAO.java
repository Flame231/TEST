package org.example.springHibernate;

import java.util.List;

public interface EmployeeDAO extends DAO<Employee> {
    List<Employee> getEmployee();
}

