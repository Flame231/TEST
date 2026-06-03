package org.example.springHibernate;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class EmployeeServiceImpl extends
        BaseService<Employee> implements EmployeeService {
    @Override
    public void addEmployee(Employee employee) {
        add(employee);
    }
}

