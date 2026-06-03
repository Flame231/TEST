package org.example.springHibernate;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService extends IService<Employee> {
    void addEmployee(Employee employee);
}
