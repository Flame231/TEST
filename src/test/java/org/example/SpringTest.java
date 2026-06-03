package org.example;

import org.example.springHibernate.*;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SpringTest {
    @Test
    public void testGetEntity() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("springConfig1.xml");
        Department department = Department.builder().departmentName("123").build();
        Employee employee = Employee.builder()
                .firstName("451!!!")
                .lastName("45!!!")
                .date(LocalDateTime.parse("1997-07-21 08:54:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                .employeeDetail(null)
                .department(department)
                .meetings(null)
                .build();

        EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

        EmployeeService employeeService = context.getBean(EmployeeService.class);
        employeeService.addEmployee(employee);
        Assert.assertEquals((2), (long) employeeService.get(1).getId());
    }
}
